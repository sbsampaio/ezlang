// Generated from /home/sbsampaio/ufes/cc/labs/ezlang/EZParser.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EZParser}.
 */
public interface EZParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EZParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EZParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EZParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#vars_sect}.
	 * @param ctx the parse tree
	 */
	void enterVars_sect(EZParser.Vars_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#vars_sect}.
	 * @param ctx the parse tree
	 */
	void exitVars_sect(EZParser.Vars_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(EZParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(EZParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(EZParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(EZParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#stmt_sect}.
	 * @param ctx the parse tree
	 */
	void enterStmt_sect(EZParser.Stmt_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#stmt_sect}.
	 * @param ctx the parse tree
	 */
	void exitStmt_sect(EZParser.Stmt_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EZParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EZParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(EZParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(EZParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(EZParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(EZParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(EZParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(EZParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(EZParser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(EZParser.Repeat_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(EZParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(EZParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EZParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EZParser.ExprContext ctx);
}