// Generated from C:/projects/calc-engine/src/main/java/com/pryzintul/calcengine/grammar\Calculator.g4 by ANTLR 4.9.2
package com.pryzintul.calcengine.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MEDIA=3, MEDIA_MOVIL=4, AGRUPA=5, MENORQUE=6, TRUNCA=7, 
		ADAPTA=8, PROJECT=9, PROJECT_Q=10, PROJECT_Y=11, GET_RV=12, REDONDEO=13, 
		LPAREN=14, RPAREN=15, PLUS=16, MINUS=17, TIMES=18, DIV=19, EQ=20, POINT=21, 
		COMMA=22, LETTER=23, DIGIT=24, COMMENT=25, HASH=26, SPACE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MEDIA", "MEDIA_MOVIL", "AGRUPA", "MENORQUE", "TRUNCA", 
			"ADAPTA", "PROJECT", "PROJECT_Q", "PROJECT_Y", "GET_RV", "REDONDEO", 
			"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "EQ", "POINT", "COMMA", 
			"LETTER", "DIGIT", "COMMENT", "HASH", "SPACE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'media'", "'mediamovil'", "'agrupa'", "'menorQue'", 
			"'trunca'", "'adapta'", "'amplia'", "'ampliaQ'", "'ampliaY'", "'getRV'", 
			"'redondeo'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "'.'", 
			"','", null, null, null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MEDIA", "MEDIA_MOVIL", "AGRUPA", "MENORQUE", "TRUNCA", 
			"ADAPTA", "PROJECT", "PROJECT_Q", "PROJECT_Y", "GET_RV", "REDONDEO", 
			"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "EQ", "POINT", "COMMA", 
			"LETTER", "DIGIT", "COMMENT", "HASH", "SPACE", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u00ad\n\32\f\32"+
		"\16\32\u00b0\13\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\6\35\u00bb"+
		"\n\35\r\35\16\35\u00bc\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\7\2C\\aac|\u00d3\u00d3\u00f3"+
		"\u00f3\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00c1\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3"+
		"\2\2\2\tE\3\2\2\2\13P\3\2\2\2\rW\3\2\2\2\17`\3\2\2\2\21g\3\2\2\2\23n\3"+
		"\2\2\2\25u\3\2\2\2\27}\3\2\2\2\31\u0085\3\2\2\2\33\u008b\3\2\2\2\35\u0094"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2"+
		"\'\u009e\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3"+
		"\2\2\2\61\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2"+
		"\2\29\u00ba\3\2\2\2;<\7]\2\2<\4\3\2\2\2=>\7_\2\2>\6\3\2\2\2?@\7o\2\2@"+
		"A\7g\2\2AB\7f\2\2BC\7k\2\2CD\7c\2\2D\b\3\2\2\2EF\7o\2\2FG\7g\2\2GH\7f"+
		"\2\2HI\7k\2\2IJ\7c\2\2JK\7o\2\2KL\7q\2\2LM\7x\2\2MN\7k\2\2NO\7n\2\2O\n"+
		"\3\2\2\2PQ\7c\2\2QR\7i\2\2RS\7t\2\2ST\7w\2\2TU\7r\2\2UV\7c\2\2V\f\3\2"+
		"\2\2WX\7o\2\2XY\7g\2\2YZ\7p\2\2Z[\7q\2\2[\\\7t\2\2\\]\7S\2\2]^\7w\2\2"+
		"^_\7g\2\2_\16\3\2\2\2`a\7v\2\2ab\7t\2\2bc\7w\2\2cd\7p\2\2de\7e\2\2ef\7"+
		"c\2\2f\20\3\2\2\2gh\7c\2\2hi\7f\2\2ij\7c\2\2jk\7r\2\2kl\7v\2\2lm\7c\2"+
		"\2m\22\3\2\2\2no\7c\2\2op\7o\2\2pq\7r\2\2qr\7n\2\2rs\7k\2\2st\7c\2\2t"+
		"\24\3\2\2\2uv\7c\2\2vw\7o\2\2wx\7r\2\2xy\7n\2\2yz\7k\2\2z{\7c\2\2{|\7"+
		"S\2\2|\26\3\2\2\2}~\7c\2\2~\177\7o\2\2\177\u0080\7r\2\2\u0080\u0081\7"+
		"n\2\2\u0081\u0082\7k\2\2\u0082\u0083\7c\2\2\u0083\u0084\7[\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7i\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7T\2\2\u0089\u008a\7X\2\2\u008a\32\3\2\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2"+
		"\u0090\u0091\7f\2\2\u0091\u0092\7g\2\2\u0092\u0093\7q\2\2\u0093\34\3\2"+
		"\2\2\u0094\u0095\7*\2\2\u0095\36\3\2\2\2\u0096\u0097\7+\2\2\u0097 \3\2"+
		"\2\2\u0098\u0099\7-\2\2\u0099\"\3\2\2\2\u009a\u009b\7/\2\2\u009b$\3\2"+
		"\2\2\u009c\u009d\7,\2\2\u009d&\3\2\2\2\u009e\u009f\7\61\2\2\u009f(\3\2"+
		"\2\2\u00a0\u00a1\7?\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3,\3\2"+
		"\2\2\u00a4\u00a5\7.\2\2\u00a5.\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7\60\3"+
		"\2\2\2\u00a8\u00a9\4\62;\2\u00a9\62\3\2\2\2\u00aa\u00ae\5\65\33\2\u00ab"+
		"\u00ad\n\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\b\32\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\66\3\2\2\2\u00b5"+
		"\u00b6\t\4\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\34\2\2\u00b88\3\2\2\2"+
		"\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\35\3\2"+
		"\u00bf:\3\2\2\2\5\2\u00ae\u00bc\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}