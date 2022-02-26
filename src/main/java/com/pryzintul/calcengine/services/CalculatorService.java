package com.pryzintul.calcengine.services;

import com.pryzintul.calcengine.grammar.CalculatorLexer;
import com.pryzintul.calcengine.grammar.CalculatorParser;
import com.pryzintul.calcengine.grammar.PryzintulCalculatorVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Integer evaluate (String expression) {

        try{
            CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(expression));
            CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.parse();
            PryzintulCalculatorVisitor visitor = new PryzintulCalculatorVisitor();
            visitor.visit(tree);
            return visitor.res;
        }
        catch (Exception ex){
            logger.error("Error evaluating expression $formulaExpr", ex);
            throw ex;
        }

    }

}
