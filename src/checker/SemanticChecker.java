package checker;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.Token;

import parser.*;
import typing.EZType;

public class SemanticChecker extends EZParserBaseVisitor<Void> {

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

    private void checkVar(Token token) {
        String id = token.getText();
        if (!symbolsTable.containsKey(id)) {
            System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", token.getLine(), id);
            System.exit(1);
        }
    }

    @Override
    public Void visitRead_stmt(EZParser.Read_stmtContext ctx) {
        checkVar(ctx.ID().getSymbol());
        return null;
    }

    @Override
    public Void visitAssign_stmt(EZParser.Assign_stmtContext ctx) {
        checkVar(ctx.ID().getSymbol());
        return null;
    }

    @Override
    public Void visitExprId(EZParser.ExprIdContext ctx) {
        checkVar(ctx.ID().getSymbol());
        return null;
    }

    @Override
    public Void visitVar_decl(EZParser.Var_declContext ctx) {
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
        return visitChildren(ctx);
    }

    @Override
    public Void visitExprStrVal(EZParser.ExprStrValContext ctx) {
        String strVal = ctx.STR_VAL().getText();
        strings.add(strVal.substring(1, strVal.length() - 1));
        return null;
    }
}
