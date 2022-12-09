// Generated from /home/srmaia/Documentos/GitHub/Compiler-LL1-Simple/newgrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newgrammarParser extends Parser {
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
		IGNORE=39, WHITESPACE=40, COMMENTLINES=41, COMMENTLINE=42, RESERVEDWORDS=43, 
		NUMBER=44, OPERATORSPOINTING=45, ID=46;
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
			"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'&&'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'true'", "'false'", "'new'", "'.'", "'length'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IGNORE", "WHITESPACE", "COMMENTLINES", "COMMENTLINE", 
			"RESERVEDWORDS", "NUMBER", "OPERATORSPOINTING", "ID"
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
	public String getGrammarFileName() { return "newgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public newgrammarParser(TokenStream input) {
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
		public List<TerminalNode> ID() { return getTokens(newgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newgrammarParser.ID, i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(51);
				cmd();
				}
			}

			setState(54);
			match(T__11);
			setState(55);
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
		public List<TerminalNode> ID() { return getTokens(newgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newgrammarParser.ID, i);
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
			setState(57);
			match(T__0);
			setState(58);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(59);
				match(T__12);
				setState(60);
				match(ID);
				}
			}

			setState(63);
			match(T__1);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case ID:
					{
					setState(64);
					var();
					}
					break;
				case T__2:
					{
					setState(65);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
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
			setState(73);
			tipo();
			setState(74);
			match(ID);
			setState(75);
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
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
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
			setState(77);
			match(T__2);
			setState(78);
			tipo();
			setState(79);
			match(ID);
			setState(80);
			match(T__6);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(81);
				params();
				}
			}

			setState(84);
			match(T__10);
			setState(85);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(86);
					var();
					}
					break;
				case 2:
					{
					setState(87);
					cmd();
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__14);
			setState(94);
			exp();
			setState(95);
			match(T__13);
			setState(96);
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
		public List<TerminalNode> ID() { return getTokens(newgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newgrammarParser.ID, i);
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
			setState(98);
			tipo();
			setState(99);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(100);
				match(T__15);
				setState(101);
				tipo();
				setState(102);
				match(ID);
				}
				}
				setState(108);
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
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__16);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(110);
					match(T__8);
					setState(111);
					match(T__9);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__17);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__1);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(122);
					cmd();
					}
				}

				setState(125);
				match(T__11);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__18);
				setState(127);
				match(T__6);
				setState(128);
				exp();
				setState(129);
				match(T__10);
				setState(130);
				cmd();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(131);
					match(T__19);
					setState(132);
					cmd();
					}
					break;
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__20);
				setState(136);
				match(T__6);
				setState(137);
				exp();
				setState(138);
				match(T__10);
				setState(139);
				cmd();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(T__21);
				setState(142);
				match(T__6);
				setState(143);
				exp();
				setState(144);
				match(T__10);
				setState(145);
				match(T__13);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(ID);
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(148);
					match(T__22);
					setState(149);
					exp();
					setState(150);
					match(T__13);
					}
					break;
				case T__8:
					{
					setState(152);
					match(T__8);
					setState(153);
					exp();
					setState(154);
					match(T__9);
					setState(155);
					match(T__22);
					setState(156);
					exp();
					setState(157);
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
			setState(163);
			rexp();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(164);
				match(T__23);
				setState(165);
				rexp();
				}
				}
				setState(170);
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
			setState(171);
			aexp();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(172);
					match(T__24);
					setState(173);
					aexp();
					}
					break;
				case T__25:
					{
					setState(174);
					match(T__25);
					setState(175);
					aexp();
					}
					break;
				case T__26:
					{
					setState(176);
					match(T__26);
					setState(177);
					aexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
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
			setState(183);
			mexp();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(184);
					match(T__27);
					setState(185);
					mexp();
					}
					break;
				case T__28:
					{
					setState(186);
					match(T__28);
					setState(187);
					mexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192);
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
			setState(193);
			sexp();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(194);
					match(T__29);
					setState(195);
					sexp();
					}
					break;
				case T__30:
					{
					setState(196);
					match(T__30);
					setState(197);
					sexp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
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
			case T__28:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				sexp();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(T__34);
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(208);
					match(T__16);
					setState(209);
					match(T__8);
					setState(210);
					exp();
					setState(211);
					match(T__9);
					}
					break;
				case ID:
					{
					setState(213);
					match(ID);
					setState(214);
					match(T__6);
					setState(215);
					match(T__10);
					setState(222);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__35:
						{
						setState(216);
						match(T__35);
						setState(217);
						match(T__36);
						}
						break;
					case T__8:
						{
						setState(218);
						match(T__8);
						setState(219);
						exp();
						setState(220);
						match(T__9);
						}
						break;
					case T__9:
					case T__10:
					case T__13:
					case T__15:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
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
				break;
			case T__6:
			case T__35:
			case T__37:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				pexp();
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(227);
					match(T__35);
					setState(228);
					match(T__36);
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
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
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
		public TerminalNode ID() { return getToken(newgrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(newgrammarParser.NUMBER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(NUMBER);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(T__37);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(T__6);
				setState(241);
				exp();
				setState(242);
				match(T__10);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(244);
				match(T__35);
				setState(245);
				match(ID);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(246);
					match(T__6);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << NUMBER) | (1L << ID))) != 0)) {
						{
						setState(247);
						exps();
						}
					}

					setState(250);
					match(T__10);
					}
					break;
				}
				}
				setState(253);
				pexp();
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
			setState(256);
			exp();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(257);
				match(T__15);
				setState(258);
				exp();
				}
				}
				setState(263);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\7\4E"+
		"\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6U\n"+
		"\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\b\7\bs\n\b\f\b\16\b"+
		"v\13\b\3\b\3\b\5\bz\n\b\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\5\t\u00a4\n\t"+
		"\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b5\n\13\f\13\16\13\u00b8\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\r\3\r\3\r\7\r\u00c9\n\r\f"+
		"\r\16\r\u00cc\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\5\16\u00e3"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ec\n\16\5\16\u00ee\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fb"+
		"\n\17\3\17\5\17\u00fe\n\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\7\20\u0106"+
		"\n\20\f\20\16\20\u0109\13\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36\2\3\4\2\37\37\"\"\2\u0126\2 \3\2\2\2\4\'\3\2\2\2\6;\3\2\2\2"+
		"\bK\3\2\2\2\nO\3\2\2\2\fd\3\2\2\2\16y\3\2\2\2\20\u00a3\3\2\2\2\22\u00a5"+
		"\3\2\2\2\24\u00ad\3\2\2\2\26\u00b9\3\2\2\2\30\u00c3\3\2\2\2\32\u00ed\3"+
		"\2\2\2\34\u0100\3\2\2\2\36\u0102\3\2\2\2 $\5\4\3\2!#\5\6\4\2\"!\3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'(\7\3\2\2()\7"+
		"\60\2\2)*\7\4\2\2*+\7\5\2\2+,\7\6\2\2,-\7\7\2\2-.\7\b\2\2./\7\t\2\2/\60"+
		"\7\n\2\2\60\61\7\13\2\2\61\62\7\f\2\2\62\63\7\60\2\2\63\64\7\r\2\2\64"+
		"\66\7\4\2\2\65\67\5\20\t\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7"+
		"\16\2\29:\7\16\2\2:\5\3\2\2\2;<\7\3\2\2<?\7\60\2\2=>\7\17\2\2>@\7\60\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AF\7\4\2\2BE\5\b\5\2CE\5\n\6\2DB\3\2\2"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\16"+
		"\2\2J\7\3\2\2\2KL\5\16\b\2LM\7\60\2\2MN\7\20\2\2N\t\3\2\2\2OP\7\5\2\2"+
		"PQ\5\16\b\2QR\7\60\2\2RT\7\t\2\2SU\5\f\7\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2VW\7\r\2\2W\\\7\4\2\2X[\5\b\5\2Y[\5\20\t\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\21\2\2`a\5\22\n\2"+
		"ab\7\20\2\2bc\7\16\2\2c\13\3\2\2\2de\5\16\b\2el\7\60\2\2fg\7\22\2\2gh"+
		"\5\16\b\2hi\7\60\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"m\r\3\2\2\2nl\3\2\2\2ot\7\23\2\2pq\7\13\2\2qs\7\f\2\2rp\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wz\7\24\2\2xz\7\60\2\2yo\3"+
		"\2\2\2yw\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{}\7\4\2\2|~\5\20\t\2}|\3\2\2\2"+
		"}~\3\2\2\2~\177\3\2\2\2\177\u00a4\7\16\2\2\u0080\u0081\7\25\2\2\u0081"+
		"\u0082\7\t\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7\r\2\2\u0084\u0087\5"+
		"\20\t\2\u0085\u0086\7\26\2\2\u0086\u0088\5\20\t\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u00a4\3\2\2\2\u0089\u008a\7\27\2\2\u008a\u008b"+
		"\7\t\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7\r\2\2\u008d\u008e\5\20\t\2"+
		"\u008e\u00a4\3\2\2\2\u008f\u0090\7\30\2\2\u0090\u0091\7\t\2\2\u0091\u0092"+
		"\5\22\n\2\u0092\u0093\7\r\2\2\u0093\u0094\7\20\2\2\u0094\u00a4\3\2\2\2"+
		"\u0095\u00a1\7\60\2\2\u0096\u0097\7\31\2\2\u0097\u0098\5\22\n\2\u0098"+
		"\u0099\7\20\2\2\u0099\u00a2\3\2\2\2\u009a\u009b\7\13\2\2\u009b\u009c\5"+
		"\22\n\2\u009c\u009d\7\f\2\2\u009d\u009e\7\31\2\2\u009e\u009f\5\22\n\2"+
		"\u009f\u00a0\7\20\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u009a"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3{\3\2\2\2\u00a3\u0080\3\2\2\2\u00a3"+
		"\u0089\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0095\3\2\2\2\u00a4\21\3\2\2"+
		"\2\u00a5\u00aa\5\24\13\2\u00a6\u00a7\7\32\2\2\u00a7\u00a9\5\24\13\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b6\5\26\f\2\u00ae\u00af"+
		"\7\33\2\2\u00af\u00b5\5\26\f\2\u00b0\u00b1\7\34\2\2\u00b1\u00b5\5\26\f"+
		"\2\u00b2\u00b3\7\35\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c0"+
		"\5\30\r\2\u00ba\u00bb\7\36\2\2\u00bb\u00bf\5\30\r\2\u00bc\u00bd\7\37\2"+
		"\2\u00bd\u00bf\5\30\r\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00ca\5\32\16\2\u00c4\u00c5\7 \2\2\u00c5"+
		"\u00c9\5\32\16\2\u00c6\u00c7\7!\2\2\u00c7\u00c9\5\32\16\2\u00c8\u00c4"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\2\2"+
		"\2\u00ce\u00ee\5\32\16\2\u00cf\u00ee\7#\2\2\u00d0\u00ee\7$\2\2\u00d1\u00e2"+
		"\7%\2\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\22\n\2"+
		"\u00d5\u00d6\7\f\2\2\u00d6\u00e3\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9"+
		"\7\t\2\2\u00d9\u00e0\7\r\2\2\u00da\u00db\7&\2\2\u00db\u00e1\7\'\2\2\u00dc"+
		"\u00dd\7\13\2\2\u00dd\u00de\5\22\n\2\u00de\u00df\7\f\2\2\u00df\u00e1\3"+
		"\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e3\u00ee\3\2"+
		"\2\2\u00e4\u00eb\5\34\17\2\u00e5\u00e6\7&\2\2\u00e6\u00ec\7\'\2\2\u00e7"+
		"\u00e8\7\13\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7\f\2\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00cd\3\2\2\2\u00ed\u00cf\3\2\2\2\u00ed\u00d0\3\2"+
		"\2\2\u00ed\u00d1\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u0101"+
		"\7\60\2\2\u00f0\u0101\7.\2\2\u00f1\u0101\7(\2\2\u00f2\u00f3\7\t\2\2\u00f3"+
		"\u00f4\5\22\n\2\u00f4\u00f5\7\r\2\2\u00f5\u0101\3\2\2\2\u00f6\u00f7\7"+
		"&\2\2\u00f7\u00fd\7\60\2\2\u00f8\u00fa\7\t\2\2\u00f9\u00fb\5\36\20\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7\r"+
		"\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\5\34\17\2\u0100\u00ef\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f1\3"+
		"\2\2\2\u0100\u00f2\3\2\2\2\u0100\u00f6\3\2\2\2\u0101\35\3\2\2\2\u0102"+
		"\u0107\5\22\n\2\u0103\u0104\7\22\2\2\u0104\u0106\5\22\n\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\37\3\2\2\2\u0109\u0107\3\2\2\2 $\66?DFTZ\\lty}\u0087\u00a1\u00a3\u00aa"+
		"\u00b4\u00b6\u00be\u00c0\u00c8\u00ca\u00e0\u00e2\u00eb\u00ed\u00fa\u00fd"+
		"\u0100\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}