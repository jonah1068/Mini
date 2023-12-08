package language.model;

import core.system.CPU;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IfStatement implements Statement {

    private Expression expression;
    private List<Statement> statementList;

    @Override
    public void execute(CPU cpu) {

    }

    @Override
    public String prettyPrint(int tabs) {
        return null;
    }
}
