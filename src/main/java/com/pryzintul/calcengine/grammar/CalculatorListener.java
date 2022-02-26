// Generated from C:/projects/calc-engine/src/main/java/com/pryzintul/calcengine/grammar\Calculator.g4 by ANTLR 4.9.2
package com.pryzintul.calcengine.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CalculatorParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CalculatorParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#resvariable}.
	 * @param ctx the parse tree
	 */
	void enterResvariable(CalculatorParser.ResvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#resvariable}.
	 * @param ctx the parse tree
	 */
	void exitResvariable(CalculatorParser.ResvariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcEmpty}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncEmpty(CalculatorParser.FuncEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcEmpty}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncEmpty(CalculatorParser.FuncEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(CalculatorParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(CalculatorParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(CalculatorParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(CalculatorParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(CalculatorParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(CalculatorParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcArgs}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(CalculatorParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcArgs}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(CalculatorParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(CalculatorParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(CalculatorParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(CalculatorParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(CalculatorParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomVar(CalculatorParser.AtomVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomVar(CalculatorParser.AtomVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(CalculatorParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(CalculatorParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcnameparams}.
	 * @param ctx the parse tree
	 */
	void enterFuncnameparams(CalculatorParser.FuncnameparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcnameparams}.
	 * @param ctx the parse tree
	 */
	void exitFuncnameparams(CalculatorParser.FuncnameparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(CalculatorParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(CalculatorParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(CalculatorParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(CalculatorParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(CalculatorParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(CalculatorParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcparams}.
	 * @param ctx the parse tree
	 */
	void enterFuncparams(CalculatorParser.FuncparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcparams}.
	 * @param ctx the parse tree
	 */
	void exitFuncparams(CalculatorParser.FuncparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionparam(CalculatorParser.ExpressionparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionparam(CalculatorParser.ExpressionparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void enterArrayparam(CalculatorParser.ArrayparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void exitArrayparam(CalculatorParser.ArrayparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyarray}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void enterEmptyarray(CalculatorParser.EmptyarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyarray}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 */
	void exitEmptyarray(CalculatorParser.EmptyarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CalculatorParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CalculatorParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorParser.NumberContext ctx);
}