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
		QMARK=39, COLON=40, INT_LIT=41, ID=42, WS=43, BLOCK_COMMENT=44, LINE_COMMENT=45;
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
		"'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "EQ", "NEQ", "LEQ", "GEQ", "DBLEQ", "COMMA", "SEMI", "LPAREN", 
		"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "RANGLE", "LANGLE", 
		"AND", "OR", "INCR", "DECR", "INTEGER", "DECIMAL", "CHARACTER", "ARRAYLIST", 
		"LINKEDLIST", "POINTER", "STRING", "ANY", "IF", "RETURN", "TYPEDEF", "FRAME", 
		"ADD", "SUB", "MULT", "DIV", "MOD", "DOT", "QMARK", "COLON", "INT_LIT", 
		"ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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

					                  ArrayList<ProgramStatement> list = ((ProgramListContext)_localctx).pl.l;
					                  list.add(((ProgramListContext)_localctx).ps.p);
					                  ((ProgramListContext)_localctx).l =  list;
					              
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

			        ((FnDeclContext)_localctx).f =  new FunctionDeclaration(((FnDeclContext)_localctx).v.v, ((FnDeclContext)_localctx).l.l, ((FnDeclContext)_localctx).s.s);
			    
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94);
				expr(0);
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActualListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_actualList);
					setState(98);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(99);
					match(COMMA);
					setState(100);
					expr(0);
					}
					} 
				}
				setState(105);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				varDecl();
				setState(107);
				match(COMMA);
				setState(108);
				varDeclList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(114);
			((VarDeclContext)_localctx).t = type(0);
			setState(115);
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
			setState(118);
			varDecl();
			setState(119);
			match(EQ);
			setState(120);
			expr(0);
			setState(121);
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
			setState(127);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case CHARACTER:
			case STRING:
			case ANY:
				{
				setState(124);
				primitiveType();
				}
				break;
			case LANGLE:
			case ARRAYLIST:
			case LINKEDLIST:
			case POINTER:
				{
				setState(125);
				genericType();
				}
				break;
			case FRAME:
				{
				setState(126);
				frameType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
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
					setState(129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(130);
					match(LBRACK);
					setState(131);
					match(RBRACK);
					}
					} 
				}
				setState(136);
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
			setState(137);
			primitiveGenericType();
			setState(138);
			match(LANGLE);
			setState(139);
			type(0);
			setState(140);
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
			setState(142);
			match(FRAME);
			setState(143);
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
			setState(145);
			frameType();
			setState(146);
			match(LCURLY);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				varDecl();
				setState(148);
				match(SEMI);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << INTEGER) | (1L << DECIMAL) | (1L << CHARACTER) | (1L << ARRAYLIST) | (1L << LINKEDLIST) | (1L << POINTER) | (1L << STRING) | (1L << ANY) | (1L << FRAME))) != 0) );
			setState(154);
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
			setState(156);
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
			setState(162);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ARRAYLIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(ARRAYLIST);
				}
				break;
			case LINKEDLIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(LINKEDLIST);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmtList);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					stmt();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IF);
				setState(173);
				match(LPAREN);
				setState(174);
				((StmtContext)_localctx).e1 = expr(0);
				setState(175);
				match(RPAREN);
				setState(176);
				match(LCURLY);
				setState(177);
				((StmtContext)_localctx).sl = stmtList(0);
				setState(178);
				match(RCURLY);

				        ((StmtContext)_localctx).s =  new IfStatement(((StmtContext)_localctx).e1.e, ((StmtContext)_localctx).sl.s);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((StmtContext)_localctx).vd = varDecl();
				setState(182);
				match(SEMI);

				        ((StmtContext)_localctx).s =  ((StmtContext)_localctx).vd.v;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((StmtContext)_localctx).vi = varInitStmt();
				 // varInitStmt suffixed with ';'
				        ((StmtContext)_localctx).s =  ((StmtContext)_localctx).vi.v;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				assignStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				frameDecl();
				setState(190);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(RETURN);
				setState(193);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(RETURN);
				setState(195);
				expr(0);
				setState(196);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				expr(0);
				setState(199);
				match(SEMI);
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
			setState(203);
			match(ID);
			setState(204);
			match(EQ);
			setState(205);
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
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(208);
				match(NOT);
				setState(209);
				expr(21);
				}
				break;
			case 2:
				{
				setState(210);
				match(INCR);
				setState(211);
				expr(20);
				}
				break;
			case 3:
				{
				setState(212);
				match(DECR);
				setState(213);
				expr(19);
				}
				break;
			case 4:
				{
				setState(214);
				match(LPAREN);
				setState(215);
				type(0);
				setState(216);
				match(RPAREN);
				setState(217);
				expr(18);
				}
				break;
			case 5:
				{
				setState(219);
				match(LPAREN);
				setState(220);
				expr(0);
				setState(221);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(223);
				match(ID);
				}
				break;
			case 7:
				{
				setState(224);
				match(INT_LIT);
				}
				break;
			case 8:
				{
				setState(225);
				match(ID);
				setState(226);
				match(LPAREN);
				setState(227);
				actualList(0);
				setState(228);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(233);
						match(DOT);
						setState(234);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(236);
						match(MULT);
						setState(237);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(239);
						match(DIV);
						setState(240);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(242);
						match(MOD);
						setState(243);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(245);
						match(ADD);
						setState(246);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(248);
						match(SUB);
						setState(249);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(251);
						match(LANGLE);
						setState(252);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(254);
						match(RANGLE);
						setState(255);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(257);
						match(LEQ);
						setState(258);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(260);
						match(GEQ);
						setState(261);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(263);
						match(DBLEQ);
						setState(264);
						expr(9);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(266);
						match(NEQ);
						setState(267);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(269);
						match(AND);
						setState(270);
						expr(7);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(272);
						match(OR);
						setState(273);
						expr(6);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(275);
						match(QMARK);
						setState(276);
						expr(0);
						setState(277);
						match(COLON);
						setState(278);
						expr(5);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(281);
						match(LBRACK);
						setState(282);
						expr(0);
						setState(283);
						match(RBRACK);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(286);
						match(DOT);
						setState(287);
						match(ID);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(289);
						match(INCR);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(291);
						match(DECR);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 24);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 26);
		case 20:
			return precpred(_ctx, 25);
		case 21:
			return precpred(_ctx, 23);
		case 22:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7c\n\7\3\7\3\7"+
		"\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0082\n\13\3\13"+
		"\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u0099\n\16\r\16\16\16\u009a"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21"+
		"\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e9\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\2\7\4"+
		"\f\24 &\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\4\2\27\31\35"+
		"\36\u014b\2(\3\2\2\2\4,\3\2\2\2\6J\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fb\3"+
		"\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24\u0081\3\2\2\2\26\u008b\3"+
		"\2\2\2\30\u0090\3\2\2\2\32\u0093\3\2\2\2\34\u009e\3\2\2\2\36\u00a4\3\2"+
		"\2\2 \u00a6\3\2\2\2\"\u00cb\3\2\2\2$\u00cd\3\2\2\2&\u00e8\3\2\2\2()\5"+
		"\4\3\2)*\7\2\2\3*+\b\2\1\2+\3\3\2\2\2,-\b\3\1\2-.\b\3\1\2.\65\3\2\2\2"+
		"/\60\f\4\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62\64\3\2\2\2\63/\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\5"+
		"\n\6\29:\b\4\1\2:K\3\2\2\2;<\5\b\5\2<=\7\n\2\2=>\b\4\1\2>K\3\2\2\2?@\5"+
		"\32\16\2@A\7\n\2\2AB\b\4\1\2BK\3\2\2\2CD\5\20\t\2DE\7\n\2\2EF\b\4\1\2"+
		"FK\3\2\2\2GH\5\22\n\2HI\b\4\1\2IK\3\2\2\2J8\3\2\2\2J;\3\2\2\2J?\3\2\2"+
		"\2JC\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LM\7!\2\2MN\5\24\13\2NO\7,\2\2OU\3\2"+
		"\2\2PQ\7!\2\2QR\5\32\16\2RS\7,\2\2SU\3\2\2\2TL\3\2\2\2TP\3\2\2\2U\t\3"+
		"\2\2\2VW\5\20\t\2WX\7\13\2\2XY\5\16\b\2YZ\7\f\2\2Z[\7\r\2\2[\\\5 \21\2"+
		"\\]\7\16\2\2]^\b\6\1\2^\13\3\2\2\2_`\b\7\1\2`c\5&\24\2ac\3\2\2\2b_\3\2"+
		"\2\2ba\3\2\2\2ci\3\2\2\2de\f\5\2\2ef\7\t\2\2fh\5&\24\2gd\3\2\2\2hk\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lm\5\20\t\2mn\7\t\2\2no\5"+
		"\16\b\2os\3\2\2\2ps\5\20\t\2qs\3\2\2\2rl\3\2\2\2rp\3\2\2\2rq\3\2\2\2s"+
		"\17\3\2\2\2tu\5\24\13\2uv\7,\2\2vw\b\t\1\2w\21\3\2\2\2xy\5\20\t\2yz\7"+
		"\4\2\2z{\5&\24\2{|\7\n\2\2|\23\3\2\2\2}~\b\13\1\2~\u0082\5\34\17\2\177"+
		"\u0082\5\26\f\2\u0080\u0082\5\30\r\2\u0081}\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0088\3\2\2\2\u0083\u0084\f\3\2\2\u0084\u0085"+
		"\7\17\2\2\u0085\u0087\7\20\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d\7\22\2\2\u008d\u008e\5\24\13"+
		"\2\u008e\u008f\7\21\2\2\u008f\27\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0092"+
		"\7,\2\2\u0092\31\3\2\2\2\u0093\u0094\5\30\r\2\u0094\u0098\7\r\2\2\u0095"+
		"\u0096\5\20\t\2\u0096\u0097\7\n\2\2\u0097\u0099\3\2\2\2\u0098\u0095\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\16\2\2\u009d\33\3\2\2\2\u009e\u009f\t\2\2"+
		"\2\u009f\35\3\2\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a5\7\32\2\2\u00a2\u00a5"+
		"\7\33\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00ab"+
		"\b\21\1\2\u00a7\u00a8\f\4\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a7\3\2\2\2"+
		"\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac!\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\37\2\2\u00af\u00b0\7\13\2\2\u00b0"+
		"\u00b1\5&\24\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\5 "+
		"\21\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\b\22\1\2\u00b6\u00cc\3\2\2\2\u00b7"+
		"\u00b8\5\20\t\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\b\22\1\2\u00ba\u00cc\3"+
		"\2\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\b\22\1\2\u00bd\u00cc\3\2\2\2\u00be"+
		"\u00cc\5$\23\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\n\2\2\u00c1\u00cc\3"+
		"\2\2\2\u00c2\u00c3\7 \2\2\u00c3\u00cc\7\n\2\2\u00c4\u00c5\7 \2\2\u00c5"+
		"\u00c6\5&\24\2\u00c6\u00c7\7\n\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c9\5&"+
		"\24\2\u00c9\u00ca\7\n\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00ae\3\2\2\2\u00cb"+
		"\u00b7\3\2\2\2\u00cb\u00bb\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb\u00bf\3\2"+
		"\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc"+
		"#\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d0\5&\24\2\u00d0"+
		"%\3\2\2\2\u00d1\u00d2\b\24\1\2\u00d2\u00d3\7\3\2\2\u00d3\u00e9\5&\24\27"+
		"\u00d4\u00d5\7\25\2\2\u00d5\u00e9\5&\24\26\u00d6\u00d7\7\26\2\2\u00d7"+
		"\u00e9\5&\24\25\u00d8\u00d9\7\13\2\2\u00d9\u00da\5\24\13\2\u00da\u00db"+
		"\7\f\2\2\u00db\u00dc\5&\24\24\u00dc\u00e9\3\2\2\2\u00dd\u00de\7\13\2\2"+
		"\u00de\u00df\5&\24\2\u00df\u00e0\7\f\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00e9"+
		"\7,\2\2\u00e2\u00e9\7+\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\7\13\2\2\u00e5"+
		"\u00e6\5\f\7\2\u00e6\u00e7\7\f\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00d1\3\2"+
		"\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00d8\3\2\2\2\u00e8"+
		"\u00dd\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e9\u0128\3\2\2\2\u00ea\u00eb\f\32\2\2\u00eb\u00ec\7(\2\2\u00ec"+
		"\u0127\5&\24\33\u00ed\u00ee\f\23\2\2\u00ee\u00ef\7%\2\2\u00ef\u0127\5"+
		"&\24\24\u00f0\u00f1\f\22\2\2\u00f1\u00f2\7&\2\2\u00f2\u0127\5&\24\23\u00f3"+
		"\u00f4\f\21\2\2\u00f4\u00f5\7\'\2\2\u00f5\u0127\5&\24\22\u00f6\u00f7\f"+
		"\20\2\2\u00f7\u00f8\7#\2\2\u00f8\u0127\5&\24\21\u00f9\u00fa\f\17\2\2\u00fa"+
		"\u00fb\7$\2\2\u00fb\u0127\5&\24\20\u00fc\u00fd\f\16\2\2\u00fd\u00fe\7"+
		"\22\2\2\u00fe\u0127\5&\24\17\u00ff\u0100\f\r\2\2\u0100\u0101\7\21\2\2"+
		"\u0101\u0127\5&\24\16\u0102\u0103\f\f\2\2\u0103\u0104\7\6\2\2\u0104\u0127"+
		"\5&\24\r\u0105\u0106\f\13\2\2\u0106\u0107\7\7\2\2\u0107\u0127\5&\24\f"+
		"\u0108\u0109\f\n\2\2\u0109\u010a\7\b\2\2\u010a\u0127\5&\24\13\u010b\u010c"+
		"\f\t\2\2\u010c\u010d\7\5\2\2\u010d\u0127\5&\24\n\u010e\u010f\f\b\2\2\u010f"+
		"\u0110\7\23\2\2\u0110\u0127\5&\24\t\u0111\u0112\f\7\2\2\u0112\u0113\7"+
		"\24\2\2\u0113\u0127\5&\24\b\u0114\u0115\f\6\2\2\u0115\u0116\7)\2\2\u0116"+
		"\u0117\5&\24\2\u0117\u0118\7*\2\2\u0118\u0119\5&\24\7\u0119\u0127\3\2"+
		"\2\2\u011a\u011b\f\34\2\2\u011b\u011c\7\17\2\2\u011c\u011d\5&\24\2\u011d"+
		"\u011e\7\20\2\2\u011e\u0127\3\2\2\2\u011f\u0120\f\33\2\2\u0120\u0121\7"+
		"(\2\2\u0121\u0127\7,\2\2\u0122\u0123\f\31\2\2\u0123\u0127\7\25\2\2\u0124"+
		"\u0125\f\30\2\2\u0125\u0127\7\26\2\2\u0126\u00ea\3\2\2\2\u0126\u00ed\3"+
		"\2\2\2\u0126\u00f0\3\2\2\2\u0126\u00f3\3\2\2\2\u0126\u00f6\3\2\2\2\u0126"+
		"\u00f9\3\2\2\2\u0126\u00fc\3\2\2\2\u0126\u00ff\3\2\2\2\u0126\u0102\3\2"+
		"\2\2\u0126\u0105\3\2\2\2\u0126\u0108\3\2\2\2\u0126\u010b\3\2\2\2\u0126"+
		"\u010e\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0114\3\2\2\2\u0126\u011a\3\2"+
		"\2\2\u0126\u011f\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\'\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\21\65JTbir\u0081\u0088\u009a\u00a4\u00ab\u00cb\u00e8"+
		"\u0126\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}