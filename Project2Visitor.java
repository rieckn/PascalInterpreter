// Generated from Project2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Project2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Project2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Project2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Project2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#mainblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainblock(Project2Parser.MainblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Project2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#decconsts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecconsts(Project2Parser.DecconstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLines(Project2Parser.LinesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockline(Project2Parser.BlocklineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varreline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarreline(Project2Parser.VarrelineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdinline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdinline(Project2Parser.StdinlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteline(Project2Parser.WritelineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfuncline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfuncline(Project2Parser.CallfunclineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callprocline}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallprocline(Project2Parser.CallproclineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callIfstate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallIfstate(Project2Parser.CallIfstateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callcasestate}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallcasestate(Project2Parser.CallcasestateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfordo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfordo(Project2Parser.CallfordoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callwhiledo}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallwhiledo(Project2Parser.CallwhiledoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(Project2Parser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link Project2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(Project2Parser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#callfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(Project2Parser.CallfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#funcparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncparam(Project2Parser.FuncparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(Project2Parser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#funcvardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncvardef(Project2Parser.FuncvardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#procdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcdef(Project2Parser.ProcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#callproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallproc(Project2Parser.CallprocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fordoto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordoto(Project2Parser.FordotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fordodownto}
	 * labeled alternative in {@link Project2Parser#fordo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordodownto(Project2Parser.FordodowntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#whiledo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledo(Project2Parser.WhiledoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#ifstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstate(Project2Parser.IfstateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thenstateBlock}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenstateBlock(Project2Parser.ThenstateBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thenstateLine}
	 * labeled alternative in {@link Project2Parser#thenstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenstateLine(Project2Parser.ThenstateLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifstateblock}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstateblock(Project2Parser.ElseifstateblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifstateline}
	 * labeled alternative in {@link Project2Parser#elseifstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstateline(Project2Parser.ElseifstatelineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elsestateBlock}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestateBlock(Project2Parser.ElsestateBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elsestateLine}
	 * labeled alternative in {@link Project2Parser#elsestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestateLine(Project2Parser.ElsestateLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#casestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasestate(Project2Parser.CasestateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesExprffBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesExprffBlock(Project2Parser.CasesExprffBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesExprbBlock}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesExprbBlock(Project2Parser.CasesExprbBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesExprffLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesExprffLine(Project2Parser.CasesExprffLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesExprbLine}
	 * labeled alternative in {@link Project2Parser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesExprbLine(Project2Parser.CasesExprbLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Project2Parser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(Project2Parser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitequalBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitequalBool(Project2Parser.VarinitequalBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitequalReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitequalReal(Project2Parser.VarinitequalRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitBool}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitBool(Project2Parser.VarinitBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitReal}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitReal(Project2Parser.VarinitRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitBoolVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitBoolVar(Project2Parser.VarinitBoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varinitRealVar}
	 * labeled alternative in {@link Project2Parser#varinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarinitRealVar(Project2Parser.VarinitRealVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varreVar}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarreVar(Project2Parser.VarreVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varreExprb}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarreExprb(Project2Parser.VarreExprbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varreExprff}
	 * labeled alternative in {@link Project2Parser#varre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarreExprff(Project2Parser.VarreExprffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link Project2Parser#stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(Project2Parser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeVar}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteVar(Project2Parser.WriteVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExprff}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExprff(Project2Parser.WriteExprffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExprb}
	 * labeled alternative in {@link Project2Parser#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExprb(Project2Parser.WriteExprbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffMULDIVMOD}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffMULDIVMOD(Project2Parser.ExprffMULDIVMODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffPLUSMINUS}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffPLUSMINUS(Project2Parser.ExprffPLUSMINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffParen}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffParen(Project2Parser.ExprffParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffReal}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffReal(Project2Parser.ExprffRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffSpec}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffSpec(Project2Parser.ExprffSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprffVar}
	 * labeled alternative in {@link Project2Parser#exprff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprffVar(Project2Parser.ExprffVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbEQUAL}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbEQUAL(Project2Parser.ExprbEQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbNOT}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbNOT(Project2Parser.ExprbNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbBool}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbBool(Project2Parser.ExprbBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbParen}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbParen(Project2Parser.ExprbParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbOR}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbOR(Project2Parser.ExprbORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbReals}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbReals(Project2Parser.ExprbRealsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbVar}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbVar(Project2Parser.ExprbVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbAND}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbAND(Project2Parser.ExprbANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbELSETHEN}
	 * labeled alternative in {@link Project2Parser#exprb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbELSETHEN(Project2Parser.ExprbELSETHENContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varname}
	 * labeled alternative in {@link Project2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(Project2Parser.VarnameContext ctx);
}