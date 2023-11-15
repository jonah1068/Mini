package language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VariableDeclaration implements Statement {

    private Type type;
    private String id;

}
