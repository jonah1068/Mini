package language.model;

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

}
