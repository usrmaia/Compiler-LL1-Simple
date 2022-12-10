// Generated from /home/srmaia/Documentos/GitHub/Compiler-LL1-Simple/Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, WHITESPACE=41, NUMBER=42, ID=43;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_classe = 2, RULE_var = 3, RULE_metodo = 4, 
		RULE_params = 5, RULE_tipo = 6, RULE_cmd = 7, RULE_exp = 8, RULE_rexp = 9, 
		RULE_aexp = 10, RULE_mexp = 11, RULE_sexp = 12, RULE_pexp = 13, RULE_exps = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "classe", "var", "metodo", "params", "tipo", "cmd", "exp", 
			"rexp", "aexp", "mexp", "sexp", "pexp", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
			"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System'", 
			"'.'", "'out'", "'println'", "'='", "'&&'", "'<'", "'=='", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'new'", "'length'", 
			"'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WHITESPACE", "NUMBER", "ID"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			main();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(31);
				classe();
				}
				}
				setState(36);
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

	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			match(T__4);
			setState(43);
			match(T__5);
			setState(44);
			match(T__6);
			setState(45);
			match(T__7);
			setState(46);
			match(T__8);
			setState(47);
			match(T__9);
			setState(48);
			match(ID);
			setState(49);
			match(T__10);
			setState(50);
			match(T__1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(51);
				cmd();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__11);
			setState(58);
			match(T__11);
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

	public static class ClasseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(62);
				match(T__12);
				setState(63);
				match(ID);
				}
			}

			setState(66);
			match(T__1);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case ID:
					{
					setState(67);
					var();
					}
					break;
				case T__2:
					{
					setState(68);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__11);
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

	public static class VarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			tipo();
			setState(77);
			match(ID);
			setState(78);
			match(T__13);
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

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			tipo();
			setState(82);
			match(ID);
			setState(83);
			match(T__6);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(84);
				params();
				}
			}

			setState(87);
			match(T__10);
			setState(88);
			match(T__1);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(89);
					var();
					}
					break;
				case 2:
					{
					setState(90);
					cmd();
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__14);
			setState(97);
			exp();
			setState(98);
			match(T__13);
			setState(99);
			match(T__11);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			tipo();
			setState(102);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(103);
				match(T__15);
				setState(104);
				tipo();
				setState(105);
				match(ID);
				}
				}
				setState(111);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__16);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(113);
					match(T__8);
					setState(114);
					match(T__9);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__17);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ID);
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

	public static class CmdContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__1);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(125);
					cmd();
					}
				}

				setState(128);
				match(T__11);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__18);
				setState(130);
				match(T__6);
				setState(131);
				exp();
				setState(132);
				match(T__10);
				setState(133);
				cmd();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(134);
					match(T__19);
					setState(135);
					cmd();
					}
					break;
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__20);
				setState(139);
				match(T__6);
				setState(140);
				exp();
				setState(141);
				match(T__10);
				setState(142);
				cmd();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__21);
				setState(145);
				match(T__22);
				setState(146);
				match(T__23);
				setState(147);
				match(T__22);
				setState(148);
				match(T__24);
				setState(149);
				match(T__6);
				setState(150);
				exp();
				setState(151);
				match(T__10);
				setState(152);
				match(T__13);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(155);
					match(T__25);
					setState(156);
					exp();
					setState(157);
					match(T__13);
					}
					break;
				case T__8:
					{
					setState(159);
					match(T__8);
					setState(160);
					exp();
					setState(161);
					match(T__9);
					setState(162);
					match(T__25);
					setState(163);
					exp();
					setState(164);
					match(T__13);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ExpContext extends ParserRuleContext {
		public List<RexpContext> rexp() {
			return getRuleContexts(RexpContext.class);
		}
		public RexpContext rexp(int i) {
			return getRuleContext(RexpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			rexp();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(171);
				match(T__26);
				setState(172);
				rexp();
				}
				}
				setState(177);
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

	public static class RexpContext extends ParserRuleContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	}

	public final RexpContext rexp() throws RecognitionException {
		RexpContext _localctx = new RexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			aexp();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(179);
					match(T__27);
					setState(180);
					aexp();
					}
					break;
				case T__28:
					{
					setState(181);
					match(T__28);
					setState(182);
					aexp();
					}
					break;
				case T__29:
					{
					setState(183);
					match(T__29);
					setState(184);
					aexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
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

	public static class AexpContext extends ParserRuleContext {
		public List<MexpContext> mexp() {
			return getRuleContexts(MexpContext.class);
		}
		public MexpContext mexp(int i) {
			return getRuleContext(MexpContext.class,i);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			mexp();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || _la==T__31) {
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
					{
					setState(191);
					match(T__30);
					setState(192);
					mexp();
					}
					break;
				case T__31:
					{
					setState(193);
					match(T__31);
					setState(194);
					mexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(199);
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

	public static class MexpContext extends ParserRuleContext {
		public List<SexpContext> sexp() {
			return getRuleContexts(SexpContext.class);
		}
		public SexpContext sexp(int i) {
			return getRuleContext(SexpContext.class,i);
		}
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	}

	public final MexpContext mexp() throws RecognitionException {
		MexpContext _localctx = new MexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			sexp();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
					{
					setState(201);
					match(T__32);
					setState(202);
					sexp();
					}
					break;
				case T__33:
					{
					setState(203);
					match(T__33);
					setState(204);
					sexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(209);
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

	public static class SexpContext extends ParserRuleContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sexp);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				sexp();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(T__37);
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(215);
					match(T__16);
					setState(216);
					match(T__8);
					setState(217);
					exp();
					setState(218);
					match(T__9);
					}
					break;
				case ID:
					{
					setState(220);
					match(ID);
					setState(221);
					match(T__6);
					setState(222);
					match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				pexp();
				}
				break;
			case T__6:
			case T__22:
			case T__39:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				pexp();
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(227);
					match(T__22);
					setState(228);
					match(T__38);
					}
					break;
				case T__8:
					{
					setState(229);
					match(T__8);
					setState(230);
					exp();
					setState(231);
					match(T__9);
					}
					break;
				case T__9:
				case T__10:
				case T__13:
				case T__15:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					break;
				default:
					break;
				}
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

	public static class PexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pexp);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ID);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(238);
					match(T__6);
					setState(239);
					match(T__10);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__39);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(244);
					pexp();
					}
					break;
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(T__6);
				setState(248);
				exp();
				setState(249);
				match(T__10);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(251);
				match(T__22);
				setState(252);
				match(ID);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(253);
					match(T__6);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << NUMBER) | (1L << ID))) != 0)) {
						{
						setState(254);
						exps();
						}
					}

					setState(257);
					match(T__10);
					}
					break;
				}
				}
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(260);
					pexp();
					}
					break;
				}
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

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			exp();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(266);
				match(T__15);
				setState(267);
				exp();
				}
				}
				setState(272);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4C\n\4\3\4"+
		"\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6X\n\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\b\3\b\3\b\7\b"+
		"v\n\b\f\b\16\by\13\b\3\b\3\b\5\b}\n\b\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00a9\n\t\5\t\u00ab\n\t\3\n\3\n\3\n\7\n\u00b0\n\n\f\n\16"+
		"\n\u00b3\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bc\n\13\f\13"+
		"\16\13\u00bf\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ec\n\16\5\16\u00ee\n\16\3"+
		"\17\3\17\3\17\5\17\u00f3\n\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0102\n\17\3\17\5\17\u0105\n\17\3"+
		"\17\5\17\u0108\n\17\5\17\u010a\n\17\3\20\3\20\3\20\7\20\u010f\n\20\f\20"+
		"\16\20\u0112\13\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\3\4\2\"\"%%\2\u0130\2 \3\2\2\2\4\'\3\2\2\2\6>\3\2\2\2\bN\3\2\2\2\n"+
		"R\3\2\2\2\fg\3\2\2\2\16|\3\2\2\2\20\u00aa\3\2\2\2\22\u00ac\3\2\2\2\24"+
		"\u00b4\3\2\2\2\26\u00c0\3\2\2\2\30\u00ca\3\2\2\2\32\u00ed\3\2\2\2\34\u0109"+
		"\3\2\2\2\36\u010b\3\2\2\2 $\5\4\3\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'(\7\3\2\2()\7-\2\2)*\7\4\2\2"+
		"*+\7\5\2\2+,\7\6\2\2,-\7\7\2\2-.\7\b\2\2./\7\t\2\2/\60\7\n\2\2\60\61\7"+
		"\13\2\2\61\62\7\f\2\2\62\63\7-\2\2\63\64\7\r\2\2\648\7\4\2\2\65\67\5\20"+
		"\t\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2"+
		"\2;<\7\16\2\2<=\7\16\2\2=\5\3\2\2\2>?\7\3\2\2?B\7-\2\2@A\7\17\2\2AC\7"+
		"-\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DI\7\4\2\2EH\5\b\5\2FH\5\n\6\2GE\3"+
		"\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7"+
		"\16\2\2M\7\3\2\2\2NO\5\16\b\2OP\7-\2\2PQ\7\20\2\2Q\t\3\2\2\2RS\7\5\2\2"+
		"ST\5\16\b\2TU\7-\2\2UW\7\t\2\2VX\5\f\7\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2"+
		"YZ\7\r\2\2Z_\7\4\2\2[^\5\b\5\2\\^\5\20\t\2][\3\2\2\2]\\\3\2\2\2^a\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\21\2\2cd\5\22\n\2de\7"+
		"\20\2\2ef\7\16\2\2f\13\3\2\2\2gh\5\16\b\2ho\7-\2\2ij\7\22\2\2jk\5\16\b"+
		"\2kl\7-\2\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2"+
		"\2qo\3\2\2\2rw\7\23\2\2st\7\13\2\2tv\7\f\2\2us\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z}\7\24\2\2{}\7-\2\2|r\3\2\2\2|z\3\2"+
		"\2\2|{\3\2\2\2}\17\3\2\2\2~\u0080\7\4\2\2\177\u0081\5\20\t\2\u0080\177"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u00ab\7\16\2\2"+
		"\u0083\u0084\7\25\2\2\u0084\u0085\7\t\2\2\u0085\u0086\5\22\n\2\u0086\u0087"+
		"\7\r\2\2\u0087\u008a\5\20\t\2\u0088\u0089\7\26\2\2\u0089\u008b\5\20\t"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u00ab\3\2\2\2\u008c\u008d"+
		"\7\27\2\2\u008d\u008e\7\t\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\r\2\2"+
		"\u0090\u0091\5\20\t\2\u0091\u00ab\3\2\2\2\u0092\u0093\7\30\2\2\u0093\u0094"+
		"\7\31\2\2\u0094\u0095\7\32\2\2\u0095\u0096\7\31\2\2\u0096\u0097\7\33\2"+
		"\2\u0097\u0098\7\t\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\r\2\2\u009a"+
		"\u009b\7\20\2\2\u009b\u00ab\3\2\2\2\u009c\u00a8\7-\2\2\u009d\u009e\7\34"+
		"\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\20\2\2\u00a0\u00a9\3\2\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7"+
		"\34\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7\20\2\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8\u009d\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa~\3"+
		"\2\2\2\u00aa\u0083\3\2\2\2\u00aa\u008c\3\2\2\2\u00aa\u0092\3\2\2\2\u00aa"+
		"\u009c\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b1\5\24\13\2\u00ad\u00ae\7\35"+
		"\2\2\u00ae\u00b0\5\24\13\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00bd\5\26\f\2\u00b5\u00b6\7\36\2\2\u00b6\u00bc\5\26\f\2\u00b7"+
		"\u00b8\7\37\2\2\u00b8\u00bc\5\26\f\2\u00b9\u00ba\7 \2\2\u00ba\u00bc\5"+
		"\26\f\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\25\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00c0\u00c7\5\30\r\2\u00c1\u00c2\7!\2\2\u00c2\u00c6"+
		"\5\30\r\2\u00c3\u00c4\7\"\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c1\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d1\5\32\16\2\u00cb"+
		"\u00cc\7#\2\2\u00cc\u00d0\5\32\16\2\u00cd\u00ce\7$\2\2\u00ce\u00d0\5\32"+
		"\16\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d5\t\2\2\2\u00d5\u00ee\5\32\16\2\u00d6\u00ee\7&\2\2\u00d7"+
		"\u00ee\7\'\2\2\u00d8\u00e1\7(\2\2\u00d9\u00da\7\23\2\2\u00da\u00db\7\13"+
		"\2\2\u00db\u00dc\5\22\n\2\u00dc\u00dd\7\f\2\2\u00dd\u00e2\3\2\2\2\u00de"+
		"\u00df\7-\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e2\7\r\2\2\u00e1\u00d9\3\2"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ee\5\34\17\2\u00e4"+
		"\u00eb\5\34\17\2\u00e5\u00e6\7\31\2\2\u00e6\u00ec\7)\2\2\u00e7\u00e8\7"+
		"\13\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7\f\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00d4\3\2\2\2\u00ed\u00d6\3\2\2\2\u00ed\u00d7\3\2\2\2\u00ed"+
		"\u00d8\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f2\7-\2\2"+
		"\u00f0\u00f1\7\t\2\2\u00f1\u00f3\7\r\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u010a\3\2\2\2\u00f4\u010a\7,\2\2\u00f5\u00f7\7*\2\2\u00f6"+
		"\u00f8\5\34\17\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u010a\3"+
		"\2\2\2\u00f9\u00fa\7\t\2\2\u00fa\u00fb\5\22\n\2\u00fb\u00fc\7\r\2\2\u00fc"+
		"\u010a\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u0104\7-\2\2\u00ff\u0101\7\t"+
		"\2\2\u0100\u0102\5\36\20\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\7\r\2\2\u0104\u00ff\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5\34\17\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u00ef\3\2\2\2\u0109\u00f4\3\2"+
		"\2\2\u0109\u00f5\3\2\2\2\u0109\u00f9\3\2\2\2\u0109\u00fd\3\2\2\2\u010a"+
		"\35\3\2\2\2\u010b\u0110\5\22\n\2\u010c\u010d\7\22\2\2\u010d\u010f\5\22"+
		"\n\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\37\3\2\2\2\u0112\u0110\3\2\2\2\"$8BGIW]_ow|\u0080"+
		"\u008a\u00a8\u00aa\u00b1\u00bb\u00bd\u00c5\u00c7\u00cf\u00d1\u00e1\u00eb"+
		"\u00ed\u00f2\u00f7\u0101\u0104\u0107\u0109\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}