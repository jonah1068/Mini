package language.model;

import core.system.CPU;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VariableDeclaration implements Statement {

    private Type type;
    private String id;

    @Override
    public void execute(CPU cpu) {
        // Do nothing, handled at compile time
    }
}
