// Generated from Project2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Project2Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "FOR", "TO", "WHILE", "DO", "DOWNTO", 
			"AND", "OR", "NOT", "VAR", "IF", "THEN", "ELSE", "CONST", "PROGRAM", 
			"CASE", "BOOLEAN", "REAL", "BEGIN", "END", "WRITE", "READ", "OF", "EQUAL", 
			"NOTEQUAL", "ELSETHEN", "ELSEIF", "BREAK", "CONTINUE", "PROCEDURE", "FUNCTION", 
			"SPECIAL", "COMPARISONS", "COMMENT", "MULDIVMOD", "PLUSMINUS", "Bool", 
			"Varname", "Real", "WS"
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


	public Project2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Project2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\5:\u0158\n:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u0198\n@\3A\3A\3A\3A\3A\5A\u019f\nA\3B\3B\3B\3B\7B\u01a5"+
		"\nB\fB\16B\u01a8\13B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\5E\u01be\nE\3F\3F\7F\u01c2\nF\fF\16F\u01c5\13F\3G\5G\u01c8"+
		"\nG\3G\6G\u01cb\nG\rG\16G\u01cc\3G\3G\6G\u01d1\nG\rG\16G\u01d2\3H\6H\u01d6"+
		"\nH\rH\16H\u01d7\3H\3H\3\u01a6\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\2\67\29\2;\2=\2?\2A\2C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25"+
		"]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083"+
		")\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\3\2\'\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2??\3\2>>\3\2@@"+
		"\4\2>>@@\5\2\'\',,\61\61\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\3\2//\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u01ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2\7\u0095\3\2\2\2\t\u0097"+
		"\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009d\3\2\2\2\21\u009f\3"+
		"\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5\3\2\2\2\31\u00a7\3\2"+
		"\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2!\u00af\3\2\2\2"+
		"#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3"+
		"\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2"+
		"\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cb"+
		"\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E\u00d5\3\2\2\2G"+
		"\u00d8\3\2\2\2I\u00de\3\2\2\2K\u00e1\3\2\2\2M\u00e9\3\2\2\2O\u00ed\3\2"+
		"\2\2Q\u00f0\3\2\2\2S\u00f4\3\2\2\2U\u00f8\3\2\2\2W\u00fb\3\2\2\2Y\u0100"+
		"\3\2\2\2[\u0105\3\2\2\2]\u010b\3\2\2\2_\u0113\3\2\2\2a\u0118\3\2\2\2c"+
		"\u0120\3\2\2\2e\u0125\3\2\2\2g\u012b\3\2\2\2i\u012f\3\2\2\2k\u0137\3\2"+
		"\2\2m\u013e\3\2\2\2o\u0141\3\2\2\2q\u0143\3\2\2\2s\u0157\3\2\2\2u\u0159"+
		"\3\2\2\2w\u0161\3\2\2\2y\u0167\3\2\2\2{\u0170\3\2\2\2}\u017a\3\2\2\2\177"+
		"\u0197\3\2\2\2\u0081\u019e\3\2\2\2\u0083\u01a0\3\2\2\2\u0085\u01ae\3\2"+
		"\2\2\u0087\u01b0\3\2\2\2\u0089\u01bd\3\2\2\2\u008b\u01bf\3\2\2\2\u008d"+
		"\u01c7\3\2\2\2\u008f\u01d5\3\2\2\2\u0091\u0092\7\60\2\2\u0092\4\3\2\2"+
		"\2\u0093\u0094\7=\2\2\u0094\6\3\2\2\2\u0095\u0096\7<\2\2\u0096\b\3\2\2"+
		"\2\u0097\u0098\7*\2\2\u0098\n\3\2\2\2\u0099\u009a\7.\2\2\u009a\f\3\2\2"+
		"\2\u009b\u009c\7+\2\2\u009c\16\3\2\2\2\u009d\u009e\t\2\2\2\u009e\20\3"+
		"\2\2\2\u009f\u00a0\t\3\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"\24\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6"+
		"\30\3\2\2\2\u00a7\u00a8\t\7\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\t\b\2\2\u00aa"+
		"\34\3\2\2\2\u00ab\u00ac\t\t\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\t\n\2\2\u00ae"+
		" \3\2\2\2\u00af\u00b0\t\13\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\t\f\2\2\u00b2"+
		"$\3\2\2\2\u00b3\u00b4\t\r\2\2\u00b4&\3\2\2\2\u00b5\u00b6\t\16\2\2\u00b6"+
		"(\3\2\2\2\u00b7\u00b8\t\17\2\2\u00b8*\3\2\2\2\u00b9\u00ba\t\20\2\2\u00ba"+
		",\3\2\2\2\u00bb\u00bc\t\21\2\2\u00bc.\3\2\2\2\u00bd\u00be\t\22\2\2\u00be"+
		"\60\3\2\2\2\u00bf\u00c0\t\23\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\t\24\2\2"+
		"\u00c2\64\3\2\2\2\u00c3\u00c4\t\25\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\t"+
		"\26\2\2\u00c68\3\2\2\2\u00c7\u00c8\t\27\2\2\u00c8:\3\2\2\2\u00c9\u00ca"+
		"\t\30\2\2\u00ca<\3\2\2\2\u00cb\u00cc\t\31\2\2\u00cc>\3\2\2\2\u00cd\u00ce"+
		"\t\32\2\2\u00ce@\3\2\2\2\u00cf\u00d0\t\33\2\2\u00d0B\3\2\2\2\u00d1\u00d2"+
		"\5\31\r\2\u00d2\u00d3\5+\26\2\u00d3\u00d4\5\61\31\2\u00d4D\3\2\2\2\u00d5"+
		"\u00d6\5\65\33\2\u00d6\u00d7\5+\26\2\u00d7F\3\2\2\2\u00d8\u00d9\5;\36"+
		"\2\u00d9\u00da\5\35\17\2\u00da\u00db\5\37\20\2\u00db\u00dc\5%\23\2\u00dc"+
		"\u00dd\5\27\f\2\u00ddH\3\2\2\2\u00de\u00df\5\25\13\2\u00df\u00e0\5+\26"+
		"\2\u00e0J\3\2\2\2\u00e1\u00e2\5\25\13\2\u00e2\u00e3\5+\26\2\u00e3\u00e4"+
		"\5;\36\2\u00e4\u00e5\5)\25\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\5\65\33\2"+
		"\u00e7\u00e8\5+\26\2\u00e8L\3\2\2\2\u00e9\u00ea\5\17\b\2\u00ea\u00eb\5"+
		")\25\2\u00eb\u00ec\5\25\13\2\u00ecN\3\2\2\2\u00ed\u00ee\5+\26\2\u00ee"+
		"\u00ef\5\61\31\2\u00efP\3\2\2\2\u00f0\u00f1\5)\25\2\u00f1\u00f2\5+\26"+
		"\2\u00f2\u00f3\5\65\33\2\u00f3R\3\2\2\2\u00f4\u00f5\59\35\2\u00f5\u00f6"+
		"\5\17\b\2\u00f6\u00f7\5\61\31\2\u00f7T\3\2\2\2\u00f8\u00f9\5\37\20\2\u00f9"+
		"\u00fa\5\31\r\2\u00faV\3\2\2\2\u00fb\u00fc\5\65\33\2\u00fc\u00fd\5\35"+
		"\17\2\u00fd\u00fe\5\27\f\2\u00fe\u00ff\5)\25\2\u00ffX\3\2\2\2\u0100\u0101"+
		"\5\27\f\2\u0101\u0102\5%\23\2\u0102\u0103\5\63\32\2\u0103\u0104\5\27\f"+
		"\2\u0104Z\3\2\2\2\u0105\u0106\5\23\n\2\u0106\u0107\5+\26\2\u0107\u0108"+
		"\5)\25\2\u0108\u0109\5\63\32\2\u0109\u010a\5\65\33\2\u010a\\\3\2\2\2\u010b"+
		"\u010c\5-\27\2\u010c\u010d\5\61\31\2\u010d\u010e\5+\26\2\u010e\u010f\5"+
		"\33\16\2\u010f\u0110\5\61\31\2\u0110\u0111\5\17\b\2\u0111\u0112\5\'\24"+
		"\2\u0112^\3\2\2\2\u0113\u0114\5\23\n\2\u0114\u0115\5\17\b\2\u0115\u0116"+
		"\5\63\32\2\u0116\u0117\5\27\f\2\u0117`\3\2\2\2\u0118\u0119\5\21\t\2\u0119"+
		"\u011a\5+\26\2\u011a\u011b\5+\26\2\u011b\u011c\5%\23\2\u011c\u011d\5\27"+
		"\f\2\u011d\u011e\5\17\b\2\u011e\u011f\5)\25\2\u011fb\3\2\2\2\u0120\u0121"+
		"\5\61\31\2\u0121\u0122\5\27\f\2\u0122\u0123\5\17\b\2\u0123\u0124\5%\23"+
		"\2\u0124d\3\2\2\2\u0125\u0126\5\21\t\2\u0126\u0127\5\27\f\2\u0127\u0128"+
		"\5\33\16\2\u0128\u0129\5\37\20\2\u0129\u012a\5)\25\2\u012af\3\2\2\2\u012b"+
		"\u012c\5\27\f\2\u012c\u012d\5)\25\2\u012d\u012e\5\25\13\2\u012eh\3\2\2"+
		"\2\u012f\u0130\5;\36\2\u0130\u0131\5\61\31\2\u0131\u0132\5\37\20\2\u0132"+
		"\u0133\5\65\33\2\u0133\u0134\5\27\f\2\u0134\u0135\5%\23\2\u0135\u0136"+
		"\5)\25\2\u0136j\3\2\2\2\u0137\u0138\5\61\31\2\u0138\u0139\5\27\f\2\u0139"+
		"\u013a\5\17\b\2\u013a\u013b\5\25\13\2\u013b\u013c\5\37\20\2\u013c\u013d"+
		"\5)\25\2\u013dl\3\2\2\2\u013e\u013f\5+\26\2\u013f\u0140\5\31\r\2\u0140"+
		"n\3\2\2\2\u0141\u0142\t\34\2\2\u0142p\3\2\2\2\u0143\u0144\t\35\2\2\u0144"+
		"\u0145\t\36\2\2\u0145r\3\2\2\2\u0146\u0147\5\17\b\2\u0147\u0148\5)\25"+
		"\2\u0148\u0149\5\25\13\2\u0149\u014a\7\"\2\2\u014a\u014b\5\65\33\2\u014b"+
		"\u014c\5\35\17\2\u014c\u014d\5\27\f\2\u014d\u014e\5)\25\2\u014e\u0158"+
		"\3\2\2\2\u014f\u0150\5+\26\2\u0150\u0151\5\61\31\2\u0151\u0152\7\"\2\2"+
		"\u0152\u0153\5\27\f\2\u0153\u0154\5%\23\2\u0154\u0155\5\63\32\2\u0155"+
		"\u0156\5\27\f\2\u0156\u0158\3\2\2\2\u0157\u0146\3\2\2\2\u0157\u014f\3"+
		"\2\2\2\u0158t\3\2\2\2\u0159\u015a\5\27\f\2\u015a\u015b\5%\23\2\u015b\u015c"+
		"\5\63\32\2\u015c\u015d\5\27\f\2\u015d\u015e\7\"\2\2\u015e\u015f\5\37\20"+
		"\2\u015f\u0160\5\31\r\2\u0160v\3\2\2\2\u0161\u0162\5\21\t\2\u0162\u0163"+
		"\5\61\31\2\u0163\u0164\5\27\f\2\u0164\u0165\5\17\b\2\u0165\u0166\5#\22"+
		"\2\u0166x\3\2\2\2\u0167\u0168\5\23\n\2\u0168\u0169\5+\26\2\u0169\u016a"+
		"\5)\25\2\u016a\u016b\5\65\33\2\u016b\u016c\5\37\20\2\u016c\u016d\5)\25"+
		"\2\u016d\u016e\5\67\34\2\u016e\u016f\5\27\f\2\u016fz\3\2\2\2\u0170\u0171"+
		"\5-\27\2\u0171\u0172\5\61\31\2\u0172\u0173\5+\26\2\u0173\u0174\5\23\n"+
		"\2\u0174\u0175\5\27\f\2\u0175\u0176\5\25\13\2\u0176\u0177\5\67\34\2\u0177"+
		"\u0178\5\61\31\2\u0178\u0179\5\27\f\2\u0179|\3\2\2\2\u017a\u017b\5\31"+
		"\r\2\u017b\u017c\5\67\34\2\u017c\u017d\5)\25\2\u017d\u017e\5\23\n\2\u017e"+
		"\u017f\5\65\33\2\u017f\u0180\5\37\20\2\u0180\u0181\5+\26\2\u0181\u0182"+
		"\5)\25\2\u0182~\3\2\2\2\u0183\u0184\5\63\32\2\u0184\u0185\5\37\20\2\u0185"+
		"\u0186\5)\25\2\u0186\u0198\3\2\2\2\u0187\u0188\5\23\n\2\u0188\u0189\5"+
		"+\26\2\u0189\u018a\5\63\32\2\u018a\u0198\3\2\2\2\u018b\u018c\5%\23\2\u018c"+
		"\u018d\5)\25\2\u018d\u0198\3\2\2\2\u018e\u018f\5\27\f\2\u018f\u0190\5"+
		"=\37\2\u0190\u0191\5-\27\2\u0191\u0198\3\2\2\2\u0192\u0193\5\63\32\2\u0193"+
		"\u0194\5/\30\2\u0194\u0195\5\61\31\2\u0195\u0196\5\65\33\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0183\3\2\2\2\u0197\u0187\3\2\2\2\u0197\u018b\3\2\2\2\u0197"+
		"\u018e\3\2\2\2\u0197\u0192\3\2\2\2\u0198\u0080\3\2\2\2\u0199\u019f\t\37"+
		"\2\2\u019a\u019b\t\36\2\2\u019b\u019f\t\34\2\2\u019c\u019d\t\35\2\2\u019d"+
		"\u019f\t\34\2\2\u019e\u0199\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019c\3"+
		"\2\2\2\u019f\u0082\3\2\2\2\u01a0\u01a1\7*\2\2\u01a1\u01a2\7,\2\2\u01a2"+
		"\u01a6\3\2\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7,\2\2\u01aa\u01ab\7+\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01ad\bB\2\2\u01ad\u0084\3\2\2\2\u01ae\u01af\t \2\2\u01af\u0086"+
		"\3\2\2\2\u01b0\u01b1\t!\2\2\u01b1\u0088\3\2\2\2\u01b2\u01b3\5\65\33\2"+
		"\u01b3\u01b4\5\61\31\2\u01b4\u01b5\5\67\34\2\u01b5\u01b6\5\27\f\2\u01b6"+
		"\u01be\3\2\2\2\u01b7\u01b8\5\31\r\2\u01b8\u01b9\5\17\b\2\u01b9\u01ba\5"+
		"%\23\2\u01ba\u01bb\5\63\32\2\u01bb\u01bc\5\27\f\2\u01bc\u01be\3\2\2\2"+
		"\u01bd\u01b2\3\2\2\2\u01bd\u01b7\3\2\2\2\u01be\u008a\3\2\2\2\u01bf\u01c3"+
		"\t\"\2\2\u01c0\u01c2\t#\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u008c\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c8\t$\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01cb\t%\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\7\60\2\2\u01cf\u01d1\t%\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u008e\3\2\2\2\u01d4"+
		"\u01d6\t&\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\bH\2\2\u01da"+
		"\u0090\3\2\2\2\r\2\u0157\u0197\u019e\u01a6\u01bd\u01c3\u01c7\u01cc\u01d2"+
		"\u01d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}