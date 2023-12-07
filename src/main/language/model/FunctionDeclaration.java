package language.model;

import core.system.CPU;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class FunctionDeclaration implements ProgramStatement {
    private Type returnType;
    private String identifier;
    private List<VariableDeclaration> parameterList;
    private List<Statement> statements;

    @Override
    public void execute(CPU cpu) {
        statements.forEach(statement -> statement.execute(cpu));
    }
}
