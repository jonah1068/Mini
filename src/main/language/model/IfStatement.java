package language.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IfStatement implements Statement {

    private Expression expression;
    private List<Statement> statementList;

}
