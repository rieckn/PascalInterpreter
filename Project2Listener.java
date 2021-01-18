// Generated from Project2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Project2Parser}.
 */
public interface Project2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Project2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Project2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Project2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#mainblock}.
	 * @param ctx the parse tree
	 */
	void enterMainblock(Project2Parser.MainblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#mainblock}.
	 * @param ctx the parse tree
	 */
	void exitMainblock(Project2Parser.MainblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Project2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Project2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#decconsts}.
	 * @param ctx the parse tree
	 */
	void enterDecconsts(Project2Parser.DecconstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#decconsts}.
	 * @param ctx the parse tree
	 */
	void exitDecconsts(Project2Parser.DecconstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(Project2Parser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(Project2Parser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterBlockline(Project2Parser.BlocklineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitBlockline(Project2Parser.BlocklineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varreline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterVarreline(Project2Parser.VarrelineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varreline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitVarreline(Project2Parser.VarrelineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdinline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterStdinline(Project2Parser.StdinlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdinline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitStdinline(Project2Parser.StdinlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterWriteline(Project2Parser.WritelineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitWriteline(Project2Parser.WritelineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfuncline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallfuncline(Project2Parser.CallfunclineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfuncline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallfuncline(Project2Parser.CallfunclineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callprocline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallprocline(Project2Parser.CallproclineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callprocline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallprocline(Project2Parser.CallproclineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callIfstate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallIfstate(Project2Parser.CallIfstateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callIfstate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallIfstate(Project2Parser.CallIfstateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callcasestate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallcasestate(Project2Parser.CallcasestateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callcasestate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallcasestate(Project2Parser.CallcasestateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfordo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallfordo(Project2Parser.CallfordoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfordo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallfordo(Project2Parser.CallfordoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callwhiledo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCallwhiledo(Project2Parser.CallwhiledoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callwhiledo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCallwhiledo(Project2Parser.CallwhiledoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterBreak(Project2Parser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitBreak(Project2Parser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterContinue(Project2Parser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitContinue(Project2Parser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#callfunc}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(Project2Parser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#callfunc}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(Project2Parser.CallfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#funcparam}.
	 * @param ctx the parse tree
	 */
	void enterFuncparam(Project2Parser.FuncparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#funcparam}.
	 * @param ctx the parse tree
	 */
	void exitFuncparam(Project2Parser.FuncparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(Project2Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(Project2Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#funcvardef}.
	 * @param ctx the parse tree
	 */
	void enterFuncvardef(Project2Parser.FuncvardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#funcvardef}.
	 * @param ctx the parse tree
	 */
	void exitFuncvardef(Project2Parser.FuncvardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#procdef}.
	 * @param ctx the parse tree
	 */
	void enterProcdef(Project2Parser.ProcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#procdef}.
	 * @param ctx the parse tree
	 */
	void exitProcdef(Project2Parser.ProcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#callproc}.
	 * @param ctx the parse tree
	 */
	void enterCallproc(Project2Parser.CallprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#callproc}.
	 * @param ctx the parse tree
	 */
	void exitCallproc(Project2Parser.CallprocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fordoto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 */
	void enterFordoto(Project2Parser.FordotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fordoto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 */
	void exitFordoto(Project2Parser.FordotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fordodownto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 */
	void enterFordodownto(Project2Parser.FordodowntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fordodownto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 */
	void exitFordodownto(Project2Parser.FordodowntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#whiledo}.
	 * @param ctx the parse tree
	 */
	void enterWhiledo(Project2Parser.WhiledoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#whiledo}.
	 * @param ctx the parse tree
	 */
	void exitWhiledo(Project2Parser.WhiledoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#ifstate}.
	 * @param ctx the parse tree
	 */
	void enterIfstate(Project2Parser.IfstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#ifstate}.
	 * @param ctx the parse tree
	 */
	void exitIfstate(Project2Parser.IfstateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thenstateBlock}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 */
	void enterThenstateBlock(Project2Parser.ThenstateBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thenstateBlock}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 */
	void exitThenstateBlock(Project2Parser.ThenstateBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thenstateLine}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 */
	void enterThenstateLine(Project2Parser.ThenstateLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thenstateLine}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 */
	void exitThenstateLine(Project2Parser.ThenstateLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseifstateblock}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 */
	void enterElseifstateblock(Project2Parser.ElseifstateblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseifstateblock}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 */
	void exitElseifstateblock(Project2Parser.ElseifstateblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseifstateline}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 */
	void enterElseifstateline(Project2Parser.ElseifstatelineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseifstateline}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 */
	void exitElseifstateline(Project2Parser.ElseifstatelineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elsestateBlock}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 */
	void enterElsestateBlock(Project2Parser.ElsestateBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elsestateBlock}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 */
	void exitElsestateBlock(Project2Parser.ElsestateBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elsestateLine}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 */
	void enterElsestateLine(Project2Parser.ElsestateLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elsestateLine}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 */
	void exitElsestateLine(Project2Parser.ElsestateLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#casestate}.
	 * @param ctx the parse tree
	 */
	void enterCasestate(Project2Parser.CasestateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#casestate}.
	 * @param ctx the parse tree
	 */
	void exitCasestate(Project2Parser.CasestateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesExprffBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesExprffBlock(Project2Parser.CasesExprffBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesExprffBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesExprffBlock(Project2Parser.CasesExprffBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesExprbBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesExprbBlock(Project2Parser.CasesExprbBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesExprbBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesExprbBlock(Project2Parser.CasesExprbBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesExprffLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesExprffLine(Project2Parser.CasesExprffLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesExprffLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesExprffLine(Project2Parser.CasesExprffLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesExprbLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesExprbLine(Project2Parser.CasesExprbLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesExprbLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesExprbLine(Project2Parser.CasesExprbLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(Project2Parser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(Project2Parser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitequalBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitequalBool(Project2Parser.VarinitequalBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitequalBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitequalBool(Project2Parser.VarinitequalBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitequalReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitequalReal(Project2Parser.VarinitequalRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitequalReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitequalReal(Project2Parser.VarinitequalRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitBool(Project2Parser.VarinitBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitBool(Project2Parser.VarinitBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitReal(Project2Parser.VarinitRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitReal(Project2Parser.VarinitRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitBoolVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitBoolVar(Project2Parser.VarinitBoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitBoolVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitBoolVar(Project2Parser.VarinitBoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varinitRealVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void enterVarinitRealVar(Project2Parser.VarinitRealVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varinitRealVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 */
	void exitVarinitRealVar(Project2Parser.VarinitRealVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varreVar}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void enterVarreVar(Project2Parser.VarreVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varreVar}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void exitVarreVar(Project2Parser.VarreVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varreExprb}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void enterVarreExprb(Project2Parser.VarreExprbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varreExprb}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void exitVarreExprb(Project2Parser.VarreExprbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varreExprff}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void enterVarreExprff(Project2Parser.VarreExprffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varreExprff}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 */
	void exitVarreExprff(Project2Parser.VarreExprffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link Project2Parser#stdin}.
	 * @param ctx the parse tree
	 */
	void enterRead(Project2Parser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link Project2Parser#stdin}.
	 * @param ctx the parse tree
	 */
	void exitRead(Project2Parser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeVar}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteVar(Project2Parser.WriteVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeVar}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteVar(Project2Parser.WriteVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExprff}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteExprff(Project2Parser.WriteExprffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExprff}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteExprff(Project2Parser.WriteExprffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExprb}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteExprb(Project2Parser.WriteExprbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExprb}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteExprb(Project2Parser.WriteExprbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffMULDIVMOD}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffMULDIVMOD(Project2Parser.ExprffMULDIVMODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffMULDIVMOD}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffMULDIVMOD(Project2Parser.ExprffMULDIVMODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffPLUSMINUS}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffPLUSMINUS(Project2Parser.ExprffPLUSMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffPLUSMINUS}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffPLUSMINUS(Project2Parser.ExprffPLUSMINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffParen}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffParen(Project2Parser.ExprffParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffParen}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffParen(Project2Parser.ExprffParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffReal}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffReal(Project2Parser.ExprffRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffReal}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffReal(Project2Parser.ExprffRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffSpec}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffSpec(Project2Parser.ExprffSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffSpec}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffSpec(Project2Parser.ExprffSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprffVar}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void enterExprffVar(Project2Parser.ExprffVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprffVar}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 */
	void exitExprffVar(Project2Parser.ExprffVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbEQUAL}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbEQUAL(Project2Parser.ExprbEQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbEQUAL}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbEQUAL(Project2Parser.ExprbEQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbNOT}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbNOT(Project2Parser.ExprbNOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbNOT}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbNOT(Project2Parser.ExprbNOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbBool}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbBool(Project2Parser.ExprbBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbBool}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbBool(Project2Parser.ExprbBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbParen}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbParen(Project2Parser.ExprbParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbParen}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbParen(Project2Parser.ExprbParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbOR}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbOR(Project2Parser.ExprbORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbOR}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbOR(Project2Parser.ExprbORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbReals}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbReals(Project2Parser.ExprbRealsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbReals}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbReals(Project2Parser.ExprbRealsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbVar}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbVar(Project2Parser.ExprbVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbVar}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbVar(Project2Parser.ExprbVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbAND}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbAND(Project2Parser.ExprbANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbAND}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbAND(Project2Parser.ExprbANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbELSETHEN}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprbELSETHEN(Project2Parser.ExprbELSETHENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbELSETHEN}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprbELSETHEN(Project2Parser.ExprbELSETHENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varname}
	 * labeled alternative in {@link Project2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarname(Project2Parser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varname}
	 * labeled alternative in {@link Project2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarname(Project2Parser.VarnameContext ctx);
}