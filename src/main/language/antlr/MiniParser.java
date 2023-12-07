// Generated from MiniParser.g4 by ANTLR 4.5

    package language.antlr;

    import org.antlr.v4.runtime.*;
    import java.io.*;
    import java.util.*;

    import language.model.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, EQ=2, NEQ=3, LEQ=4, GEQ=5, DBLEQ=6, COMMA=7, SEMI=8, LPAREN=9, 
		RPAREN=10, LCURLY=11, RCURLY=12, LBRACK=13, RBRACK=14, RANGLE=15, LANGLE=16, 
		AND=17, OR=18, INCR=19, DECR=20, INTEGER=21, DECIMAL=22, CHARACTER=23, 
		ARRAYLIST=24, LINKEDLIST=25, POINTER=26, STRING=27, ANY=28, IF=29, RETURN=30, 
		TYPEDEF=31, FRAME=32, ADD=33, SUB=34, MULT=35, DIV=36, MOD=37, DOT=38, 
		QMARK=39, COLON=40, SYSTEM=41, INT_LIT=42, STR_LIT=43, ID=44, WS=45, BLOCK_COMMENT=46, 
		LINE_COMMENT=47;
	public static final int
		RULE_program = 0, RULE_programList = 1, RULE_programStmt = 2, RULE_typedef = 3, 
		RULE_fnDecl = 4, RULE_actualList = 5, RULE_varDeclList = 6, RULE_varDecl = 7, 
		RULE_varInitStmt = 8, RULE_type = 9, RULE_genericType = 10, RULE_frameType = 11, 
		RULE_frameDecl = 12, RULE_primitiveType = 13, RULE_primitiveGenericType = 14, 
		RULE_stmtList = 15, RULE_stmt = 16, RULE_assignStmt = 17, RULE_expr = 18;
	public static final String[] ruleNames = {
		"program", "programList", "programStmt", "typedef", "fnDecl", "actualList", 
		"varDeclList", "varDecl", "varInitStmt", "type", "genericType", "frameType", 
		"frameDecl", "primitiveType", "primitiveGenericType", "stmtList", "stmt", 
		"assignStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'='", "'!='", "'<='", "'>='", "'=='", "','", "';'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'>'", "'<'", "'&&'", "'||'", "'++'", 
		"'--'", "'Integer'", "'Decimal'", "'Character'", "'ArrayList'", "'LinkedList'", 
		"'Pointer'", "'String'", "'Any'", "'if'", "'return'", "'typedef'", "'frame'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'?'", "':'", "'System.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "EQ", "NEQ", "LEQ", "GEQ", "DBLEQ", "COMMA", "SEMI", "LPAREN", 
		"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "RANGLE", "LANGLE", 
		"AND", "OR", "INCR", "DECR", "INTEGER", "DECIMAL", "CHARACTER", "ARRAYLIST", 
		"LINKEDLIST", "POINTER", "STRING", "ANY", "IF", "RETURN", "TYPEDEF", "FRAME", 
		"ADD", "SUB", "MULT", "DIV", "MOD", "DOT", "QMARK", "COLON", "SYSTEM", 
		"INT_LIT", "STR_LIT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "MiniParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public Program program;

	public MiniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public ProgramListContext pl;
		public TerminalNode EOF() { return getToken(MiniParser.EOF, 0); }
		public ProgramListContext programList() {
			return getRuleContext(ProgramListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((ProgramContext)_localctx).pl = programList(0);
			setState(39);
			match(EOF);

			        ((ProgramContext)_localctx).p =  new Program(((ProgramContext)_localctx).pl.l);
			    
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

	public static class ProgramListContext extends ParserRuleContext {
		public ArrayList<ProgramStatement> l;
		public ProgramListContext pl;
		public ProgramStmtContext ps;
		public ProgramListContext programList() {
			return getRuleContext(ProgramListContext.class,0);
		}
		public ProgramStmtContext programStmt() {
			return getRuleContext(ProgramStmtContext.class,0);
		}
		public ProgramListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programList; }
	}

	public final ProgramListContext programList() throws RecognitionException {
		return programList(0);
	}

	private ProgramListContext programList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramListContext _localctx = new ProgramListContext(_ctx, _parentState);
		ProgramListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_programList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			        ((ProgramListContext)_localctx).l =  new ArrayList<>();
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramListContext(_parentctx, _parentState);
					_localctx.pl = _prevctx;
					_localctx.pl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_programList);
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					((ProgramListContext)_localctx).ps = programStmt();

					                  ((ProgramListContext)_localctx).pl.l.add(((ProgramListContext)_localctx).ps.p);
					                  ((ProgramListContext)_localctx).l =  ((ProgramListContext)_localctx).pl.l;
					              
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ProgramStmtContext extends ParserRuleContext {
		public ProgramStatement p;
		public FnDeclContext fn;
		public TypedefContext t;
		public FrameDeclContext fd;
		public VarDeclContext vd;
		public VarInitStmtContext vi;
		public FnDeclContext fnDecl() {
			return getRuleContext(FnDeclContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public FrameDeclContext frameDecl() {
			return getRuleContext(FrameDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarInitStmtContext varInitStmt() {
			return getRuleContext(VarInitStmtContext.class,0);
		}
		public ProgramStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStmt; }
	}

	public final ProgramStmtContext programStmt() throws RecognitionException {
		ProgramStmtContext _localctx = new ProgramStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programStmt);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((ProgramStmtContext)_localctx).fn = fnDecl();

				        ((ProgramStmtContext)_localctx).p =  ((ProgramStmtContext)_localctx).fn.f;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((ProgramStmtContext)_localctx).t = typedef();
				setState(58);
				match(SEMI);


				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((ProgramStmtContext)_localctx).fd = frameDecl();
				setState(62);
				match(SEMI);


				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				((ProgramStmtContext)_localctx).vd = varDecl();
				setState(66);
				match(SEMI);


				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				((ProgramStmtContext)_localctx).vi = varInitStmt();


				    
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

	public static class TypedefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniParser.ID, 0); }
		public FrameDeclContext frameDecl() {
			return getRuleContext(FrameDeclContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typedef);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(TYPEDEF);
				setState(75);
				type(0);
				setState(76);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(TYPEDEF);
				setState(79);
				frameDecl();
				setState(80);
				match(ID);
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

	public static class FnDeclContext extends ParserRuleContext {
		public FunctionDeclaration f;
		public VarDeclContext v;
		public VarDeclListContext l;
		public StmtListContext s;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public FnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnDecl; }
	}

	public final FnDeclContext fnDecl() throws RecognitionException {
		FnDeclContext _localctx = new FnDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((FnDeclContext)_localctx).v = varDecl();
			setState(85);
			match(LPAREN);
			setState(86);
			((FnDeclContext)_localctx).l = varDeclList();
			setState(87);
			match(RPAREN);
			setState(88);
			match(LCURLY);
			setState(89);
			((FnDeclContext)_localctx).s = stmtList(0);
			setState(90);
			match(RCURLY);

			        ((FnDeclContext)_localctx).f =  new FunctionDeclaration(((FnDeclContext)_localctx).v.v.getType(), ((FnDeclContext)_localctx).v.v.getId(), ((FnDeclContext)_localctx).l.l, ((FnDeclContext)_localctx).s.s);
			    
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

	public static class ActualListContext extends ParserRuleContext {
		public ArrayList<Expression> l;
		public ActualListContext a;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActualListContext actualList() {
			return getRuleContext(ActualListContext.class,0);
		}
		public ActualListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualList; }
	}

	public final ActualListContext actualList() throws RecognitionException {
		return actualList(0);
	}

	private ActualListContext actualList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActualListContext _localctx = new ActualListContext(_ctx, _parentState);
		ActualListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_actualList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94);
				((ActualListContext)_localctx).e = expr(0);

				        ((ActualListContext)_localctx).l =  new ArrayList<>();
				        _localctx.l.add(((ActualListContext)_localctx).e.e);
				    
				}
				break;
			case 2:
				{
				 /* nothing */
				        ((ActualListContext)_localctx).l =  new ArrayList<>();
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActualListContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_actualList);
					setState(100);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(101);
					match(COMMA);
					setState(102);
					((ActualListContext)_localctx).e = expr(0);

					                  ((ActualListContext)_localctx).a.l.add(((ActualListContext)_localctx).e.e);
					              
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclListContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> l;
		public VarDeclContext v1;
		public VarDeclListContext vl;
		public VarDeclContext v2;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclList);
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((VarDeclListContext)_localctx).v1 = varDecl();
				setState(111);
				match(COMMA);
				setState(112);
				((VarDeclListContext)_localctx).vl = varDeclList();

				        ((VarDeclListContext)_localctx).l =  ((VarDeclListContext)_localctx).vl.l;
				        _localctx.l.add(((VarDeclListContext)_localctx).v1.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((VarDeclListContext)_localctx).v2 = varDecl();

				        ((VarDeclListContext)_localctx).l =  new ArrayList<VariableDeclaration>() {{
				            add(((VarDeclListContext)_localctx).v2.v);
				        }};
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 /* nothing */
				        ((VarDeclListContext)_localctx).l =  new ArrayList<VariableDeclaration>();
				    
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

	public static class VarDeclContext extends ParserRuleContext {
		public VariableDeclaration v;
		public TypeContext t;
		public Token i;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniParser.ID, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((VarDeclContext)_localctx).t = type(0);
			setState(122);
			((VarDeclContext)_localctx).i = match(ID);

			        ((VarDeclContext)_localctx).v =  new VariableDeclaration(((VarDeclContext)_localctx).t.t, (((VarDeclContext)_localctx).i!=null?((VarDeclContext)_localctx).i.getText():null));
			    
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

	public static class VarInitStmtContext extends ParserRuleContext {
		public VariableInitializationStatement v;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarInitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInitStmt; }
	}

	public final VarInitStmtContext varInitStmt() throws RecognitionException {
		VarInitStmtContext _localctx = new VarInitStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varInitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			varDecl();
			setState(126);
			match(EQ);
			setState(127);
			expr(0);
			setState(128);
			match(SEMI);
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

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public FrameTypeContext frameType() {
			return getRuleContext(FrameTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case CHARACTER:
			case STRING:
			case ANY:
				{
				setState(131);
				primitiveType();
				}
				break;
			case LANGLE:
			case ARRAYLIST:
			case LINKEDLIST:
			case POINTER:
				{
				setState(132);
				genericType();
				}
				break;
			case FRAME:
				{
				setState(133);
				frameType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(137);
					match(LBRACK);
					setState(138);
					match(RBRACK);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class GenericTypeContext extends ParserRuleContext {
		public PrimitiveGenericTypeContext primitiveGenericType() {
			return getRuleContext(PrimitiveGenericTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			primitiveGenericType();
			setState(145);
			match(LANGLE);
			setState(146);
			type(0);
			setState(147);
			match(RANGLE);
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

	public static class FrameTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniParser.ID, 0); }
		public FrameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameType; }
	}

	public final FrameTypeContext frameType() throws RecognitionException {
		FrameTypeContext _localctx = new FrameTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_frameType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FRAME);
			setState(150);
			match(ID);
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

	public static class FrameDeclContext extends ParserRuleContext {
		public FrameTypeContext frameType() {
			return getRuleContext(FrameTypeContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public FrameDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameDecl; }
	}

	public final FrameDeclContext frameDecl() throws RecognitionException {
		FrameDeclContext _localctx = new FrameDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_frameDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			frameType();
			setState(153);
			match(LCURLY);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				varDecl();
				setState(155);
				match(SEMI);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << INTEGER) | (1L << DECIMAL) | (1L << CHARACTER) | (1L << ARRAYLIST) | (1L << LINKEDLIST) | (1L << POINTER) | (1L << STRING) | (1L << ANY) | (1L << FRAME))) != 0) );
			setState(161);
			match(RCURLY);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(MiniParser.DECIMAL, 0); }
		public TerminalNode CHARACTER() { return getToken(MiniParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(MiniParser.STRING, 0); }
		public TerminalNode ANY() { return getToken(MiniParser.ANY, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DECIMAL) | (1L << CHARACTER) | (1L << STRING) | (1L << ANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class PrimitiveGenericTypeContext extends ParserRuleContext {
		public TerminalNode ARRAYLIST() { return getToken(MiniParser.ARRAYLIST, 0); }
		public TerminalNode LINKEDLIST() { return getToken(MiniParser.LINKEDLIST, 0); }
		public TerminalNode POINTER() { return getToken(MiniParser.POINTER, 0); }
		public PrimitiveGenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveGenericType; }
	}

	public final PrimitiveGenericTypeContext primitiveGenericType() throws RecognitionException {
		PrimitiveGenericTypeContext _localctx = new PrimitiveGenericTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveGenericType);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ARRAYLIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ARRAYLIST);
				}
				break;
			case LINKEDLIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(LINKEDLIST);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(POINTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtListContext extends ParserRuleContext {
		public ArrayList<Statement> s;
		public StmtListContext sl;
		public StmtContext st2;
		public StmtContext st1;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
	}

	public final StmtListContext stmtList() throws RecognitionException {
		return stmtList(0);
	}

	private StmtListContext stmtList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtListContext _localctx = new StmtListContext(_ctx, _parentState);
		StmtListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_stmtList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(172);
				((StmtListContext)_localctx).st2 = stmt();

				        ((StmtListContext)_localctx).s =  new ArrayList<Statement>();
				        _localctx.s.add(((StmtListContext)_localctx).st2.s);
				    
				}
				break;
			case 2:
				{
				 /* nothing */
				        ((StmtListContext)_localctx).s =  new ArrayList<Statement>();
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtListContext(_parentctx, _parentState);
					_localctx.sl = _prevctx;
					_localctx.sl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_stmtList);
					setState(178);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(179);
					((StmtListContext)_localctx).st1 = stmt();

					                  ((StmtListContext)_localctx).s =  ((StmtListContext)_localctx).sl.s;
					                  _localctx.s.add(((StmtListContext)_localctx).st1.s);
					              
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public Statement s;
		public ExprContext e1;
		public StmtListContext sl;
		public VarDeclContext vd;
		public VarInitStmtContext vi;
		public ExprContext e;
		public TerminalNode IF() { return getToken(MiniParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarInitStmtContext varInitStmt() {
			return getRuleContext(VarInitStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public FrameDeclContext frameDecl() {
			return getRuleContext(FrameDeclContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MiniParser.RETURN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(IF);
				setState(188);
				match(LPAREN);
				setState(189);
				((StmtContext)_localctx).e1 = expr(0);
				setState(190);
				match(RPAREN);
				setState(191);
				match(LCURLY);
				setState(192);
				((StmtContext)_localctx).sl = stmtList(0);
				setState(193);
				match(RCURLY);

				        ((StmtContext)_localctx).s =  new IfStatement(((StmtContext)_localctx).e1.e, ((StmtContext)_localctx).sl.s);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				((StmtContext)_localctx).vd = varDecl();
				setState(197);
				match(SEMI);

				        ((StmtContext)_localctx).s =  ((StmtContext)_localctx).vd.v;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				((StmtContext)_localctx).vi = varInitStmt();
				 // varInitStmt suffixed with ';'
				        ((StmtContext)_localctx).s =  ((StmtContext)_localctx).vi.v;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				assignStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				frameDecl();
				setState(205);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(RETURN);
				setState(208);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(RETURN);
				setState(210);
				expr(0);
				setState(211);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
				((StmtContext)_localctx).e = expr(0);
				setState(214);
				match(SEMI);

				        ((StmtContext)_localctx).s =  new ExpressionStatement(((StmtContext)_localctx).e.e);
				    
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

	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(220);
			match(EQ);
			setState(221);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public Expression e;
		public Token s;
		public Token i;
		public ActualListContext a;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniParser.ID, 0); }
		public TerminalNode INT_LIT() { return getToken(MiniParser.INT_LIT, 0); }
		public TerminalNode STR_LIT() { return getToken(MiniParser.STR_LIT, 0); }
		public ActualListContext actualList() {
			return getRuleContext(ActualListContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(224);
				match(NOT);
				setState(225);
				expr(23);
				}
				break;
			case 2:
				{
				setState(226);
				match(INCR);
				setState(227);
				expr(22);
				}
				break;
			case 3:
				{
				setState(228);
				match(DECR);
				setState(229);
				expr(21);
				}
				break;
			case 4:
				{
				setState(230);
				match(LPAREN);
				setState(231);
				type(0);
				setState(232);
				match(RPAREN);
				setState(233);
				expr(20);
				}
				break;
			case 5:
				{
				setState(235);
				match(LPAREN);
				setState(236);
				expr(0);
				setState(237);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(239);
				match(ID);
				}
				break;
			case 7:
				{
				setState(240);
				match(INT_LIT);
				}
				break;
			case 8:
				{
				setState(241);
				((ExprContext)_localctx).s = match(STR_LIT);

				        String text = (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getText():null);
				        ((ExprContext)_localctx).e =  new StringExpression(text.substring(1, text.length() - 1));
				    
				}
				break;
			case 9:
				{
				setState(243);
				match(SYSTEM);
				setState(244);
				((ExprContext)_localctx).i = match(ID);
				setState(245);
				match(LPAREN);
				setState(246);
				((ExprContext)_localctx).a = actualList(0);
				setState(247);
				match(RPAREN);

				        ((ExprContext)_localctx).e =  new FunctionCall((((ExprContext)_localctx).i!=null?((ExprContext)_localctx).i.getText():null), true, ((ExprContext)_localctx).a.l);
				    
				}
				break;
			case 10:
				{
				setState(250);
				match(ID);
				setState(251);
				match(LPAREN);
				setState(252);
				actualList(0);
				setState(253);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(258);
						match(MULT);
						setState(259);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(261);
						match(DIV);
						setState(262);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(264);
						match(MOD);
						setState(265);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(267);
						match(ADD);
						setState(268);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(270);
						match(SUB);
						setState(271);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(273);
						match(LANGLE);
						setState(274);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(276);
						match(RANGLE);
						setState(277);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(279);
						match(LEQ);
						setState(280);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(282);
						match(GEQ);
						setState(283);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(285);
						match(DBLEQ);
						setState(286);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(288);
						match(NEQ);
						setState(289);
						expr(10);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(291);
						match(AND);
						setState(292);
						expr(9);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						match(OR);
						setState(295);
						expr(8);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						match(QMARK);
						setState(298);
						expr(0);
						setState(299);
						match(COLON);
						setState(300);
						expr(7);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(303);
						match(LBRACK);
						setState(304);
						expr(0);
						setState(305);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(308);
						match(DOT);
						setState(309);
						match(ID);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(311);
						match(INCR);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(313);
						match(DECR);
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return programList_sempred((ProgramListContext)_localctx, predIndex);
		case 5:
			return actualList_sempred((ActualListContext)_localctx, predIndex);
		case 9:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 15:
			return stmtList_sempred((StmtListContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean programList_sempred(ProgramListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean actualList_sempred(ActualListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmtList_sempred(StmtListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 27);
		case 19:
			return precpred(_ctx, 26);
		case 20:
			return precpred(_ctx, 25);
		case 21:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0142\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7e\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0089\n\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u00a0"+
		"\n\16\r\16\16\16\u00a1\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ac"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00b3\n\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00b9\n\21\f\21\16\21\u00bc\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0102\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013d\n\24\f\24"+
		"\16\24\u0140\13\24\3\24\2\7\4\f\24 &\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\3\4\2\27\31\35\36\u0163\2(\3\2\2\2\4,\3\2\2\2\6J\3\2"+
		"\2\2\bT\3\2\2\2\nV\3\2\2\2\fd\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22\177\3"+
		"\2\2\2\24\u0088\3\2\2\2\26\u0092\3\2\2\2\30\u0097\3\2\2\2\32\u009a\3\2"+
		"\2\2\34\u00a5\3\2\2\2\36\u00ab\3\2\2\2 \u00b2\3\2\2\2\"\u00db\3\2\2\2"+
		"$\u00dd\3\2\2\2&\u0101\3\2\2\2()\5\4\3\2)*\7\2\2\3*+\b\2\1\2+\3\3\2\2"+
		"\2,-\b\3\1\2-.\b\3\1\2.\65\3\2\2\2/\60\f\4\2\2\60\61\5\6\4\2\61\62\b\3"+
		"\1\2\62\64\3\2\2\2\63/\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\5\3\2\2\2\67\65\3\2\2\289\5\n\6\29:\b\4\1\2:K\3\2\2\2;<\5\b\5\2"+
		"<=\7\n\2\2=>\b\4\1\2>K\3\2\2\2?@\5\32\16\2@A\7\n\2\2AB\b\4\1\2BK\3\2\2"+
		"\2CD\5\20\t\2DE\7\n\2\2EF\b\4\1\2FK\3\2\2\2GH\5\22\n\2HI\b\4\1\2IK\3\2"+
		"\2\2J8\3\2\2\2J;\3\2\2\2J?\3\2\2\2JC\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LM\7"+
		"!\2\2MN\5\24\13\2NO\7.\2\2OU\3\2\2\2PQ\7!\2\2QR\5\32\16\2RS\7.\2\2SU\3"+
		"\2\2\2TL\3\2\2\2TP\3\2\2\2U\t\3\2\2\2VW\5\20\t\2WX\7\13\2\2XY\5\16\b\2"+
		"YZ\7\f\2\2Z[\7\r\2\2[\\\5 \21\2\\]\7\16\2\2]^\b\6\1\2^\13\3\2\2\2_`\b"+
		"\7\1\2`a\5&\24\2ab\b\7\1\2be\3\2\2\2ce\b\7\1\2d_\3\2\2\2dc\3\2\2\2em\3"+
		"\2\2\2fg\f\5\2\2gh\7\t\2\2hi\5&\24\2ij\b\7\1\2jl\3\2\2\2kf\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2pq\5\20\t\2qr\7\t\2\2r"+
		"s\5\16\b\2st\b\b\1\2tz\3\2\2\2uv\5\20\t\2vw\b\b\1\2wz\3\2\2\2xz\b\b\1"+
		"\2yp\3\2\2\2yu\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\5\24\13\2|}\7.\2\2}~\b"+
		"\t\1\2~\21\3\2\2\2\177\u0080\5\20\t\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\5&\24\2\u0082\u0083\7\n\2\2\u0083\23\3\2\2\2\u0084\u0085\b\13\1\2\u0085"+
		"\u0089\5\34\17\2\u0086\u0089\5\26\f\2\u0087\u0089\5\30\r\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008f\3\2\2\2\u008a"+
		"\u008b\f\3\2\2\u008b\u008c\7\17\2\2\u008c\u008e\7\20\2\2\u008d\u008a\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5\36\20\2\u0093\u0094\7\22"+
		"\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7\21\2\2\u0096\27\3\2\2\2\u0097"+
		"\u0098\7\"\2\2\u0098\u0099\7.\2\2\u0099\31\3\2\2\2\u009a\u009b\5\30\r"+
		"\2\u009b\u009f\7\r\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\n\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\35\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8"+
		"\u00ac\7\32\2\2\u00a9\u00ac\7\33\2\2\u00aa\u00ac\7\34\2\2\u00ab\u00a7"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ae\b\21\1\2\u00ae\u00af\5\"\22\2\u00af\u00b0\b\21"+
		"\1\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\b\21\1\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\5\""+
		"\22\2\u00b6\u00b7\b\21\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb!\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\37\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0"+
		"\5&\24\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5 \21\2\u00c3"+
		"\u00c4\7\16\2\2\u00c4\u00c5\b\22\1\2\u00c5\u00dc\3\2\2\2\u00c6\u00c7\5"+
		"\20\t\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\b\22\1\2\u00c9\u00dc\3\2\2\2\u00ca"+
		"\u00cb\5\22\n\2\u00cb\u00cc\b\22\1\2\u00cc\u00dc\3\2\2\2\u00cd\u00dc\5"+
		"$\23\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7\n\2\2\u00d0\u00dc\3\2\2\2\u00d1"+
		"\u00d2\7 \2\2\u00d2\u00dc\7\n\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\5&\24"+
		"\2\u00d5\u00d6\7\n\2\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9"+
		"\7\n\2\2\u00d9\u00da\b\22\1\2\u00da\u00dc\3\2\2\2\u00db\u00bd\3\2\2\2"+
		"\u00db\u00c6\3\2\2\2\u00db\u00ca\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00ce"+
		"\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00de\7.\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\5&\24\2\u00e0"+
		"%\3\2\2\2\u00e1\u00e2\b\24\1\2\u00e2\u00e3\7\3\2\2\u00e3\u0102\5&\24\31"+
		"\u00e4\u00e5\7\25\2\2\u00e5\u0102\5&\24\30\u00e6\u00e7\7\26\2\2\u00e7"+
		"\u0102\5&\24\27\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb"+
		"\7\f\2\2\u00eb\u00ec\5&\24\26\u00ec\u0102\3\2\2\2\u00ed\u00ee\7\13\2\2"+
		"\u00ee\u00ef\5&\24\2\u00ef\u00f0\7\f\2\2\u00f0\u0102\3\2\2\2\u00f1\u0102"+
		"\7.\2\2\u00f2\u0102\7,\2\2\u00f3\u00f4\7-\2\2\u00f4\u0102\b\24\1\2\u00f5"+
		"\u00f6\7+\2\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5\f"+
		"\7\2\u00f9\u00fa\7\f\2\2\u00fa\u00fb\b\24\1\2\u00fb\u0102\3\2\2\2\u00fc"+
		"\u00fd\7.\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5\f\7\2\u00ff\u0100\7\f"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00e1\3\2\2\2\u0101\u00e4\3\2\2\2\u0101"+
		"\u00e6\3\2\2\2\u0101\u00e8\3\2\2\2\u0101\u00ed\3\2\2\2\u0101\u00f1\3\2"+
		"\2\2\u0101\u00f2\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f5\3\2\2\2\u0101"+
		"\u00fc\3\2\2\2\u0102\u013e\3\2\2\2\u0103\u0104\f\25\2\2\u0104\u0105\7"+
		"%\2\2\u0105\u013d\5&\24\26\u0106\u0107\f\24\2\2\u0107\u0108\7&\2\2\u0108"+
		"\u013d\5&\24\25\u0109\u010a\f\23\2\2\u010a\u010b\7\'\2\2\u010b\u013d\5"+
		"&\24\24\u010c\u010d\f\22\2\2\u010d\u010e\7#\2\2\u010e\u013d\5&\24\23\u010f"+
		"\u0110\f\21\2\2\u0110\u0111\7$\2\2\u0111\u013d\5&\24\22\u0112\u0113\f"+
		"\20\2\2\u0113\u0114\7\22\2\2\u0114\u013d\5&\24\21\u0115\u0116\f\17\2\2"+
		"\u0116\u0117\7\21\2\2\u0117\u013d\5&\24\20\u0118\u0119\f\16\2\2\u0119"+
		"\u011a\7\6\2\2\u011a\u013d\5&\24\17\u011b\u011c\f\r\2\2\u011c\u011d\7"+
		"\7\2\2\u011d\u013d\5&\24\16\u011e\u011f\f\f\2\2\u011f\u0120\7\b\2\2\u0120"+
		"\u013d\5&\24\r\u0121\u0122\f\13\2\2\u0122\u0123\7\5\2\2\u0123\u013d\5"+
		"&\24\f\u0124\u0125\f\n\2\2\u0125\u0126\7\23\2\2\u0126\u013d\5&\24\13\u0127"+
		"\u0128\f\t\2\2\u0128\u0129\7\24\2\2\u0129\u013d\5&\24\n\u012a\u012b\f"+
		"\b\2\2\u012b\u012c\7)\2\2\u012c\u012d\5&\24\2\u012d\u012e\7*\2\2\u012e"+
		"\u012f\5&\24\t\u012f\u013d\3\2\2\2\u0130\u0131\f\35\2\2\u0131\u0132\7"+
		"\17\2\2\u0132\u0133\5&\24\2\u0133\u0134\7\20\2\2\u0134\u013d\3\2\2\2\u0135"+
		"\u0136\f\34\2\2\u0136\u0137\7(\2\2\u0137\u013d\7.\2\2\u0138\u0139\f\33"+
		"\2\2\u0139\u013d\7\25\2\2\u013a\u013b\f\32\2\2\u013b\u013d\7\26\2\2\u013c"+
		"\u0103\3\2\2\2\u013c\u0106\3\2\2\2\u013c\u0109\3\2\2\2\u013c\u010c\3\2"+
		"\2\2\u013c\u010f\3\2\2\2\u013c\u0112\3\2\2\2\u013c\u0115\3\2\2\2\u013c"+
		"\u0118\3\2\2\2\u013c\u011b\3\2\2\2\u013c\u011e\3\2\2\2\u013c\u0121\3\2"+
		"\2\2\u013c\u0124\3\2\2\2\u013c\u0127\3\2\2\2\u013c\u012a\3\2\2\2\u013c"+
		"\u0130\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\'\3\2\2\2\u0140\u013e\3\2\2\2\22\65JTdmy\u0088\u008f\u00a1\u00ab\u00b2"+
		"\u00ba\u00db\u0101\u013c\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}