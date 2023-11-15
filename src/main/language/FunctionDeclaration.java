package language;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class FunctionDeclaration implements ProgramStatement {
    private VariableDeclaration variableDeclaration;
    private ParameterList parameterList;
    private List<Statement> statements;

    public String getIdentifier() {
        return variableDeclaration.getId();
    }

}
