// Generated from Project2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Project2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FOR=7, TO=8, WHILE=9, 
		DO=10, DOWNTO=11, AND=12, OR=13, NOT=14, VAR=15, IF=16, THEN=17, ELSE=18, 
		CONST=19, PROGRAM=20, CASE=21, BOOLEAN=22, REAL=23, BEGIN=24, END=25, 
		WRITE=26, READ=27, OF=28, EQUAL=29, NOTEQUAL=30, ELSETHEN=31, ELSEIF=32, 
		BREAK=33, CONTINUE=34, PROCEDURE=35, FUNCTION=36, SPECIAL=37, COMPARISONS=38, 
		COMMENT=39, MULDIVMOD=40, PLUSMINUS=41, Bool=42, Varname=43, Real=44, 
		WS=45;
	public static final int
		RULE_program = 0, RULE_mainblock = 1, RULE_block = 2, RULE_decconsts = 3, 
		RULE_lines = 4, RULE_line = 5, RULE_callfunc = 6, RULE_funcparam = 7, 
		RULE_funcdef = 8, RULE_funcvardef = 9, RULE_procdef = 10, RULE_callproc = 11, 
		RULE_fordo = 12, RULE_whiledo = 13, RULE_ifstate = 14, RULE_thenstate = 15, 
		RULE_elseifstate = 16, RULE_elsestate = 17, RULE_casestate = 18, RULE_cases = 19, 
		RULE_vardec = 20, RULE_varinit = 21, RULE_varre = 22, RULE_stdin = 23, 
		RULE_writeln = 24, RULE_exprff = 25, RULE_exprb = 26, RULE_var = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainblock", "block", "decconsts", "lines", "line", "callfunc", 
			"funcparam", "funcdef", "funcvardef", "procdef", "callproc", "fordo", 
			"whiledo", "ifstate", "thenstate", "elseifstate", "elsestate", "casestate", 
			"cases", "vardec", "varinit", "varre", "stdin", "writeln", "exprff", 
			"exprb", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "':'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FOR", "TO", "WHILE", "DO", 
			"DOWNTO", "AND", "OR", "NOT", "VAR", "IF", "THEN", "ELSE", "CONST", "PROGRAM", 
			"CASE", "BOOLEAN", "REAL", "BEGIN", "END", "WRITE", "READ", "OF", "EQUAL", 
			"NOTEQUAL", "ELSETHEN", "ELSEIF", "BREAK", "CONTINUE", "PROCEDURE", "FUNCTION", 
			"SPECIAL", "COMPARISONS", "COMMENT", "MULDIVMOD", "PLUSMINUS", "Bool", 
			"Varname", "Real", "WS"
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
	public String getGrammarFileName() { return "Project2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Project2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Project2Parser.PROGRAM, 0); }
		public TerminalNode Varname() { return getToken(Project2Parser.Varname, 0); }
		public MainblockContext mainblock() {
			return getRuleContext(MainblockContext.class,0);
		}
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public List<ProcdefContext> procdef() {
			return getRuleContexts(ProcdefContext.class);
		}
		public ProcdefContext procdef(int i) {
			return getRuleContext(ProcdefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(PROGRAM);
			setState(57);
			match(Varname);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(58);
				vardec();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(61);
				funcdef();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(67);
				procdef();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			mainblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainblockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public MainblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterMainblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitMainblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitMainblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainblockContext mainblock() throws RecognitionException {
		MainblockContext _localctx = new MainblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(BEGIN);
			setState(76);
			lines();
			setState(77);
			match(END);
			setState(78);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(80);
				vardec();
				}
			}

			setState(83);
			match(BEGIN);
			setState(84);
			lines();
			setState(85);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecconstsContext extends ParserRuleContext {
		public VarContext co;
		public ExprbContext er;
		public TerminalNode CONST() { return getToken(Project2Parser.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public DecconstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decconsts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterDecconsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitDecconsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitDecconsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecconstsContext decconsts() throws RecognitionException {
		DecconstsContext _localctx = new DecconstsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decconsts);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(CONST);
				setState(88);
				((DecconstsContext)_localctx).co = var();
				setState(89);
				match(EQUAL);
				setState(90);
				((DecconstsContext)_localctx).er = exprb(0);
				setState(91);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(CONST);
				setState(94);
				((DecconstsContext)_localctx).co = var();
				setState(95);
				match(EQUAL);
				setState(96);
				exprff(0);
				setState(97);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinesContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				line();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallfordoContext extends LineContext {
		public FordoContext fordo() {
			return getRuleContext(FordoContext.class,0);
		}
		public CallfordoContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallfordo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallfordo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallfordo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarrelineContext extends LineContext {
		public VarreContext varre() {
			return getRuleContext(VarreContext.class,0);
		}
		public VarrelineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarreline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarreline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarreline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallIfstateContext extends LineContext {
		public IfstateContext ifstate() {
			return getRuleContext(IfstateContext.class,0);
		}
		public CallIfstateContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallIfstate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallIfstate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallIfstate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallwhiledoContext extends LineContext {
		public WhiledoContext whiledo() {
			return getRuleContext(WhiledoContext.class,0);
		}
		public CallwhiledoContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallwhiledo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallwhiledo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallwhiledo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends LineContext {
		public TerminalNode BREAK() { return getToken(Project2Parser.BREAK, 0); }
		public BreakContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallproclineContext extends LineContext {
		public CallprocContext callproc() {
			return getRuleContext(CallprocContext.class,0);
		}
		public CallproclineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallprocline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallprocline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallprocline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends LineContext {
		public TerminalNode CONTINUE() { return getToken(Project2Parser.CONTINUE, 0); }
		public ContinueContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallfunclineContext extends LineContext {
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
		}
		public CallfunclineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallfuncline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallfuncline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallfuncline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlocklineContext extends LineContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlocklineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterBlockline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitBlockline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitBlockline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WritelineContext extends LineContext {
		public WritelnContext writeln() {
			return getRuleContext(WritelnContext.class,0);
		}
		public WritelineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterWriteline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitWriteline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitWriteline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StdinlineContext extends LineContext {
		public StdinContext stdin() {
			return getRuleContext(StdinContext.class,0);
		}
		public StdinlineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterStdinline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitStdinline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitStdinline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallcasestateContext extends LineContext {
		public CasestateContext casestate() {
			return getRuleContext(CasestateContext.class,0);
		}
		public CallcasestateContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallcasestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallcasestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallcasestate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new BlocklineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				block();
				}
				break;
			case 2:
				_localctx = new VarrelineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				varre();
				setState(108);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new StdinlineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				stdin();
				}
				break;
			case 4:
				_localctx = new WritelineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				writeln();
				}
				break;
			case 5:
				_localctx = new CallfunclineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				callfunc();
				}
				break;
			case 6:
				_localctx = new CallproclineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				callproc();
				}
				break;
			case 7:
				_localctx = new CallIfstateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				ifstate();
				}
				break;
			case 8:
				_localctx = new CallcasestateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				casestate();
				}
				break;
			case 9:
				_localctx = new CallfordoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				fordo();
				}
				break;
			case 10:
				_localctx = new CallwhiledoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				whiledo();
				}
				break;
			case 11:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(118);
				match(BREAK);
				setState(119);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(120);
				match(CONTINUE);
				setState(121);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallfuncContext extends ParserRuleContext {
		public VarContext name;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public List<FuncparamContext> funcparam() {
			return getRuleContexts(FuncparamContext.class);
		}
		public FuncparamContext funcparam(int i) {
			return getRuleContext(FuncparamContext.class,i);
		}
		public CallfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfuncContext callfunc() throws RecognitionException {
		CallfuncContext _localctx = new CallfuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			var();
			setState(125);
			match(T__2);
			setState(126);
			match(EQUAL);
			setState(127);
			((CallfuncContext)_localctx).name = var();
			setState(128);
			match(T__3);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NOT) | (1L << SPECIAL) | (1L << Bool) | (1L << Varname) | (1L << Real))) != 0)) {
				{
				setState(129);
				funcparam();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(130);
					match(T__4);
					setState(131);
					funcparam();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(T__5);
			setState(140);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncparamContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public FuncparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterFuncparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitFuncparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitFuncparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncparamContext funcparam() throws RecognitionException {
		FuncparamContext _localctx = new FuncparamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(142);
				var();
				}
				break;
			case 2:
				{
				setState(143);
				exprb(0);
				}
				break;
			case 3:
				{
				setState(144);
				exprff(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdefContext extends ParserRuleContext {
		public VarContext name;
		public Token op;
		public TerminalNode FUNCTION() { return getToken(Project2Parser.FUNCTION, 0); }
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public List<FuncvardefContext> funcvardef() {
			return getRuleContexts(FuncvardefContext.class);
		}
		public FuncvardefContext funcvardef(int i) {
			return getRuleContext(FuncvardefContext.class,i);
		}
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FUNCTION);
			setState(148);
			((FuncdefContext)_localctx).name = var();
			setState(149);
			match(T__3);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Varname) {
				{
				{
				setState(150);
				funcvardef();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__5);
			setState(157);
			match(T__2);
			setState(158);
			((FuncdefContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==REAL) ) {
				((FuncdefContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(T__1);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(160);
				vardec();
				}
			}

			setState(163);
			match(BEGIN);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				line();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
			setState(169);
			match(END);
			setState(170);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncvardefContext extends ParserRuleContext {
		public VarContext va;
		public Token op;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public FuncvardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcvardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterFuncvardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitFuncvardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitFuncvardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncvardefContext funcvardef() throws RecognitionException {
		FuncvardefContext _localctx = new FuncvardefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcvardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			((FuncvardefContext)_localctx).va = var();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(173);
				match(T__4);
				setState(174);
				((FuncvardefContext)_localctx).va = var();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__2);
			setState(181);
			((FuncvardefContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==REAL) ) {
				((FuncvardefContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcdefContext extends ParserRuleContext {
		public VarContext name;
		public VarContext ret;
		public Token op;
		public TerminalNode PROCEDURE() { return getToken(Project2Parser.PROCEDURE, 0); }
		public TerminalNode VAR() { return getToken(Project2Parser.VAR, 0); }
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public List<FuncvardefContext> funcvardef() {
			return getRuleContexts(FuncvardefContext.class);
		}
		public FuncvardefContext funcvardef(int i) {
			return getRuleContext(FuncvardefContext.class,i);
		}
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProcdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterProcdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitProcdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitProcdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcdefContext procdef() throws RecognitionException {
		ProcdefContext _localctx = new ProcdefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(PROCEDURE);
			setState(184);
			((ProcdefContext)_localctx).name = var();
			setState(185);
			match(T__3);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Varname) {
				{
				{
				setState(186);
				funcvardef();
				setState(187);
				match(T__1);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(VAR);
			setState(195);
			((ProcdefContext)_localctx).ret = var();
			setState(196);
			match(T__2);
			setState(197);
			((ProcdefContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==REAL) ) {
				((ProcdefContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			match(T__5);
			setState(199);
			match(T__1);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(200);
				vardec();
				}
			}

			setState(203);
			match(BEGIN);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				line();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
			setState(209);
			match(END);
			setState(210);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallprocContext extends ParserRuleContext {
		public VarContext name;
		public VarContext variable;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<FuncparamContext> funcparam() {
			return getRuleContexts(FuncparamContext.class);
		}
		public FuncparamContext funcparam(int i) {
			return getRuleContext(FuncparamContext.class,i);
		}
		public CallprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCallproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCallproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCallproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallprocContext callproc() throws RecognitionException {
		CallprocContext _localctx = new CallprocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callproc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((CallprocContext)_localctx).name = var();
			setState(213);
			match(T__3);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(214);
				funcparam();
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						match(T__4);
						setState(216);
						funcparam();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(222);
				match(T__4);
				}
				break;
			}
			setState(226);
			((CallprocContext)_localctx).variable = var();
			setState(227);
			match(T__5);
			setState(228);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FordoContext extends ParserRuleContext {
		public FordoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordo; }
	 
		public FordoContext() { }
		public void copyFrom(FordoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FordodowntoContext extends FordoContext {
		public TerminalNode FOR() { return getToken(Project2Parser.FOR, 0); }
		public VarreContext varre() {
			return getRuleContext(VarreContext.class,0);
		}
		public TerminalNode DOWNTO() { return getToken(Project2Parser.DOWNTO, 0); }
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public TerminalNode DO() { return getToken(Project2Parser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FordodowntoContext(FordoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterFordodownto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitFordodownto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitFordodownto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FordotoContext extends FordoContext {
		public TerminalNode FOR() { return getToken(Project2Parser.FOR, 0); }
		public VarreContext varre() {
			return getRuleContext(VarreContext.class,0);
		}
		public TerminalNode TO() { return getToken(Project2Parser.TO, 0); }
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public TerminalNode DO() { return getToken(Project2Parser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FordotoContext(FordoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterFordoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitFordoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitFordoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FordoContext fordo() throws RecognitionException {
		FordoContext _localctx = new FordoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fordo);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new FordotoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(FOR);
				setState(231);
				varre();
				setState(232);
				match(TO);
				setState(233);
				exprff(0);
				setState(234);
				match(DO);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(235);
					vardec();
					}
				}

				setState(238);
				match(BEGIN);
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					line();
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
				setState(244);
				match(END);
				setState(245);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new FordodowntoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(FOR);
				setState(248);
				varre();
				setState(249);
				match(DOWNTO);
				setState(250);
				exprff(0);
				setState(251);
				match(DO);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(252);
					vardec();
					}
				}

				setState(255);
				match(BEGIN);
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					line();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
				setState(261);
				match(END);
				setState(262);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiledoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Project2Parser.WHILE, 0); }
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public TerminalNode DO() { return getToken(Project2Parser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(Project2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public WhiledoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterWhiledo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitWhiledo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitWhiledo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledoContext whiledo() throws RecognitionException {
		WhiledoContext _localctx = new WhiledoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whiledo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WHILE);
			setState(267);
			exprb(0);
			setState(268);
			match(DO);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(269);
				vardec();
				}
			}

			setState(272);
			match(BEGIN);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				line();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << IF) | (1L << CASE) | (1L << BEGIN) | (1L << WRITE) | (1L << READ) | (1L << BREAK) | (1L << CONTINUE) | (1L << Varname))) != 0) );
			setState(278);
			match(END);
			setState(279);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstateContext extends ParserRuleContext {
		public ExprbContext ex;
		public TerminalNode IF() { return getToken(Project2Parser.IF, 0); }
		public ThenstateContext thenstate() {
			return getRuleContext(ThenstateContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public List<ElseifstateContext> elseifstate() {
			return getRuleContexts(ElseifstateContext.class);
		}
		public ElseifstateContext elseifstate(int i) {
			return getRuleContext(ElseifstateContext.class,i);
		}
		public ElsestateContext elsestate() {
			return getRuleContext(ElsestateContext.class,0);
		}
		public IfstateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterIfstate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitIfstate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitIfstate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstateContext ifstate() throws RecognitionException {
		IfstateContext _localctx = new IfstateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifstate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IF);
			setState(282);
			((IfstateContext)_localctx).ex = exprb(0);
			setState(283);
			thenstate();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(284);
				elseifstate();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(290);
				elsestate();
				}
			}

			setState(293);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenstateContext extends ParserRuleContext {
		public ThenstateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenstate; }
	 
		public ThenstateContext() { }
		public void copyFrom(ThenstateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThenstateBlockContext extends ThenstateContext {
		public TerminalNode THEN() { return getToken(Project2Parser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ThenstateBlockContext(ThenstateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterThenstateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitThenstateBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitThenstateBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThenstateLineContext extends ThenstateContext {
		public TerminalNode THEN() { return getToken(Project2Parser.THEN, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ThenstateLineContext(ThenstateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterThenstateLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitThenstateLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitThenstateLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenstateContext thenstate() throws RecognitionException {
		ThenstateContext _localctx = new ThenstateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_thenstate);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ThenstateBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(THEN);
				setState(296);
				block();
				}
				break;
			case 2:
				_localctx = new ThenstateLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(THEN);
				setState(298);
				line();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifstateContext extends ParserRuleContext {
		public ElseifstateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstate; }
	 
		public ElseifstateContext() { }
		public void copyFrom(ElseifstateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseifstateblockContext extends ElseifstateContext {
		public TerminalNode ELSEIF() { return getToken(Project2Parser.ELSEIF, 0); }
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Project2Parser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifstateblockContext(ElseifstateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterElseifstateblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitElseifstateblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitElseifstateblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseifstatelineContext extends ElseifstateContext {
		public TerminalNode ELSEIF() { return getToken(Project2Parser.ELSEIF, 0); }
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Project2Parser.THEN, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ElseifstatelineContext(ElseifstateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterElseifstateline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitElseifstateline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitElseifstateline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstateContext elseifstate() throws RecognitionException {
		ElseifstateContext _localctx = new ElseifstateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseifstate);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ElseifstateblockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(ELSEIF);
				setState(302);
				match(T__3);
				setState(303);
				exprb(0);
				setState(304);
				match(T__5);
				setState(305);
				match(THEN);
				setState(306);
				block();
				}
				break;
			case 2:
				_localctx = new ElseifstatelineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(ELSEIF);
				setState(309);
				match(T__3);
				setState(310);
				exprb(0);
				setState(311);
				match(T__5);
				setState(312);
				match(THEN);
				setState(313);
				line();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestateContext extends ParserRuleContext {
		public ElsestateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestate; }
	 
		public ElsestateContext() { }
		public void copyFrom(ElsestateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElsestateBlockContext extends ElsestateContext {
		public TerminalNode ELSE() { return getToken(Project2Parser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsestateBlockContext(ElsestateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterElsestateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitElsestateBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitElsestateBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElsestateLineContext extends ElsestateContext {
		public TerminalNode ELSE() { return getToken(Project2Parser.ELSE, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ElsestateLineContext(ElsestateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterElsestateLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitElsestateLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitElsestateLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestateContext elsestate() throws RecognitionException {
		ElsestateContext _localctx = new ElsestateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elsestate);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ElsestateBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(ELSE);
				setState(318);
				block();
				}
				break;
			case 2:
				_localctx = new ElsestateLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(ELSE);
				setState(320);
				line();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasestateContext extends ParserRuleContext {
		public VarContext va;
		public TerminalNode CASE() { return getToken(Project2Parser.CASE, 0); }
		public TerminalNode OF() { return getToken(Project2Parser.OF, 0); }
		public TerminalNode END() { return getToken(Project2Parser.END, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public CasestateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCasestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCasestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCasestate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestateContext casestate() throws RecognitionException {
		CasestateContext _localctx = new CasestateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_casestate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(CASE);
			setState(324);
			match(T__3);
			setState(325);
			((CasestateContext)_localctx).va = var();
			setState(326);
			match(T__5);
			setState(327);
			match(OF);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				cases();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NOT) | (1L << SPECIAL) | (1L << Bool) | (1L << Varname) | (1L << Real))) != 0) );
			setState(333);
			match(END);
			setState(334);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	 
		public CasesContext() { }
		public void copyFrom(CasesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasesExprbLineContext extends CasesContext {
		public ExprbContext eb;
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public CasesExprbLineContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCasesExprbLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCasesExprbLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCasesExprbLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasesExprffBlockContext extends CasesContext {
		public ExprffContext ex;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public CasesExprffBlockContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCasesExprffBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCasesExprffBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCasesExprffBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasesExprffLineContext extends CasesContext {
		public ExprffContext ex;
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public CasesExprffLineContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCasesExprffLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCasesExprffLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCasesExprffLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasesExprbBlockContext extends CasesContext {
		public ExprbContext eb;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public CasesExprbBlockContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterCasesExprbBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitCasesExprbBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitCasesExprbBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cases);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new CasesExprffBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				((CasesExprffBlockContext)_localctx).ex = exprff(0);
				setState(337);
				match(T__2);
				setState(338);
				block();
				setState(339);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new CasesExprbBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				((CasesExprbBlockContext)_localctx).eb = exprb(0);
				setState(342);
				match(T__2);
				setState(343);
				block();
				setState(344);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new CasesExprffLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				((CasesExprffLineContext)_localctx).ex = exprff(0);
				setState(347);
				match(T__2);
				setState(348);
				line();
				setState(349);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new CasesExprbLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				((CasesExprbLineContext)_localctx).eb = exprb(0);
				setState(352);
				match(T__2);
				setState(353);
				line();
				setState(354);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardecContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Project2Parser.VAR, 0); }
		public List<VarinitContext> varinit() {
			return getRuleContexts(VarinitContext.class);
		}
		public VarinitContext varinit(int i) {
			return getRuleContext(VarinitContext.class,i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vardec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(VAR);
			setState(360); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(359);
					varinit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarinitContext extends ParserRuleContext {
		public VarinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varinit; }
	 
		public VarinitContext() { }
		public void copyFrom(VarinitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarinitRealVarContext extends VarinitContext {
		public VarContext va;
		public VarContext vr;
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarinitRealVarContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitRealVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitRealVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitRealVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarinitRealContext extends VarinitContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public VarinitRealContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarinitBoolVarContext extends VarinitContext {
		public VarContext va;
		public VarContext vr;
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarinitBoolVarContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarinitequalBoolContext extends VarinitContext {
		public VarContext va;
		public ExprbContext er;
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public VarinitequalBoolContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitequalBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitequalBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitequalBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarinitequalRealContext extends VarinitContext {
		public VarContext va;
		public TerminalNode REAL() { return getToken(Project2Parser.REAL, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarinitequalRealContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitequalReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitequalReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitequalReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarinitBoolContext extends VarinitContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Project2Parser.BOOLEAN, 0); }
		public VarinitBoolContext(VarinitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarinitBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarinitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarinitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarinitContext varinit() throws RecognitionException {
		VarinitContext _localctx = new VarinitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varinit);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new VarinitequalBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				((VarinitequalBoolContext)_localctx).va = var();
				setState(365);
				match(T__2);
				setState(366);
				match(BOOLEAN);
				setState(367);
				match(EQUAL);
				setState(368);
				((VarinitequalBoolContext)_localctx).er = exprb(0);
				setState(369);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new VarinitequalRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				((VarinitequalRealContext)_localctx).va = var();
				setState(372);
				match(T__2);
				setState(373);
				match(REAL);
				setState(374);
				match(EQUAL);
				setState(375);
				exprff(0);
				setState(376);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new VarinitBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				var();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(379);
					match(T__4);
					setState(380);
					var();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(T__2);
				setState(387);
				match(BOOLEAN);
				setState(388);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new VarinitRealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				var();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(391);
					match(T__4);
					setState(392);
					var();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				match(T__2);
				setState(399);
				match(REAL);
				setState(400);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new VarinitBoolVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				((VarinitBoolVarContext)_localctx).va = var();
				setState(403);
				match(T__2);
				setState(404);
				match(BOOLEAN);
				setState(405);
				match(EQUAL);
				setState(406);
				((VarinitBoolVarContext)_localctx).vr = var();
				setState(407);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new VarinitRealVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				((VarinitRealVarContext)_localctx).va = var();
				setState(410);
				match(T__2);
				setState(411);
				match(REAL);
				setState(412);
				match(EQUAL);
				setState(413);
				((VarinitRealVarContext)_localctx).vr = var();
				setState(414);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarreContext extends ParserRuleContext {
		public VarreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varre; }
	 
		public VarreContext() { }
		public void copyFrom(VarreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarreExprbContext extends VarreContext {
		public VarContext va;
		public ExprbContext er;
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public VarreExprbContext(VarreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarreExprb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarreExprb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarreExprb(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarreVarContext extends VarreContext {
		public VarContext va;
		public VarContext vr;
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarreVarContext(VarreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarreVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarreVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarreVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarreExprffContext extends VarreContext {
		public VarContext va;
		public ExprffContext el;
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public VarreExprffContext(VarreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarreExprff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarreExprff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarreExprff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarreContext varre() throws RecognitionException {
		VarreContext _localctx = new VarreContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varre);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new VarreVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				((VarreVarContext)_localctx).va = var();
				setState(419);
				match(T__2);
				setState(420);
				match(EQUAL);
				setState(421);
				((VarreVarContext)_localctx).vr = var();
				}
				break;
			case 2:
				_localctx = new VarreExprbContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				((VarreExprbContext)_localctx).va = var();
				setState(424);
				match(T__2);
				setState(425);
				match(EQUAL);
				setState(426);
				((VarreExprbContext)_localctx).er = exprb(0);
				}
				break;
			case 3:
				_localctx = new VarreExprffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				((VarreExprffContext)_localctx).va = var();
				setState(429);
				match(T__2);
				setState(430);
				match(EQUAL);
				setState(431);
				((VarreExprffContext)_localctx).el = exprff(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdinContext extends ParserRuleContext {
		public StdinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdin; }
	 
		public StdinContext() { }
		public void copyFrom(StdinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends StdinContext {
		public VarContext va;
		public TerminalNode READ() { return getToken(Project2Parser.READ, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ReadContext(StdinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdinContext stdin() throws RecognitionException {
		StdinContext _localctx = new StdinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stdin);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(READ);
			setState(436);
			match(T__3);
			setState(437);
			((ReadContext)_localctx).va = var();
			setState(438);
			match(T__5);
			setState(439);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritelnContext extends ParserRuleContext {
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
	 
		public WritelnContext() { }
		public void copyFrom(WritelnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteExprffContext extends WritelnContext {
		public TerminalNode WRITE() { return getToken(Project2Parser.WRITE, 0); }
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public WriteExprffContext(WritelnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterWriteExprff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitWriteExprff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitWriteExprff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteExprbContext extends WritelnContext {
		public TerminalNode WRITE() { return getToken(Project2Parser.WRITE, 0); }
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public WriteExprbContext(WritelnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterWriteExprb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitWriteExprb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitWriteExprb(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteVarContext extends WritelnContext {
		public TerminalNode WRITE() { return getToken(Project2Parser.WRITE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public WriteVarContext(WritelnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterWriteVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitWriteVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitWriteVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_writeln);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new WriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(WRITE);
				setState(442);
				match(T__3);
				setState(443);
				var();
				setState(444);
				match(T__5);
				setState(445);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new WriteExprffContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(WRITE);
				setState(448);
				match(T__3);
				setState(449);
				exprff(0);
				setState(450);
				match(T__5);
				setState(451);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WriteExprbContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(WRITE);
				setState(454);
				match(T__3);
				setState(455);
				exprb(0);
				setState(456);
				match(T__5);
				setState(457);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprffContext extends ParserRuleContext {
		public ExprffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprff; }
	 
		public ExprffContext() { }
		public void copyFrom(ExprffContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprffMULDIVMODContext extends ExprffContext {
		public ExprffContext left;
		public Token op;
		public ExprffContext right;
		public List<ExprffContext> exprff() {
			return getRuleContexts(ExprffContext.class);
		}
		public ExprffContext exprff(int i) {
			return getRuleContext(ExprffContext.class,i);
		}
		public TerminalNode MULDIVMOD() { return getToken(Project2Parser.MULDIVMOD, 0); }
		public ExprffMULDIVMODContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffMULDIVMOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffMULDIVMOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffMULDIVMOD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprffPLUSMINUSContext extends ExprffContext {
		public ExprffContext left;
		public Token op;
		public ExprffContext right;
		public List<ExprffContext> exprff() {
			return getRuleContexts(ExprffContext.class);
		}
		public ExprffContext exprff(int i) {
			return getRuleContext(ExprffContext.class,i);
		}
		public TerminalNode PLUSMINUS() { return getToken(Project2Parser.PLUSMINUS, 0); }
		public ExprffPLUSMINUSContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffPLUSMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffPLUSMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffPLUSMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprffParenContext extends ExprffContext {
		public ExprffContext el;
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public ExprffParenContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprffRealContext extends ExprffContext {
		public Token ex;
		public TerminalNode Real() { return getToken(Project2Parser.Real, 0); }
		public ExprffRealContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprffSpecContext extends ExprffContext {
		public Token op;
		public ExprffContext ex;
		public TerminalNode SPECIAL() { return getToken(Project2Parser.SPECIAL, 0); }
		public ExprffContext exprff() {
			return getRuleContext(ExprffContext.class,0);
		}
		public ExprffSpecContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprffVarContext extends ExprffContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprffVarContext(ExprffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprffVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprffVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprffVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprffContext exprff() throws RecognitionException {
		return exprff(0);
	}

	private ExprffContext exprff(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprffContext _localctx = new ExprffContext(_ctx, _parentState);
		ExprffContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exprff, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ExprffParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(462);
				match(T__3);
				setState(463);
				((ExprffParenContext)_localctx).el = exprff(0);
				setState(464);
				match(T__5);
				}
				break;
			case Varname:
				{
				_localctx = new ExprffVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				var();
				}
				break;
			case SPECIAL:
				{
				_localctx = new ExprffSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				((ExprffSpecContext)_localctx).op = match(SPECIAL);
				setState(468);
				match(T__3);
				setState(469);
				((ExprffSpecContext)_localctx).ex = exprff(0);
				setState(470);
				match(T__5);
				}
				break;
			case Real:
				{
				_localctx = new ExprffRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				((ExprffRealContext)_localctx).ex = match(Real);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExprffMULDIVMODContext(new ExprffContext(_parentctx, _parentState));
						((ExprffMULDIVMODContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprff);
						setState(475);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(476);
						((ExprffMULDIVMODContext)_localctx).op = match(MULDIVMOD);
						setState(477);
						((ExprffMULDIVMODContext)_localctx).right = exprff(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprffPLUSMINUSContext(new ExprffContext(_parentctx, _parentState));
						((ExprffPLUSMINUSContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprff);
						setState(478);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(479);
						((ExprffPLUSMINUSContext)_localctx).op = match(PLUSMINUS);
						setState(480);
						((ExprffPLUSMINUSContext)_localctx).right = exprff(3);
						}
						break;
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprbContext extends ParserRuleContext {
		public ExprbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprb; }
	 
		public ExprbContext() { }
		public void copyFrom(ExprbContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprbEQUALContext extends ExprbContext {
		public ExprbContext left;
		public Token op;
		public ExprbContext right;
		public List<ExprbContext> exprb() {
			return getRuleContexts(ExprbContext.class);
		}
		public ExprbContext exprb(int i) {
			return getRuleContext(ExprbContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Project2Parser.NOTEQUAL, 0); }
		public ExprbEQUALContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbEQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbEQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbEQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbNOTContext extends ExprbContext {
		public TerminalNode NOT() { return getToken(Project2Parser.NOT, 0); }
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public ExprbNOTContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbBoolContext extends ExprbContext {
		public Token bool;
		public TerminalNode Bool() { return getToken(Project2Parser.Bool, 0); }
		public ExprbBoolContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbParenContext extends ExprbContext {
		public ExprbContext e;
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public ExprbParenContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbORContext extends ExprbContext {
		public ExprbContext left;
		public ExprbContext right;
		public TerminalNode OR() { return getToken(Project2Parser.OR, 0); }
		public List<ExprbContext> exprb() {
			return getRuleContexts(ExprbContext.class);
		}
		public ExprbContext exprb(int i) {
			return getRuleContext(ExprbContext.class,i);
		}
		public ExprbORContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbRealsContext extends ExprbContext {
		public ExprffContext left;
		public Token op;
		public ExprffContext right;
		public List<ExprffContext> exprff() {
			return getRuleContexts(ExprffContext.class);
		}
		public ExprffContext exprff(int i) {
			return getRuleContext(ExprffContext.class,i);
		}
		public TerminalNode COMPARISONS() { return getToken(Project2Parser.COMPARISONS, 0); }
		public TerminalNode EQUAL() { return getToken(Project2Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Project2Parser.NOTEQUAL, 0); }
		public ExprbRealsContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbReals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbReals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbReals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbVarContext extends ExprbContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprbVarContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbANDContext extends ExprbContext {
		public ExprbContext left;
		public ExprbContext right;
		public TerminalNode AND() { return getToken(Project2Parser.AND, 0); }
		public List<ExprbContext> exprb() {
			return getRuleContexts(ExprbContext.class);
		}
		public ExprbContext exprb(int i) {
			return getRuleContext(ExprbContext.class,i);
		}
		public ExprbANDContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbELSETHENContext extends ExprbContext {
		public ExprbContext left;
		public Token op;
		public ExprbContext right;
		public List<ExprbContext> exprb() {
			return getRuleContexts(ExprbContext.class);
		}
		public ExprbContext exprb(int i) {
			return getRuleContext(ExprbContext.class,i);
		}
		public TerminalNode ELSETHEN() { return getToken(Project2Parser.ELSETHEN, 0); }
		public ExprbELSETHENContext(ExprbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprbELSETHEN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprbELSETHEN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprbELSETHEN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprbContext exprb() throws RecognitionException {
		return exprb(0);
	}

	private ExprbContext exprb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprbContext _localctx = new ExprbContext(_ctx, _parentState);
		ExprbContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_exprb, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new ExprbParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(487);
				match(T__3);
				setState(488);
				((ExprbParenContext)_localctx).e = exprb(0);
				setState(489);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new ExprbVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				var();
				}
				break;
			case 3:
				{
				_localctx = new ExprbRealsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				((ExprbRealsContext)_localctx).left = exprff(0);
				setState(493);
				((ExprbRealsContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << COMPARISONS))) != 0)) ) {
					((ExprbRealsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				((ExprbRealsContext)_localctx).right = exprff(0);
				}
				break;
			case 4:
				{
				_localctx = new ExprbNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(NOT);
				setState(497);
				exprb(6);
				}
				break;
			case 5:
				{
				_localctx = new ExprbBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				((ExprbBoolContext)_localctx).bool = match(Bool);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprbANDContext(new ExprbContext(_parentctx, _parentState));
						((ExprbANDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprb);
						setState(501);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(502);
						match(AND);
						setState(503);
						((ExprbANDContext)_localctx).right = exprb(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprbORContext(new ExprbContext(_parentctx, _parentState));
						((ExprbORContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprb);
						setState(504);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(505);
						match(OR);
						setState(506);
						((ExprbORContext)_localctx).right = exprb(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprbEQUALContext(new ExprbContext(_parentctx, _parentState));
						((ExprbEQUALContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprb);
						setState(507);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(508);
						((ExprbEQUALContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExprbEQUALContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(509);
						((ExprbEQUALContext)_localctx).right = exprb(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprbELSETHENContext(new ExprbContext(_parentctx, _parentState));
						((ExprbELSETHENContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprb);
						setState(510);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(511);
						((ExprbELSETHENContext)_localctx).op = match(ELSETHEN);
						setState(512);
						((ExprbELSETHENContext)_localctx).right = exprb(3);
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarnameContext extends VarContext {
		public Token va;
		public TerminalNode Varname() { return getToken(Project2Parser.Varname, 0); }
		public VarnameContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var);
		try {
			_localctx = new VarnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			((VarnameContext)_localctx).va = match(Varname);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return exprff_sempred((ExprffContext)_localctx, predIndex);
		case 26:
			return exprb_sempred((ExprbContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprff_sempred(ExprffContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprb_sempred(ExprbContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u020b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\5\2>\n\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\5\4T\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5f\n\5\3\6\6\6i\n\6\r\6\16\6j\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\5\b\u008c\n\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n\n\3\n\3\n\6\n\u00a8\n\n\r\n\16\n"+
		"\u00a9\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\f\3\f\6\f\u00d0\n\f"+
		"\r\f\16\f\u00d1\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00dc\n\r\f\r\16\r"+
		"\u00df\13\r\3\r\3\r\5\r\u00e3\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00ef\n\16\3\16\3\16\6\16\u00f3\n\16\r\16\16\16\u00f4"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0100\n\16\3\16\3\16"+
		"\6\16\u0104\n\16\r\16\16\16\u0105\3\16\3\16\3\16\5\16\u010b\n\16\3\17"+
		"\3\17\3\17\3\17\5\17\u0111\n\17\3\17\3\17\6\17\u0115\n\17\r\17\16\17\u0116"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123\13"+
		"\20\3\20\5\20\u0126\n\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u012e\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u013e\n\22\3\23\3\23\3\23\3\23\5\23\u0144\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\6\24\u014c\n\24\r\24\16\24\u014d\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0167\n\25\3\26\3\26\6\26\u016b\n\26\r\26\16"+
		"\26\u016c\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0180\n\27\f\27\16\27\u0183\13\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u018c\n\27\f\27\16\27\u018f\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01a3\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b4\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ce\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01dc\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u01e4\n\33\f\33\16\33\u01e7\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01f6\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0204\n\34"+
		"\f\34\16\34\u0207\13\34\3\35\3\35\3\35\3\u016c\4\64\66\36\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\30\31\4\2\37"+
		" ((\3\2\37 \2\u0235\2:\3\2\2\2\4M\3\2\2\2\6S\3\2\2\2\be\3\2\2\2\nh\3\2"+
		"\2\2\f|\3\2\2\2\16~\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u00ae"+
		"\3\2\2\2\26\u00b9\3\2\2\2\30\u00d6\3\2\2\2\32\u010a\3\2\2\2\34\u010c\3"+
		"\2\2\2\36\u011b\3\2\2\2 \u012d\3\2\2\2\"\u013d\3\2\2\2$\u0143\3\2\2\2"+
		"&\u0145\3\2\2\2(\u0166\3\2\2\2*\u0168\3\2\2\2,\u01a2\3\2\2\2.\u01b3\3"+
		"\2\2\2\60\u01b5\3\2\2\2\62\u01cd\3\2\2\2\64\u01db\3\2\2\2\66\u01f5\3\2"+
		"\2\28\u0208\3\2\2\2:;\7\26\2\2;=\7-\2\2<>\5*\26\2=<\3\2\2\2=>\3\2\2\2"+
		">B\3\2\2\2?A\5\22\n\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2"+
		"\2DB\3\2\2\2EG\5\26\f\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JH\3\2\2\2KL\5\4\3\2L\3\3\2\2\2MN\7\32\2\2NO\5\n\6\2OP\7\33\2\2PQ"+
		"\7\3\2\2Q\5\3\2\2\2RT\5*\26\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\32\2\2"+
		"VW\5\n\6\2WX\7\33\2\2X\7\3\2\2\2YZ\7\25\2\2Z[\58\35\2[\\\7\37\2\2\\]\5"+
		"\66\34\2]^\7\4\2\2^f\3\2\2\2_`\7\25\2\2`a\58\35\2ab\7\37\2\2bc\5\64\33"+
		"\2cd\7\4\2\2df\3\2\2\2eY\3\2\2\2e_\3\2\2\2f\t\3\2\2\2gi\5\f\7\2hg\3\2"+
		"\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2l}\5\6\4\2mn\5.\30\2no\7"+
		"\4\2\2o}\3\2\2\2p}\5\60\31\2q}\5\62\32\2r}\5\16\b\2s}\5\30\r\2t}\5\36"+
		"\20\2u}\5&\24\2v}\5\32\16\2w}\5\34\17\2xy\7#\2\2y}\7\4\2\2z{\7$\2\2{}"+
		"\7\4\2\2|l\3\2\2\2|m\3\2\2\2|p\3\2\2\2|q\3\2\2\2|r\3\2\2\2|s\3\2\2\2|"+
		"t\3\2\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\r\3\2\2\2"+
		"~\177\58\35\2\177\u0080\7\5\2\2\u0080\u0081\7\37\2\2\u0081\u0082\58\35"+
		"\2\u0082\u008b\7\6\2\2\u0083\u0088\5\20\t\2\u0084\u0085\7\7\2\2\u0085"+
		"\u0087\5\20\t\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\b"+
		"\2\2\u008e\u008f\7\4\2\2\u008f\17\3\2\2\2\u0090\u0094\58\35\2\u0091\u0094"+
		"\5\66\34\2\u0092\u0094\5\64\33\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096\7&\2\2\u0096\u0097"+
		"\58\35\2\u0097\u009b\7\6\2\2\u0098\u009a\5\24\13\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a1\t\2\2\2\u00a1\u00a3\7\4\2\2\u00a2\u00a4\5*\26\2\u00a3\u00a2\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\7\32\2\2\u00a6"+
		"\u00a8\5\f\7\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\33\2\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\23\3\2\2\2\u00ae\u00b3\58\35\2\u00af\u00b0\7\7\2"+
		"\2\u00b0\u00b2\58\35\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\5\2\2\u00b7\u00b8\t\2\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\7%\2\2"+
		"\u00ba\u00bb\58\35\2\u00bb\u00c1\7\6\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be"+
		"\7\4\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\21\2\2\u00c5\u00c6\58\35\2\u00c6\u00c7\7\5\2\2\u00c7"+
		"\u00c8\t\2\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00cb\7\4\2\2\u00ca\u00cc\5*"+
		"\26\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\7\32\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7\33\2\2\u00d4\u00d5\7\4\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\58\35"+
		"\2\u00d7\u00e2\7\6\2\2\u00d8\u00dd\5\20\t\2\u00d9\u00da\7\7\2\2\u00da"+
		"\u00dc\5\20\t\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7\7\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\58\35\2\u00e5\u00e6\7\b\2\2\u00e6"+
		"\u00e7\7\4\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\5.\30"+
		"\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\64\33\2\u00ec\u00ee\7\f\2\2\u00ed"+
		"\u00ef\5*\26\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\7\32\2\2\u00f1\u00f3\5\f\7\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\7\4\2\2\u00f8\u010b\3\2\2\2\u00f9"+
		"\u00fa\7\t\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5\64"+
		"\33\2\u00fd\u00ff\7\f\2\2\u00fe\u0100\5*\26\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\32\2\2\u0102\u0104\5"+
		"\f\7\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u0109\7"+
		"\4\2\2\u0109\u010b\3\2\2\2\u010a\u00e8\3\2\2\2\u010a\u00f9\3\2\2\2\u010b"+
		"\33\3\2\2\2\u010c\u010d\7\13\2\2\u010d\u010e\5\66\34\2\u010e\u0110\7\f"+
		"\2\2\u010f\u0111\5*\26\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0114\7\32\2\2\u0113\u0115\5\f\7\2\u0114\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7\33\2\2\u0119\u011a\7\4\2\2\u011a\35\3\2\2"+
		"\2\u011b\u011c\7\22\2\2\u011c\u011d\5\66\34\2\u011d\u0121\5 \21\2\u011e"+
		"\u0120\5\"\22\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0126\5$\23\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\7\4\2\2\u0128\37\3\2\2\2\u0129\u012a\7\23\2\2\u012a\u012e"+
		"\5\6\4\2\u012b\u012c\7\23\2\2\u012c\u012e\5\f\7\2\u012d\u0129\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012e!\3\2\2\2\u012f\u0130\7\"\2\2\u0130\u0131\7"+
		"\6\2\2\u0131\u0132\5\66\34\2\u0132\u0133\7\b\2\2\u0133\u0134\7\23\2\2"+
		"\u0134\u0135\5\6\4\2\u0135\u013e\3\2\2\2\u0136\u0137\7\"\2\2\u0137\u0138"+
		"\7\6\2\2\u0138\u0139\5\66\34\2\u0139\u013a\7\b\2\2\u013a\u013b\7\23\2"+
		"\2\u013b\u013c\5\f\7\2\u013c\u013e\3\2\2\2\u013d\u012f\3\2\2\2\u013d\u0136"+
		"\3\2\2\2\u013e#\3\2\2\2\u013f\u0140\7\24\2\2\u0140\u0144\5\6\4\2\u0141"+
		"\u0142\7\24\2\2\u0142\u0144\5\f\7\2\u0143\u013f\3\2\2\2\u0143\u0141\3"+
		"\2\2\2\u0144%\3\2\2\2\u0145\u0146\7\27\2\2\u0146\u0147\7\6\2\2\u0147\u0148"+
		"\58\35\2\u0148\u0149\7\b\2\2\u0149\u014b\7\36\2\2\u014a\u014c\5(\25\2"+
		"\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\33\2\2\u0150\u0151\7\4\2\2"+
		"\u0151\'\3\2\2\2\u0152\u0153\5\64\33\2\u0153\u0154\7\5\2\2\u0154\u0155"+
		"\5\6\4\2\u0155\u0156\7\4\2\2\u0156\u0167\3\2\2\2\u0157\u0158\5\66\34\2"+
		"\u0158\u0159\7\5\2\2\u0159\u015a\5\6\4\2\u015a\u015b\7\4\2\2\u015b\u0167"+
		"\3\2\2\2\u015c\u015d\5\64\33\2\u015d\u015e\7\5\2\2\u015e\u015f\5\f\7\2"+
		"\u015f\u0160\7\4\2\2\u0160\u0167\3\2\2\2\u0161\u0162\5\66\34\2\u0162\u0163"+
		"\7\5\2\2\u0163\u0164\5\f\7\2\u0164\u0165\7\4\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0152\3\2\2\2\u0166\u0157\3\2\2\2\u0166\u015c\3\2\2\2\u0166\u0161\3\2"+
		"\2\2\u0167)\3\2\2\2\u0168\u016a\7\21\2\2\u0169\u016b\5,\27\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"+\3\2\2\2\u016e\u016f\58\35\2\u016f\u0170\7\5\2\2\u0170\u0171\7\30\2\2"+
		"\u0171\u0172\7\37\2\2\u0172\u0173\5\66\34\2\u0173\u0174\7\4\2\2\u0174"+
		"\u01a3\3\2\2\2\u0175\u0176\58\35\2\u0176\u0177\7\5\2\2\u0177\u0178\7\31"+
		"\2\2\u0178\u0179\7\37\2\2\u0179\u017a\5\64\33\2\u017a\u017b\7\4\2\2\u017b"+
		"\u01a3\3\2\2\2\u017c\u0181\58\35\2\u017d\u017e\7\7\2\2\u017e\u0180\58"+
		"\35\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\5"+
		"\2\2\u0185\u0186\7\30\2\2\u0186\u0187\7\4\2\2\u0187\u01a3\3\2\2\2\u0188"+
		"\u018d\58\35\2\u0189\u018a\7\7\2\2\u018a\u018c\58\35\2\u018b\u0189\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\5\2\2\u0191\u0192\7\31"+
		"\2\2\u0192\u0193\7\4\2\2\u0193\u01a3\3\2\2\2\u0194\u0195\58\35\2\u0195"+
		"\u0196\7\5\2\2\u0196\u0197\7\30\2\2\u0197\u0198\7\37\2\2\u0198\u0199\5"+
		"8\35\2\u0199\u019a\7\4\2\2\u019a\u01a3\3\2\2\2\u019b\u019c\58\35\2\u019c"+
		"\u019d\7\5\2\2\u019d\u019e\7\31\2\2\u019e\u019f\7\37\2\2\u019f\u01a0\5"+
		"8\35\2\u01a0\u01a1\7\4\2\2\u01a1\u01a3\3\2\2\2\u01a2\u016e\3\2\2\2\u01a2"+
		"\u0175\3\2\2\2\u01a2\u017c\3\2\2\2\u01a2\u0188\3\2\2\2\u01a2\u0194\3\2"+
		"\2\2\u01a2\u019b\3\2\2\2\u01a3-\3\2\2\2\u01a4\u01a5\58\35\2\u01a5\u01a6"+
		"\7\5\2\2\u01a6\u01a7\7\37\2\2\u01a7\u01a8\58\35\2\u01a8\u01b4\3\2\2\2"+
		"\u01a9\u01aa\58\35\2\u01aa\u01ab\7\5\2\2\u01ab\u01ac\7\37\2\2\u01ac\u01ad"+
		"\5\66\34\2\u01ad\u01b4\3\2\2\2\u01ae\u01af\58\35\2\u01af\u01b0\7\5\2\2"+
		"\u01b0\u01b1\7\37\2\2\u01b1\u01b2\5\64\33\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01a4\3\2\2\2\u01b3\u01a9\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b4/\3\2\2\2"+
		"\u01b5\u01b6\7\35\2\2\u01b6\u01b7\7\6\2\2\u01b7\u01b8\58\35\2\u01b8\u01b9"+
		"\7\b\2\2\u01b9\u01ba\7\4\2\2\u01ba\61\3\2\2\2\u01bb\u01bc\7\34\2\2\u01bc"+
		"\u01bd\7\6\2\2\u01bd\u01be\58\35\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\7\4"+
		"\2\2\u01c0\u01ce\3\2\2\2\u01c1\u01c2\7\34\2\2\u01c2\u01c3\7\6\2\2\u01c3"+
		"\u01c4\5\64\33\2\u01c4\u01c5\7\b\2\2\u01c5\u01c6\7\4\2\2\u01c6\u01ce\3"+
		"\2\2\2\u01c7\u01c8\7\34\2\2\u01c8\u01c9\7\6\2\2\u01c9\u01ca\5\66\34\2"+
		"\u01ca\u01cb\7\b\2\2\u01cb\u01cc\7\4\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01bb"+
		"\3\2\2\2\u01cd\u01c1\3\2\2\2\u01cd\u01c7\3\2\2\2\u01ce\63\3\2\2\2\u01cf"+
		"\u01d0\b\33\1\2\u01d0\u01d1\7\6\2\2\u01d1\u01d2\5\64\33\2\u01d2\u01d3"+
		"\7\b\2\2\u01d3\u01dc\3\2\2\2\u01d4\u01dc\58\35\2\u01d5\u01d6\7\'\2\2\u01d6"+
		"\u01d7\7\6\2\2\u01d7\u01d8\5\64\33\2\u01d8\u01d9\7\b\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01dc\7.\2\2\u01db\u01cf\3\2\2\2\u01db\u01d4\3\2\2\2\u01db"+
		"\u01d5\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01e5\3\2\2\2\u01dd\u01de\f\5"+
		"\2\2\u01de\u01df\7*\2\2\u01df\u01e4\5\64\33\6\u01e0\u01e1\f\4\2\2\u01e1"+
		"\u01e2\7+\2\2\u01e2\u01e4\5\64\33\5\u01e3\u01dd\3\2\2\2\u01e3\u01e0\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\65\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\b\34\1\2\u01e9\u01ea\7\6\2"+
		"\2\u01ea\u01eb\5\66\34\2\u01eb\u01ec\7\b\2\2\u01ec\u01f6\3\2\2\2\u01ed"+
		"\u01f6\58\35\2\u01ee\u01ef\5\64\33\2\u01ef\u01f0\t\3\2\2\u01f0\u01f1\5"+
		"\64\33\2\u01f1\u01f6\3\2\2\2\u01f2\u01f3\7\20\2\2\u01f3\u01f6\5\66\34"+
		"\b\u01f4\u01f6\7,\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01ee"+
		"\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u0205\3\2\2\2\u01f7"+
		"\u01f8\f\7\2\2\u01f8\u01f9\7\16\2\2\u01f9\u0204\5\66\34\b\u01fa\u01fb"+
		"\f\6\2\2\u01fb\u01fc\7\17\2\2\u01fc\u0204\5\66\34\7\u01fd\u01fe\f\5\2"+
		"\2\u01fe\u01ff\t\4\2\2\u01ff\u0204\5\66\34\6\u0200\u0201\f\4\2\2\u0201"+
		"\u0202\7!\2\2\u0202\u0204\5\66\34\5\u0203\u01f7\3\2\2\2\u0203\u01fa\3"+
		"\2\2\2\u0203\u01fd\3\2\2\2\u0203\u0200\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\67\3\2\2\2\u0207\u0205\3\2\2"+
		"\2\u0208\u0209\7-\2\2\u02099\3\2\2\2/=BHSej|\u0088\u008b\u0093\u009b\u00a3"+
		"\u00a9\u00b3\u00c1\u00cb\u00d1\u00dd\u00e2\u00ee\u00f4\u00ff\u0105\u010a"+
		"\u0110\u0116\u0121\u0125\u012d\u013d\u0143\u014d\u0166\u016c\u0181\u018d"+
		"\u01a2\u01b3\u01cd\u01db\u01e3\u01e5\u01f5\u0203\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}