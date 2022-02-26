package com.pryzintul.calcengine.grammar;

public class PryzintulCalculatorVisitor extends CalculatorBaseVisitor {

    public Integer res;

    @Override
    public Integer visitAddExp(CalculatorParser.AddExpContext ctx) {
        Integer left = (Integer) visit(ctx.getChild(0));
        Integer right = (Integer) visit(ctx.getChild(2));
        this.res = left + right;
        return this.res;
    }

    @Override
    public Integer visitAtomNumber(CalculatorParser.AtomNumberContext ctx) {
        return (Integer) this.visit(ctx.number());
    }

    @Override
    public Integer visitNumber(CalculatorParser.NumberContext ctx) {
        return Integer.parseInt(ctx.getText());
    }


}
