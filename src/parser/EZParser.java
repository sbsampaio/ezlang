package parser;

// Generated from EZParser.g by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape" })
public class EZParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int WS = 1, COMMENTS = 2, BEGIN = 3, BOOL = 4, ELSE = 5, END = 6, FALSE = 7, IF = 8, INT = 9,
			PROGRAM = 10, READ = 11, REAL = 12, REPEAT = 13, STRING = 14, THEN = 15, TRUE = 16,
			UNTIL = 17, VAR = 18, WRITE = 19, ASSIGN = 20, EQ = 21, LPAR = 22, LT = 23, MINUS = 24,
			OVER = 25, PLUS = 26, RPAR = 27, SEMI = 28, TIMES = 29, INT_VAL = 30, REAL_VAL = 31,
			STR_VAL = 32, ID = 33, UNKNOWN = 34;
	public static final int RULE_program = 0, RULE_vars_sect = 1, RULE_var_decl = 2, RULE_type_spec = 3,
			RULE_stmt_sect = 4, RULE_stmt = 5, RULE_assign_stmt = 6, RULE_if_stmt = 7,
			RULE_read_stmt = 8, RULE_repeat_stmt = 9, RULE_write_stmt = 10, RULE_expr = 11;

	private static String[] makeRuleNames() {
		return new String[] {
				"program", "vars_sect", "var_decl", "type_spec", "stmt_sect", "stmt",
				"assign_stmt", "if_stmt", "read_stmt", "repeat_stmt", "write_stmt", "expr"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, "'begin'", "'bool'", "'else'", "'end'", "'false'",
				"'if'", "'int'", "'program'", "'read'", "'real'", "'repeat'", "'string'",
				"'then'", "'true'", "'until'", "'var'", "'write'", "':='", "'='", "'('",
				"'<'", "'-'", "'/'", "'+'", "')'", "';'", "'*'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "WS", "COMMENTS", "BEGIN", "BOOL", "ELSE", "END", "FALSE", "IF",
				"INT", "PROGRAM", "READ", "REAL", "REPEAT", "STRING", "THEN", "TRUE",
				"UNTIL", "VAR", "WRITE", "ASSIGN", "EQ", "LPAR", "LT", "MINUS", "OVER",
				"PLUS", "RPAR", "SEMI", "TIMES", "INT_VAL", "REAL_VAL", "STR_VAL", "ID",
				"UNKNOWN"
		};
	}

	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() {
		return "EZParser.g";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public EZParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() {
			return getToken(EZParser.PROGRAM, 0);
		}

		public TerminalNode ID() {
			return getToken(EZParser.ID, 0);
		}

		public TerminalNode SEMI() {
			return getToken(EZParser.SEMI, 0);
		}

		public Vars_sectContext vars_sect() {
			return getRuleContext(Vars_sectContext.class, 0);
		}

		public Stmt_sectContext stmt_sect() {
			return getRuleContext(Stmt_sectContext.class, 0);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitProgram(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				match(PROGRAM);
				setState(25);
				match(ID);
				setState(26);
				match(SEMI);
				setState(27);
				vars_sect();
				setState(28);
				stmt_sect();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vars_sectContext extends ParserRuleContext {
		public TerminalNode VAR() {
			return getToken(EZParser.VAR, 0);
		}

		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}

		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class, i);
		}

		public Vars_sectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_vars_sect;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitVars_sect(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Vars_sectContext vars_sect() throws RecognitionException {
		Vars_sectContext _localctx = new Vars_sectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars_sect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(30);
				match(VAR);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21008L) != 0)) {
					{
						{
							setState(31);
							var_decl();
						}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(EZParser.ID, 0);
		}

		public TerminalNode SEMI() {
			return getToken(EZParser.SEMI, 0);
		}

		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_var_decl;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitVar_decl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(37);
				type_spec();
				setState(38);
				match(ID);
				setState(39);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode BOOL() {
			return getToken(EZParser.BOOL, 0);
		}

		public TerminalNode INT() {
			return getToken(EZParser.INT, 0);
		}

		public TerminalNode REAL() {
			return getToken(EZParser.REAL, 0);
		}

		public TerminalNode STRING() {
			return getToken(EZParser.STRING, 0);
		}

		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_spec;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitType_spec(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(41);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 21008L) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_sectContext extends ParserRuleContext {
		public TerminalNode BEGIN() {
			return getToken(EZParser.BEGIN, 0);
		}

		public TerminalNode END() {
			return getToken(EZParser.END, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public Stmt_sectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt_sect;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitStmt_sect(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Stmt_sectContext stmt_sect() throws RecognitionException {
		Stmt_sectContext _localctx = new Stmt_sectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_sect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(43);
				match(BEGIN);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(44);
							stmt();
						}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8590469376L) != 0));
				setState(49);
				match(END);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class, 0);
		}

		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class, 0);
		}

		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class, 0);
		}

		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class, 0);
		}

		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class, 0);
		}

		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					enterOuterAlt(_localctx, 1); {
					setState(51);
					assign_stmt();
				}
					break;
				case IF:
					enterOuterAlt(_localctx, 2); {
					setState(52);
					if_stmt();
				}
					break;
				case READ:
					enterOuterAlt(_localctx, 3); {
					setState(53);
					read_stmt();
				}
					break;
				case REPEAT:
					enterOuterAlt(_localctx, 4); {
					setState(54);
					repeat_stmt();
				}
					break;
				case WRITE:
					enterOuterAlt(_localctx, 5); {
					setState(55);
					write_stmt();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(EZParser.ID, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(EZParser.ASSIGN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(EZParser.SEMI, 0);
		}

		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assign_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitAssign_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				expr(0);
				setState(61);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(EZParser.IF, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode THEN() {
			return getToken(EZParser.THEN, 0);
		}

		public TerminalNode END() {
			return getToken(EZParser.END, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public TerminalNode ELSE() {
			return getToken(EZParser.ELSE, 0);
		}

		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_if_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitIf_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				match(IF);
				setState(64);
				expr(0);
				setState(65);
				match(THEN);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(66);
							stmt();
						}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8590469376L) != 0));
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ELSE) {
					{
						setState(71);
						match(ELSE);
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(72);
									stmt();
								}
							}
							setState(75);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8590469376L) != 0));
					}
				}

				setState(79);
				match(END);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_stmtContext extends ParserRuleContext {
		public TerminalNode READ() {
			return getToken(EZParser.READ, 0);
		}

		public TerminalNode ID() {
			return getToken(EZParser.ID, 0);
		}

		public TerminalNode SEMI() {
			return getToken(EZParser.SEMI, 0);
		}

		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_read_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitRead_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(81);
				match(READ);
				setState(82);
				match(ID);
				setState(83);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_stmtContext extends ParserRuleContext {
		public TerminalNode REPEAT() {
			return getToken(EZParser.REPEAT, 0);
		}

		public TerminalNode UNTIL() {
			return getToken(EZParser.UNTIL, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_repeat_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitRepeat_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeat_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(REPEAT);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(86);
							stmt();
						}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8590469376L) != 0));
				setState(91);
				match(UNTIL);
				setState(92);
				expr(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Write_stmtContext extends ParserRuleContext {
		public TerminalNode WRITE() {
			return getToken(EZParser.WRITE, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(EZParser.SEMI, 0);
		}

		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_write_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitWrite_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(94);
				match(WRITE);
				setState(95);
				expr(0);
				setState(96);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRealValContext extends ExprContext {
		public TerminalNode REAL_VAL() {
			return getToken(EZParser.REAL_VAL, 0);
		}

		public ExprRealValContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprRealVal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimesOverContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode TIMES() {
			return getToken(EZParser.TIMES, 0);
		}

		public TerminalNode OVER() {
			return getToken(EZParser.OVER, 0);
		}

		public TimesOverContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitTimesOver(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode PLUS() {
			return getToken(EZParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(EZParser.MINUS, 0);
		}

		public PlusMinusContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitPlusMinus(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrValContext extends ExprContext {
		public TerminalNode STR_VAL() {
			return getToken(EZParser.STR_VAL, 0);
		}

		public ExprStrValContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprStrVal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprParContext extends ExprContext {
		public TerminalNode LPAR() {
			return getToken(EZParser.LPAR, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode RPAR() {
			return getToken(EZParser.RPAR, 0);
		}

		public ExprParContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprPar(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprFalseContext extends ExprContext {
		public TerminalNode FALSE() {
			return getToken(EZParser.FALSE, 0);
		}

		public ExprFalseContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprFalse(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() {
			return getToken(EZParser.ID, 0);
		}

		public ExprIdContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprId(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntValContext extends ExprContext {
		public TerminalNode INT_VAL() {
			return getToken(EZParser.INT_VAL, 0);
		}

		public ExprIntValContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprIntVal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqLtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode EQ() {
			return getToken(EZParser.EQ, 0);
		}

		public TerminalNode LT() {
			return getToken(EZParser.LT, 0);
		}

		public EqLtContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitEqLt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprTrueContext extends ExprContext {
		public TerminalNode TRUE() {
			return getToken(EZParser.TRUE, 0);
		}

		public ExprTrueContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof EZParserVisitor)
				return ((EZParserVisitor<? extends T>) visitor).visitExprTrue(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LPAR: {
						_localctx = new ExprParContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(99);
						match(LPAR);
						setState(100);
						expr(0);
						setState(101);
						match(RPAR);
					}
						break;
					case TRUE: {
						_localctx = new ExprTrueContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(103);
						match(TRUE);
					}
						break;
					case FALSE: {
						_localctx = new ExprFalseContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(104);
						match(FALSE);
					}
						break;
					case INT_VAL: {
						_localctx = new ExprIntValContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(105);
						match(INT_VAL);
					}
						break;
					case REAL_VAL: {
						_localctx = new ExprRealValContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(106);
						match(REAL_VAL);
					}
						break;
					case STR_VAL: {
						_localctx = new ExprStrValContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(107);
						match(STR_VAL);
					}
						break;
					case ID: {
						_localctx = new ExprIdContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(108);
						match(ID);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(120);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
								case 1: {
									_localctx = new TimesOverContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(111);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(112);
									_la = _input.LA(1);
									if (!(_la == OVER || _la == TIMES)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(113);
									expr(11);
								}
									break;
								case 2: {
									_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(114);
									if (!(precpred(_ctx, 9)))
										throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(115);
									_la = _input.LA(1);
									if (!(_la == MINUS || _la == PLUS)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(116);
									expr(10);
								}
									break;
								case 3: {
									_localctx = new EqLtContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(117);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(118);
									_la = _input.LA(1);
									if (!(_la == EQ || _la == LT)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(119);
									expr(9);
								}
									break;
							}
						}
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 11:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 10);
			case 1:
				return precpred(_ctx, 9);
			case 2:
				return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001\"~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
			+
			"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
			"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
			"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001" +
			"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
			"\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001" +
			"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001" +
			"\u0004\u0001\u0004\u0004\u0004.\b\u0004\u000b\u0004\f\u0004/\u0001\u0004" +
			"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
			"\u0003\u00059\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
			"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007" +
			"D\b\u0007\u000b\u0007\f\u0007E\u0001\u0007\u0001\u0007\u0004\u0007J\b" +
			"\u0007\u000b\u0007\f\u0007K\u0003\u0007N\b\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tX\b\t\u000b\t" +
			"\f\tY\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bn\b\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000by\b\u000b\n\u000b\f\u000b" +
			"|\t\u000b\u0001\u000b\u0000\u0001\u0016\f\u0000\u0002\u0004\u0006\b\n" +
			"\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0004\u0000\u0004\u0004\t" +
			"\t\f\f\u000e\u000e\u0002\u0000\u0019\u0019\u001d\u001d\u0002\u0000\u0018" +
			"\u0018\u001a\u001a\u0002\u0000\u0015\u0015\u0017\u0017\u0084\u0000\u0018" +
			"\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004%\u0001" +
			"\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000" +
			"\u0000\n8\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000\u000e?\u0001" +
			"\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012U\u0001\u0000\u0000" +
			"\u0000\u0014^\u0001\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018" +
			"\u0019\u0005\n\u0000\u0000\u0019\u001a\u0005!\u0000\u0000\u001a\u001b" +
			"\u0005\u001c\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001d" +
			"\u0003\b\u0004\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e\"\u0005" +
			"\u0012\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000" +
			"\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000" +
			"\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000" +
			"%&\u0003\u0006\u0003\u0000&\'\u0005!\u0000\u0000\'(\u0005\u001c\u0000" +
			"\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000*\u0007" +
			"\u0001\u0000\u0000\u0000+-\u0005\u0003\u0000\u0000,.\u0003\n\u0005\u0000" +
			"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000" +
			"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0006" +
			"\u0000\u00002\t\u0001\u0000\u0000\u000039\u0003\f\u0006\u000049\u0003" +
			"\u000e\u0007\u000059\u0003\u0010\b\u000069\u0003\u0012\t\u000079\u0003" +
			"\u0014\n\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u000085\u0001" +
			"\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u0000" +
			"9\u000b\u0001\u0000\u0000\u0000:;\u0005!\u0000\u0000;<\u0005\u0014\u0000" +
			"\u0000<=\u0003\u0016\u000b\u0000=>\u0005\u001c\u0000\u0000>\r\u0001\u0000" +
			"\u0000\u0000?@\u0005\b\u0000\u0000@A\u0003\u0016\u000b\u0000AC\u0005\u000f" +
			"\u0000\u0000BD\u0003\n\u0005\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000" +
			"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FM\u0001" +
			"\u0000\u0000\u0000GI\u0005\u0005\u0000\u0000HJ\u0003\n\u0005\u0000IH\u0001" +
			"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000" +
			"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000" +
			"\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u0006" +
			"\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QR\u0005\u000b\u0000\u0000" +
			"RS\u0005!\u0000\u0000ST\u0005\u001c\u0000\u0000T\u0011\u0001\u0000\u0000" +
			"\u0000UW\u0005\r\u0000\u0000VX\u0003\n\u0005\u0000WV\u0001\u0000\u0000" +
			"\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000" +
			"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0011\u0000\u0000\\]\u0003" +
			"\u0016\u000b\u0000]\u0013\u0001\u0000\u0000\u0000^_\u0005\u0013\u0000" +
			"\u0000_`\u0003\u0016\u000b\u0000`a\u0005\u001c\u0000\u0000a\u0015\u0001" +
			"\u0000\u0000\u0000bc\u0006\u000b\uffff\uffff\u0000cd\u0005\u0016\u0000" +
			"\u0000de\u0003\u0016\u000b\u0000ef\u0005\u001b\u0000\u0000fn\u0001\u0000" +
			"\u0000\u0000gn\u0005\u0010\u0000\u0000hn\u0005\u0007\u0000\u0000in\u0005" +
			"\u001e\u0000\u0000jn\u0005\u001f\u0000\u0000kn\u0005 \u0000\u0000ln\u0005" +
			"!\u0000\u0000mb\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mh\u0001" +
			"\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000" +
			"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nz\u0001\u0000\u0000" +
			"\u0000op\n\n\u0000\u0000pq\u0007\u0001\u0000\u0000qy\u0003\u0016\u000b" +
			"\u000brs\n\t\u0000\u0000st\u0007\u0002\u0000\u0000ty\u0003\u0016\u000b" +
			"\nuv\n\b\u0000\u0000vw\u0007\u0003\u0000\u0000wy\u0003\u0016\u000b\tx" +
			"o\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000" +
			"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000" +
			"\u0000\u0000{\u0017\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000" +
			"\n\"/8EKMYmxz";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}