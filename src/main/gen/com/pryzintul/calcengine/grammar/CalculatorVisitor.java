// Generated from C:/projects/calc-engine/src/main/java/com/pryzintul/calcengine/grammar\Calculator.g4 by ANTLR 4.9.2
package com.pryzintul.calcengine.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CalculatorParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#resvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResvariable(CalculatorParser.ResvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcEmpty}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncEmpty(CalculatorParser.FuncEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(CalculatorParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(CalculatorParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(CalculatorParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcArgs}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(CalculatorParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(CalculatorParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(CalculatorParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVar(CalculatorParser.AtomVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(CalculatorParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#funcnameparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncnameparams(CalculatorParser.FuncnameparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(CalculatorParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(CalculatorParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(CalculatorParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#funcparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncparams(CalculatorParser.FuncparamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionparam(CalculatorParser.ExpressionparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayparam}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayparam(CalculatorParser.ArrayparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyarray}
	 * labeled alternative in {@link CalculatorParser#expressionorarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyarray(CalculatorParser.EmptyarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(CalculatorParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
}