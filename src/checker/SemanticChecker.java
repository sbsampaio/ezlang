package checker;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import parser.*;
import typing.EZType;

import static typing.EZType.*;

public class SemanticChecker extends EZParserBaseVisitor<EZType> {

    private static class Entry {
        public String id;
        public EZType type;
        public int line;
    }

    private Map<String, Entry> symbolsTable = new LinkedHashMap<>();

    public void printSymbols() {
        System.out.println("Variables table:");
        int i = 0;
        for (Entry e : symbolsTable.values())
            System.out.printf("Entry %d -- name: %s, line: %d, type: %s\n",
                    i++, e.id, e.line, e.type.toString());

    }

    private Set<String> strings = new LinkedHashSet<>();

    public void printStrings() {
        System.out.println("Strings table:");
        int i = 0;
        for (String s : strings)
            System.out.printf("Entry %d -- '%s'\n", i++, s);
    }

    private EZType checkVar(Token token) {
        String id = token.getText();
        if (!symbolsTable.containsKey(id)) {
            System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", token.getLine(), id);
            System.exit(1);
        }
        return symbolsTable.get(id).type;
    }

    private void typeError(int line, String op, EZType left, EZType right) {
        System.out.printf("SEMANTIC ERROR (%d): incompatible types for operator '%s', LHS is '%s' and RHS is '%s'.\n",
                line, op, left.toString(), right.toString());
        System.exit(1);
    }

    private void checkAssign(int line, EZType left, EZType right) {
        if (left == BOOL_TYPE && right != BOOL_TYPE)
            typeError(line, ":=", left, right);
        if (left == STR_TYPE && right != STR_TYPE)
            typeError(line, ":=", left, right);
        if (left == INT_TYPE && right != INT_TYPE)
            typeError(line, ":=", left, right);
        if (left == REAL_TYPE && !(right == INT_TYPE || right == REAL_TYPE))
            typeError(line, ":=", left, right);
    }

    private void checkBoolExpr(int line, String cmd, EZType type) {
        if (type != BOOL_TYPE) {
            System.out.printf("SEMANTIC ERROR (%d): conditional expression in '%s' is '%s' instead of '%s'.\n",
                    line, cmd, type.toString(), BOOL_TYPE.toString());
            System.exit(1);
        }
    }

    @Override
    public EZType visitRead_stmt(EZParser.Read_stmtContext ctx) {
        checkVar(ctx.ID().getSymbol());
        return EZType.NO_TYPE;
    }

    @Override
    public EZType visitWrite_stmt(EZParser.Write_stmtContext ctx) {
        visit(ctx.expr());
        return EZType.NO_TYPE;
    }

    @Override
    public EZType visitAssign_stmt(EZParser.Assign_stmtContext ctx) {
        EZType exprType = visit(ctx.expr());
        Token idToken = ctx.ID().getSymbol();
        EZType idType = checkVar(idToken);
        checkAssign(idToken.getLine(), idType, exprType);
        return NO_TYPE;
    }

    @Override
    public EZType visitIf_stmt(EZParser.If_stmtContext ctx) {
        EZType exprType = visit(ctx.expr());
        checkBoolExpr(ctx.IF().getSymbol().getLine(), "if", exprType);
        return NO_TYPE;
    }

    @Override
    public EZType visitRepeat_stmt(EZParser.Repeat_stmtContext ctx) {
        EZType exprType = visit(ctx.expr());
        checkBoolExpr(ctx.UNTIL().getSymbol().getLine(), "repeat", exprType);
        return NO_TYPE;
    }

    @Override
    public EZType visitExprId(EZParser.ExprIdContext ctx) {
        return checkVar(ctx.ID().getSymbol());
    }

    @Override
    public EZType visitVar_decl(EZParser.Var_declContext ctx) {
        String id = ctx.ID().getSymbol().getText();
        int type = ctx.type_spec().start.getType();
        int line = ctx.type_spec().start.getLine();

        if (symbolsTable.containsKey(id)) {
            System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.", line, id,
                    symbolsTable.get(id).line);
            System.exit(1);
        } else {
            Entry e = new Entry();
            e.id = id;
            e.line = line;
            e.type = EZType.getVarType(type);
            symbolsTable.put(id, e);
        }
        visitChildren(ctx);
        return NO_TYPE;
    }

    @Override
    public EZType visitExprStrVal(EZParser.ExprStrValContext ctx) {
        String strVal = ctx.STR_VAL().getText();
        strings.add(strVal.substring(1, strVal.length() - 1));
        return STR_TYPE;
    }

    @Override
    public EZType visitExprRealVal(EZParser.ExprRealValContext ctx) {
        return REAL_TYPE;
    }

    @Override
    public EZType visitTimesOver(EZParser.TimesOverContext ctx) {
        EZType left = visit(ctx.expr(0));
        EZType right = visit(ctx.expr(1));

        if (left == NO_TYPE || right == NO_TYPE)
            return NO_TYPE;

        EZType unif = left.unifyOtherArith(right);
        if (unif == NO_TYPE)
            typeError(ctx.op.getLine(), ctx.op.getText(), left, right);

        return unif;
    }

    @Override
    public EZType visitPlusMinus(EZParser.PlusMinusContext ctx) {
        EZType left = visit(ctx.expr(0));
        EZType right = visit(ctx.expr(1));

        if (left == null)
            System.err.println("left null" + ctx.expr(0).getText());
        if (left == NO_TYPE || right == NO_TYPE)
            return NO_TYPE;

        EZType unif;

        if (ctx.op.getType() == EZParser.PLUS)
            unif = left.unifyPlus(right);
        else
            unif = left.unifyOtherArith(right);

        if (unif == NO_TYPE)
            typeError(ctx.op.getLine(), ctx.op.getText(), left, right);

        return unif;
    }

    @Override
    public EZType visitExprPar(EZParser.ExprParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public EZType visitExprFalse(EZParser.ExprFalseContext ctx) {
        return BOOL_TYPE;
    }

    @Override
    public EZType visitExprIntVal(EZParser.ExprIntValContext ctx) {
        return INT_TYPE;
    }

    @Override
    public EZType visitEqLt(EZParser.EqLtContext ctx) {
        EZType left = visit(ctx.expr(0));
        EZType right = visit(ctx.expr(1));

        if (left == NO_TYPE || right == NO_TYPE)
            return NO_TYPE;

        EZType unif = left.unifyComp(right);

        if (unif == NO_TYPE)
            typeError(ctx.op.getLine(), ctx.op.getText(), left, right);

        return unif;
    }

    @Override
    public EZType visitExprTrue(EZParser.ExprTrueContext ctx) {
        return BOOL_TYPE;
    }
}
