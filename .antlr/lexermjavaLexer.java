// Generated from /home/srmaia/Documentos/GitHub/Compiler-LL1-Simple/lexermjava.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexermjavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IGNORE=1, WHITESPACE=2, COMMENTLINES=3, COMMENTLINE=4, RESERVEDWORDS=5, 
		NUMBER=6, OPERATORSPOINTING=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IGNORE", "WHITESPACE", "COMMENTLINES", "COMMENTLINE", "RESERVEDWORDS", 
			"NUMBER", "OPERATORSPOINTING", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IGNORE", "WHITESPACE", "COMMENTLINES", "COMMENTLINE", "RESERVEDWORDS", 
			"NUMBER", "OPERATORSPOINTING", "ID"
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


	public lexermjavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexermjava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\5\2\27\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d"+
		"\n\6\3\7\6\7\u00a0\n\7\r\7\16\7\u00a1\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00ad\n\b\3\t\5\t\u00b0\n\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6"+
		"\13\t\4\".\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\t\5\2\n\f\17\17"+
		"\"\"\3\2\f\f\3\2\62;\n\2*+..\60\60=?]]__}}\177\177\5\2,-//\61\61\4\2C"+
		"\\c|\7\2//\62;C\\aac|\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\26\3\2\2"+
		"\2\5\32\3\2\2\2\7\34\3\2\2\2\t(\3\2\2\2\13\u009c\3\2\2\2\r\u009f\3\2\2"+
		"\2\17\u00ac\3\2\2\2\21\u00af\3\2\2\2\23\27\5\5\3\2\24\27\5\t\5\2\25\27"+
		"\5\7\4\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\31"+
		"\b\2\2\2\31\4\3\2\2\2\32\33\t\2\2\2\33\6\3\2\2\2\34\35\7\61\2\2\35\36"+
		"\7,\2\2\36\"\3\2\2\2\37!\13\2\2\2 \37\3\2\2\2!$\3\2\2\2\"#\3\2\2\2\" "+
		"\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7,\2\2&\'\7\61\2\2\'\b\3\2\2\2()\7\61"+
		"\2\2)*\7\61\2\2*.\3\2\2\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2."+
		",\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\t\3\2\2\62\n\3\2\2\2\63\64\7d"+
		"\2\2\64\65\7q\2\2\65\66\7q\2\2\66\67\7n\2\2\678\7g\2\289\7c\2\29\u009d"+
		"\7p\2\2:;\7e\2\2;<\7n\2\2<=\7c\2\2=>\7u\2\2>\u009d\7u\2\2?@\7g\2\2@A\7"+
		"z\2\2AB\7v\2\2BC\7g\2\2CD\7p\2\2DE\7f\2\2E\u009d\7u\2\2FG\7r\2\2GH\7w"+
		"\2\2HI\7d\2\2IJ\7n\2\2JK\7k\2\2K\u009d\7e\2\2LM\7u\2\2MN\7v\2\2NO\7c\2"+
		"\2OP\7v\2\2PQ\7k\2\2Q\u009d\7e\2\2RS\7x\2\2ST\7q\2\2TU\7k\2\2U\u009d\7"+
		"f\2\2VW\7o\2\2WX\7c\2\2XY\7k\2\2Y\u009d\7p\2\2Z[\7U\2\2[\\\7v\2\2\\]\7"+
		"t\2\2]^\7k\2\2^_\7p\2\2_\u009d\7i\2\2`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7w"+
		"\2\2de\7t\2\2e\u009d\7p\2\2fg\7k\2\2gh\7p\2\2h\u009d\7v\2\2ij\7k\2\2j"+
		"\u009d\7h\2\2kl\7g\2\2lm\7n\2\2mn\7u\2\2n\u009d\7g\2\2op\7y\2\2pq\7j\2"+
		"\2qr\7k\2\2rs\7n\2\2s\u009d\7g\2\2tu\7U\2\2uv\7{\2\2vw\7u\2\2wx\7v\2\2"+
		"xy\7g\2\2yz\7o\2\2z{\7\60\2\2{|\7q\2\2|}\7w\2\2}~\7v\2\2~\177\7\60\2\2"+
		"\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7"+
		"p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7n\2\2\u0085\u009d\7p\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u009d\7j\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2"+
		"\u008e\u008f\7w\2\2\u008f\u009d\7g\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u009d\7g\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u009d\7u\2\2"+
		"\u0099\u009a\7p\2\2\u009a\u009b\7g\2\2\u009b\u009d\7y\2\2\u009c\63\3\2"+
		"\2\2\u009c:\3\2\2\2\u009c?\3\2\2\2\u009cF\3\2\2\2\u009cL\3\2\2\2\u009c"+
		"R\3\2\2\2\u009cV\3\2\2\2\u009cZ\3\2\2\2\u009c`\3\2\2\2\u009cf\3\2\2\2"+
		"\u009ci\3\2\2\2\u009ck\3\2\2\2\u009co\3\2\2\2\u009ct\3\2\2\2\u009c\u0086"+
		"\3\2\2\2\u009c\u008c\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0095\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\f\3\2\2\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\16"+
		"\3\2\2\2\u00a3\u00ad\t\5\2\2\u00a4\u00a5\7?\2\2\u00a5\u00ad\7?\2\2\u00a6"+
		"\u00a7\7#\2\2\u00a7\u00ad\7?\2\2\u00a8\u00ad\t\6\2\2\u00a9\u00aa\7(\2"+
		"\2\u00aa\u00ad\7(\2\2\u00ab\u00ad\7#\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4"+
		"\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\20\3\2\2\2\u00ae\u00b0\t\7\2\2\u00af\u00ae\3\2\2"+
		"\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\t\b\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\f\2\26\".\u009c\u00a1\u00ac\u00af\u00b2\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}