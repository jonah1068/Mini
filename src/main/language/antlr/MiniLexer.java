// Generated from MiniLexer.g4 by ANTLR 4.5

    package language.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOT", "EQ", "NEQ", "LEQ", "GEQ", "DBLEQ", "COMMA", "SEMI", "LPAREN", 
		"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "RANGLE", "LANGLE", 
		"AND", "OR", "INCR", "DECR", "INTEGER", "DECIMAL", "CHARACTER", "ARRAYLIST", 
		"LINKEDLIST", "POINTER", "STRING", "ANY", "IF", "RETURN", "TYPEDEF", "FRAME", 
		"ADD", "SUB", "MULT", "DIV", "MOD", "DOT", "QMARK", "COLON", "SYSTEM", 
		"INT_LIT", "STR_LIT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public MiniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\6+\u0105\n+\r+\16"+
		"+\u0106\3,\3,\7,\u010b\n,\f,\16,\u010e\13,\3,\3,\3,\7,\u0113\n,\f,\16"+
		",\u0116\13,\7,\u0118\n,\f,\16,\u011b\13,\3,\3,\3-\3-\7-\u0121\n-\f-\16"+
		"-\u0124\13-\3.\6.\u0127\n.\r.\16.\u0128\3.\3.\3/\3/\3/\3/\7/\u0131\n/"+
		"\f/\16/\u0134\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u013f\n\60\f"+
		"\60\16\60\u0142\13\60\3\60\3\60\3\u0132\2\61\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61\3\2\b\3\2\62;\4\2$$^^\3\2c|\6\2\62;C\\aac|\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\th\3\2\2\2\13"+
		"k\3\2\2\2\rn\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27"+
		"y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2"+
		"+\u0091\3\2\2\2-\u0099\3\2\2\2/\u00a1\3\2\2\2\61\u00ab\3\2\2\2\63\u00b5"+
		"\3\2\2\2\65\u00c0\3\2\2\2\67\u00c8\3\2\2\29\u00cf\3\2\2\2;\u00d3\3\2\2"+
		"\2=\u00d6\3\2\2\2?\u00dd\3\2\2\2A\u00e5\3\2\2\2C\u00eb\3\2\2\2E\u00ed"+
		"\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2\2\2O"+
		"\u00f7\3\2\2\2Q\u00f9\3\2\2\2S\u00fb\3\2\2\2U\u0104\3\2\2\2W\u0108\3\2"+
		"\2\2Y\u011e\3\2\2\2[\u0126\3\2\2\2]\u012c\3\2\2\2_\u013a\3\2\2\2ab\7#"+
		"\2\2b\4\3\2\2\2cd\7?\2\2d\6\3\2\2\2ef\7#\2\2fg\7?\2\2g\b\3\2\2\2hi\7>"+
		"\2\2ij\7?\2\2j\n\3\2\2\2kl\7@\2\2lm\7?\2\2m\f\3\2\2\2no\7?\2\2op\7?\2"+
		"\2p\16\3\2\2\2qr\7.\2\2r\20\3\2\2\2st\7=\2\2t\22\3\2\2\2uv\7*\2\2v\24"+
		"\3\2\2\2wx\7+\2\2x\26\3\2\2\2yz\7}\2\2z\30\3\2\2\2{|\7\177\2\2|\32\3\2"+
		"\2\2}~\7]\2\2~\34\3\2\2\2\177\u0080\7_\2\2\u0080\36\3\2\2\2\u0081\u0082"+
		"\7@\2\2\u0082 \3\2\2\2\u0083\u0084\7>\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7(\2\2\u0086\u0087\7(\2\2\u0087$\3\2\2\2\u0088\u0089\7~\2\2\u0089\u008a"+
		"\7~\2\2\u008a&\3\2\2\2\u008b\u008c\7-\2\2\u008c\u008d\7-\2\2\u008d(\3"+
		"\2\2\2\u008e\u008f\7/\2\2\u008f\u0090\7/\2\2\u0090*\3\2\2\2\u0091\u0092"+
		"\7K\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7i\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098,\3\2\2\2\u0099"+
		"\u009a\7F\2\2\u009a\u009b\7g\2\2\u009b\u009c\7e\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7o\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0.\3\2\2"+
		"\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7t\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7C\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7{\2\2"+
		"\u00b0\u00b1\7N\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7N\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7f\2\2\u00bb"+
		"\u00bc\7N\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\64\3\2\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7i\2\2\u00ce"+
		"8\3\2\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7{\2\2\u00d2"+
		":\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7h\2\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7p\2\2\u00dc>\3\2\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7{\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7f\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\u00e4\7h\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7h\2"+
		"\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea"+
		"\7g\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7-\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7"+
		"/\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7\61"+
		"\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7\'\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7\60"+
		"\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7A\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7<\2"+
		"\2\u00faR\3\2\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7{\2\2\u00fd\u00fe\7"+
		"u\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7o\2\2\u0101\u0102"+
		"\7\60\2\2\u0102T\3\2\2\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107V\3\2\2\2"+
		"\u0108\u010c\7$\2\2\u0109\u010b\n\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0119\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7^\2\2\u0110\u0114\13\2\2\2\u0111\u0113\n\3"+
		"\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u010f\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7$\2\2\u011dX\3\2\2\2\u011e"+
		"\u0122\t\4\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123Z\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0127\t\6\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b."+
		"\2\2\u012b\\\3\2\2\2\u012c\u012d\7\61\2\2\u012d\u012e\7,\2\2\u012e\u0132"+
		"\3\2\2\2\u012f\u0131\13\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137\7\61\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\b/\3\2\u0139^\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7\61\2\2"+
		"\u013c\u0140\3\2\2\2\u013d\u013f\n\7\2\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\b\60\3\2\u0144`\3\2\2\2\13\2\u0106\u010c\u0114"+
		"\u0119\u0122\u0128\u0132\u0140\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}