// Generated from C:/projects/calc-engine/src/main/java/com/pryzintul/calcengine/grammar\Calculator.g4 by ANTLR 4.9.2
package com.pryzintul.calcengine.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MEDIA=3, MEDIA_MOVIL=4, AGRUPA=5, MENORQUE=6, TRUNCA=7, 
		ADAPTA=8, PROJECT=9, PROJECT_Q=10, PROJECT_Y=11, GET_RV=12, REDONDEO=13, 
		LPAREN=14, RPAREN=15, PLUS=16, MINUS=17, TIMES=18, DIV=19, EQ=20, POINT=21, 
		COMMA=22, LETTER=23, DIGIT=24, COMMENT=25, HASH=26, SPACE=27, WS=28;
	public static final int
		RULE_parse = 0, RULE_resvariable = 1, RULE_expression = 2, RULE_funcnameparams = 3, 
		RULE_funcname = 4, RULE_varname = 5, RULE_dimension = 6, RULE_funcparams = 7, 
		RULE_expressionorarray = 8, RULE_relop = 9, RULE_number = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "resvariable", "expression", "funcnameparams", "funcname", "varname", 
			"dimension", "funcparams", "expressionorarray", "relop", "number"
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

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public ResvariableContext resvariable() {
			return getRuleContext(ResvariableContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			resvariable();
			setState(23);
			relop();
			setState(24);
			expression(0);
			setState(25);
			match(EOF);
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

	public static class ResvariableContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(CalculatorParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(CalculatorParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorParser.DIGIT, i);
		}
		public ResvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterResvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitResvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitResvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResvariableContext resvariable() throws RecognitionException {
		ResvariableContext _localctx = new ResvariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_resvariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(LETTER);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER || _la==DIGIT );
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncEmptyContext extends ExpressionContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public FuncEmptyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public SubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSubExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomNumberContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AtomNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public ParenthesisExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParenthesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParenthesisExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParenthesisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncArgsContext extends ExpressionContext {
		public FuncnameparamsContext funcnameparams() {
			return getRuleContext(FuncnameparamsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public FuncparamsContext funcparams() {
			return getRuleContext(FuncparamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public FuncArgsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public AddExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(CalculatorParser.TIMES, 0); }
		public MulExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomVarContext extends ExpressionContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public AtomVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAtomVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAtomVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAtomVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public DivExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				match(LPAREN);
				setState(35);
				expression(0);
				setState(36);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new FuncArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				funcnameparams();
				setState(39);
				match(LPAREN);
				setState(40);
				funcparams();
				setState(41);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new FuncEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				funcname();
				setState(44);
				match(LPAREN);
				setState(45);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new AtomNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				number();
				}
				break;
			case 5:
				{
				_localctx = new AtomVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				varname();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(52);
						match(TIMES);
						setState(53);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new DivExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(55);
						match(DIV);
						setState(56);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new AddExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						match(PLUS);
						setState(59);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new SubExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(61);
						match(MINUS);
						setState(62);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FuncnameparamsContext extends ParserRuleContext {
		public TerminalNode MEDIA() { return getToken(CalculatorParser.MEDIA, 0); }
		public TerminalNode AGRUPA() { return getToken(CalculatorParser.AGRUPA, 0); }
		public TerminalNode TRUNCA() { return getToken(CalculatorParser.TRUNCA, 0); }
		public TerminalNode MENORQUE() { return getToken(CalculatorParser.MENORQUE, 0); }
		public TerminalNode GET_RV() { return getToken(CalculatorParser.GET_RV, 0); }
		public TerminalNode ADAPTA() { return getToken(CalculatorParser.ADAPTA, 0); }
		public TerminalNode PROJECT_Q() { return getToken(CalculatorParser.PROJECT_Q, 0); }
		public TerminalNode PROJECT_Y() { return getToken(CalculatorParser.PROJECT_Y, 0); }
		public TerminalNode PROJECT() { return getToken(CalculatorParser.PROJECT, 0); }
		public TerminalNode MEDIA_MOVIL() { return getToken(CalculatorParser.MEDIA_MOVIL, 0); }
		public TerminalNode REDONDEO() { return getToken(CalculatorParser.REDONDEO, 0); }
		public FuncnameparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcnameparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncnameparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncnameparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncnameparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameparamsContext funcnameparams() throws RecognitionException {
		FuncnameparamsContext _localctx = new FuncnameparamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcnameparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEDIA) | (1L << MEDIA_MOVIL) | (1L << AGRUPA) | (1L << MENORQUE) | (1L << TRUNCA) | (1L << ADAPTA) | (1L << PROJECT) | (1L << PROJECT_Q) | (1L << PROJECT_Y) | (1L << GET_RV) | (1L << REDONDEO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(CalculatorParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(CalculatorParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorParser.DIGIT, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LETTER);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER || _la==DIGIT );
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

	public static class VarnameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(CalculatorParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(CalculatorParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorParser.DIGIT, i);
		}
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varname);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LETTER);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DimensionContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(CalculatorParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(CalculatorParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorParser.DIGIT, i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LETTER);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER || _la==DIGIT );
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

	public static class FuncparamsContext extends ParserRuleContext {
		public List<ExpressionorarrayContext> expressionorarray() {
			return getRuleContexts(ExpressionorarrayContext.class);
		}
		public ExpressionorarrayContext expressionorarray(int i) {
			return getRuleContext(ExpressionorarrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public FuncparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncparamsContext funcparams() throws RecognitionException {
		FuncparamsContext _localctx = new FuncparamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			expressionorarray();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				expressionorarray();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionorarrayContext extends ParserRuleContext {
		public ExpressionorarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionorarray; }
	 
		public ExpressionorarrayContext() { }
		public void copyFrom(ExpressionorarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayparamContext extends ExpressionorarrayContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public ArrayparamContext(ExpressionorarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterArrayparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitArrayparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitArrayparam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyarrayContext extends ExpressionorarrayContext {
		public EmptyarrayContext(ExpressionorarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterEmptyarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitEmptyarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitEmptyarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionparamContext extends ExpressionorarrayContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionparamContext(ExpressionorarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpressionparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpressionparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExpressionparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionorarrayContext expressionorarray() throws RecognitionException {
		ExpressionorarrayContext _localctx = new ExpressionorarrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionorarray);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ExpressionparamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrayparamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__0);
				setState(98);
				dimension();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					dimension();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new EmptyarrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__0);
				setState(109);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CalculatorParser.EQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(EQ);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(CalculatorParser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(114);
				match(MINUS);
				}
			}

			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(122);
				match(POINT);
				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3"+
		"\5\3\5\3\6\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\b\3\b\6"+
		"\bW\n\b\r\b\16\bX\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\f\5"+
		"\fv\n\f\3\f\6\fy\n\f\r\f\16\fz\3\f\3\f\6\f\177\n\f\r\f\16\f\u0080\5\f"+
		"\u0083\n\f\3\f\2\3\6\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\31\32\3\2\5"+
		"\17\2\u008d\2\30\3\2\2\2\4\35\3\2\2\2\6\63\3\2\2\2\bF\3\2\2\2\nH\3\2\2"+
		"\2\fN\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26u\3\2"+
		"\2\2\30\31\5\4\3\2\31\32\5\24\13\2\32\33\5\6\4\2\33\34\7\2\2\3\34\3\3"+
		"\2\2\2\35\37\7\31\2\2\36 \t\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"\5\3\2\2\2#$\b\4\1\2$%\7\20\2\2%&\5\6\4\2&\'\7\21\2\2\'\64"+
		"\3\2\2\2()\5\b\5\2)*\7\20\2\2*+\5\20\t\2+,\7\21\2\2,\64\3\2\2\2-.\5\n"+
		"\6\2./\7\20\2\2/\60\7\21\2\2\60\64\3\2\2\2\61\64\5\26\f\2\62\64\5\f\7"+
		"\2\63#\3\2\2\2\63(\3\2\2\2\63-\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
		"C\3\2\2\2\65\66\f\n\2\2\66\67\7\24\2\2\67B\5\6\4\1389\f\t\2\29:\7\25\2"+
		"\2:B\5\6\4\n;<\f\b\2\2<=\7\22\2\2=B\5\6\4\t>?\f\7\2\2?@\7\23\2\2@B\5\6"+
		"\4\bA\65\3\2\2\2A8\3\2\2\2A;\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2D\7\3\2\2\2EC\3\2\2\2FG\t\3\2\2G\t\3\2\2\2HJ\7\31\2\2IK\t\2\2\2"+
		"JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NP\7\31\2\2OQ\t\2"+
		"\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TV\7\31\2\2UW\t"+
		"\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z_\5\22\n\2"+
		"[\\\7\30\2\2\\^\5\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3"+
		"\2\2\2a_\3\2\2\2bq\5\6\4\2cd\7\3\2\2di\5\16\b\2ef\7\30\2\2fh\5\16\b\2"+
		"ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\4\2\2"+
		"mq\3\2\2\2no\7\3\2\2oq\7\4\2\2pb\3\2\2\2pc\3\2\2\2pn\3\2\2\2q\23\3\2\2"+
		"\2rs\7\26\2\2s\25\3\2\2\2tv\7\23\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7"+
		"\32\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7\27"+
		"\2\2}\177\7\32\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\27\3\2\2\2\20!\63ACLRX_ipuz\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}