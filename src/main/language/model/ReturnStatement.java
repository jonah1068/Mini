package language.model;

import core.system.CPU;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReturnStatement implements Statement {

    private final Expression expression;

    @Override
    public void execute(CPU cpu) {
        expression.execute(cpu);
    }

    @Override
    public String prettyPrint(int tabs) {
        return Statement.printTabs(tabs) + "return " + expression.prettyPrint(tabs);
    }
}
