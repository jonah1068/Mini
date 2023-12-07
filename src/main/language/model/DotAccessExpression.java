package language.model;

import core.system.CPU;


public class DotAccessExpression extends Expression {

    public DotAccessExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    public void execute(CPU cpu) {
        if (e1 instanceof SystemFunctionExpression && e2 instanceof FunctionCall) {
            ((FunctionCall) e2).executeSystemFunction(cpu);
        }
    }

}
