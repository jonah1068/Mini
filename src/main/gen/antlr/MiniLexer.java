// Generated from /Users/jonahliu/IdeaProjects/MiniMachine/src/main/antlr/MiniLexer.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOT", "EQ", "NEQ", "LEQ", "GEQ", "DBLEQ", "COMMA", "SEMI", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "RANGLE", "LANGLE", 
			"AND", "OR", "INCR", "DECR", "INTEGER", "DECIMAL", "CHARACTER", "ARRAYLIST", 
			"LINKEDLIST", "POINTER", "STRING", "ANY", "IF", "RETURN", "TYPEDEF", 
			"FRAME", "ADD", "SUB", "MULT", "DIV", "MOD", "DOT", "QMARK", "COLON", 
			"INT_LIT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'='", "'!='", "'<='", "'>='", "'=='", "','", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'>'", "'<'", "'&&'", "'||'", "'++'", 
			"'--'", "'Integer'", "'Decimal'", "'Character'", "'ArrayList'", "'LinkedList'", 
			"'Pointer'", "'String'", "'Any'", "'if'", "'return'", "'typedef'", "'frame'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "EQ", "NEQ", "LEQ", "GEQ", "DBLEQ", "COMMA", "SEMI", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "RANGLE", "LANGLE", 
			"AND", "OR", "INCR", "DECR", "INTEGER", "DECIMAL", "CHARACTER", "ARRAYLIST", 
			"LINKEDLIST", "POINTER", "STRING", "ANY", "IF", "RETURN", "TYPEDEF", 
			"FRAME", "ADD", "SUB", "MULT", "DIV", "MOD", "DOT", "QMARK", "COLON", 
			"INT_LIT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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

	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000-\u0129\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0004(\u00f7\b(\u000b(\f(\u00f8\u0001"+
		")\u0001)\u0005)\u00fd\b)\n)\f)\u0100\t)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0108\b)\u0001*\u0004*\u010b\b*\u000b*\f*\u010c\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u0115\b+\n+\f+\u0118\t+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0123"+
		"\b,\n,\f,\u0126\t,\u0001,\u0001,\u0001\u0116\u0000-\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-\u0001"+
		"\u0000\u0005\u0001\u000009\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\f\r  \u0002\u0000\n\n\r\r\u012e\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001[\u0001"+
		"\u0000\u0000\u0000\u0003]\u0001\u0000\u0000\u0000\u0005_\u0001\u0000\u0000"+
		"\u0000\u0007b\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000b"+
		"h\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000\u000fm\u0001\u0000"+
		"\u0000\u0000\u0011o\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000"+
		"\u0015s\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019w"+
		"\u0001\u0000\u0000\u0000\u001by\u0001\u0000\u0000\u0000\u001d{\u0001\u0000"+
		"\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u007f\u0001\u0000\u0000\u0000"+
		"#\u0082\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0088"+
		"\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u0093\u0001\u0000"+
		"\u0000\u0000-\u009b\u0001\u0000\u0000\u0000/\u00a5\u0001\u0000\u0000\u0000"+
		"1\u00af\u0001\u0000\u0000\u00003\u00ba\u0001\u0000\u0000\u00005\u00c2"+
		"\u0001\u0000\u0000\u00007\u00c9\u0001\u0000\u0000\u00009\u00cd\u0001\u0000"+
		"\u0000\u0000;\u00d0\u0001\u0000\u0000\u0000=\u00d7\u0001\u0000\u0000\u0000"+
		"?\u00df\u0001\u0000\u0000\u0000A\u00e5\u0001\u0000\u0000\u0000C\u00e7"+
		"\u0001\u0000\u0000\u0000E\u00e9\u0001\u0000\u0000\u0000G\u00eb\u0001\u0000"+
		"\u0000\u0000I\u00ed\u0001\u0000\u0000\u0000K\u00ef\u0001\u0000\u0000\u0000"+
		"M\u00f1\u0001\u0000\u0000\u0000O\u00f3\u0001\u0000\u0000\u0000Q\u00f6"+
		"\u0001\u0000\u0000\u0000S\u0107\u0001\u0000\u0000\u0000U\u010a\u0001\u0000"+
		"\u0000\u0000W\u0110\u0001\u0000\u0000\u0000Y\u011e\u0001\u0000\u0000\u0000"+
		"[\\\u0005!\u0000\u0000\\\u0002\u0001\u0000\u0000\u0000]^\u0005=\u0000"+
		"\u0000^\u0004\u0001\u0000\u0000\u0000_`\u0005!\u0000\u0000`a\u0005=\u0000"+
		"\u0000a\u0006\u0001\u0000\u0000\u0000bc\u0005<\u0000\u0000cd\u0005=\u0000"+
		"\u0000d\b\u0001\u0000\u0000\u0000ef\u0005>\u0000\u0000fg\u0005=\u0000"+
		"\u0000g\n\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000ij\u0005=\u0000"+
		"\u0000j\f\u0001\u0000\u0000\u0000kl\u0005,\u0000\u0000l\u000e\u0001\u0000"+
		"\u0000\u0000mn\u0005;\u0000\u0000n\u0010\u0001\u0000\u0000\u0000op\u0005"+
		"(\u0000\u0000p\u0012\u0001\u0000\u0000\u0000qr\u0005)\u0000\u0000r\u0014"+
		"\u0001\u0000\u0000\u0000st\u0005{\u0000\u0000t\u0016\u0001\u0000\u0000"+
		"\u0000uv\u0005}\u0000\u0000v\u0018\u0001\u0000\u0000\u0000wx\u0005[\u0000"+
		"\u0000x\u001a\u0001\u0000\u0000\u0000yz\u0005]\u0000\u0000z\u001c\u0001"+
		"\u0000\u0000\u0000{|\u0005>\u0000\u0000|\u001e\u0001\u0000\u0000\u0000"+
		"}~\u0005<\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0080\u0005&\u0000"+
		"\u0000\u0080\u0081\u0005&\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005|\u0000\u0000\u0083\u0084\u0005|\u0000\u0000\u0084$"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005+\u0000\u0000\u0086\u0087\u0005"+
		"+\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005-\u0000"+
		"\u0000\u0089\u008a\u0005-\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005I\u0000\u0000\u008c\u008d\u0005n\u0000\u0000\u008d\u008e\u0005"+
		"t\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0005g\u0000"+
		"\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005r\u0000\u0000\u0092"+
		"*\u0001\u0000\u0000\u0000\u0093\u0094\u0005D\u0000\u0000\u0094\u0095\u0005"+
		"e\u0000\u0000\u0095\u0096\u0005c\u0000\u0000\u0096\u0097\u0005i\u0000"+
		"\u0000\u0097\u0098\u0005m\u0000\u0000\u0098\u0099\u0005a\u0000\u0000\u0099"+
		"\u009a\u0005l\u0000\u0000\u009a,\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"C\u0000\u0000\u009c\u009d\u0005h\u0000\u0000\u009d\u009e\u0005a\u0000"+
		"\u0000\u009e\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0"+
		"\u00a1\u0005c\u0000\u0000\u00a1\u00a2\u0005t\u0000\u0000\u00a2\u00a3\u0005"+
		"e\u0000\u0000\u00a3\u00a4\u0005r\u0000\u0000\u00a4.\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005A\u0000\u0000\u00a6\u00a7\u0005r\u0000\u0000\u00a7"+
		"\u00a8\u0005r\u0000\u0000\u00a8\u00a9\u0005a\u0000\u0000\u00a9\u00aa\u0005"+
		"y\u0000\u0000\u00aa\u00ab\u0005L\u0000\u0000\u00ab\u00ac\u0005i\u0000"+
		"\u0000\u00ac\u00ad\u0005s\u0000\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae"+
		"0\u0001\u0000\u0000\u0000\u00af\u00b0\u0005L\u0000\u0000\u00b0\u00b1\u0005"+
		"i\u0000\u0000\u00b1\u00b2\u0005n\u0000\u0000\u00b2\u00b3\u0005k\u0000"+
		"\u0000\u00b3\u00b4\u0005e\u0000\u0000\u00b4\u00b5\u0005d\u0000\u0000\u00b5"+
		"\u00b6\u0005L\u0000\u0000\u00b6\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005"+
		"s\u0000\u0000\u00b8\u00b9\u0005t\u0000\u0000\u00b92\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005P\u0000\u0000\u00bb\u00bc\u0005o\u0000\u0000\u00bc"+
		"\u00bd\u0005i\u0000\u0000\u00bd\u00be\u0005n\u0000\u0000\u00be\u00bf\u0005"+
		"t\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u00c1\u0005r\u0000"+
		"\u0000\u00c14\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005S\u0000\u0000\u00c3"+
		"\u00c4\u0005t\u0000\u0000\u00c4\u00c5\u0005r\u0000\u0000\u00c5\u00c6\u0005"+
		"i\u0000\u0000\u00c6\u00c7\u0005n\u0000\u0000\u00c7\u00c8\u0005g\u0000"+
		"\u0000\u00c86\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005A\u0000\u0000\u00ca"+
		"\u00cb\u0005n\u0000\u0000\u00cb\u00cc\u0005y\u0000\u0000\u00cc8\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005i\u0000\u0000\u00ce\u00cf\u0005f\u0000"+
		"\u0000\u00cf:\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005r\u0000\u0000\u00d1"+
		"\u00d2\u0005e\u0000\u0000\u00d2\u00d3\u0005t\u0000\u0000\u00d3\u00d4\u0005"+
		"u\u0000\u0000\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u00d6\u0005n\u0000"+
		"\u0000\u00d6<\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005t\u0000\u0000\u00d8"+
		"\u00d9\u0005y\u0000\u0000\u00d9\u00da\u0005p\u0000\u0000\u00da\u00db\u0005"+
		"e\u0000\u0000\u00db\u00dc\u0005d\u0000\u0000\u00dc\u00dd\u0005e\u0000"+
		"\u0000\u00dd\u00de\u0005f\u0000\u0000\u00de>\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005f\u0000\u0000\u00e0\u00e1\u0005r\u0000\u0000\u00e1\u00e2\u0005"+
		"a\u0000\u0000\u00e2\u00e3\u0005m\u0000\u0000\u00e3\u00e4\u0005e\u0000"+
		"\u0000\u00e4@\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005+\u0000\u0000\u00e6"+
		"B\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005-\u0000\u0000\u00e8D\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005*\u0000\u0000\u00eaF\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ecH\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005%\u0000\u0000\u00eeJ\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		".\u0000\u0000\u00f0L\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005?\u0000"+
		"\u0000\u00f2N\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005:\u0000\u0000\u00f4"+
		"P\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0000\u0000\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9R\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fe\u0007\u0001\u0000\u0000\u00fb\u00fd\u0007"+
		"\u0002\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0108\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005S\u0000\u0000\u0102\u0103\u0005y\u0000"+
		"\u0000\u0103\u0104\u0005s\u0000\u0000\u0104\u0105\u0005t\u0000\u0000\u0105"+
		"\u0106\u0005e\u0000\u0000\u0106\u0108\u0005m\u0000\u0000\u0107\u00fa\u0001"+
		"\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0108T\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0007\u0003\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0006*\u0000\u0000\u010fV\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005/\u0000\u0000\u0111\u0112\u0005*\u0000\u0000\u0112\u0116"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\t\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"*\u0000\u0000\u011a\u011b\u0005/\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0006+\u0001\u0000\u011dX\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005/\u0000\u0000\u011f\u0120\u0005/\u0000\u0000\u0120\u0124\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\b\u0004\u0000\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0006,\u0001"+
		"\u0000\u0128Z\u0001\u0000\u0000\u0000\u0007\u0000\u00f8\u00fe\u0107\u010c"+
		"\u0116\u0124\u0002\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}