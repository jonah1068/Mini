package language.model;

import core.system.CPU;
import core.system.SystemFunction;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

import static language.model.Statement.printTabs;

@AllArgsConstructor
@Getter
public class FunctionDeclaration implements ProgramStatement {
    private Type returnType;
    private String identifier;
    private List<VariableDeclaration> parameterList;
    private List<Statement> statements;

    @Override
    public void execute(CPU cpu) {
        throw new IllegalStateException("Should not reach");
    }

    public int executeFunction(CPU cpu) {
        statements.forEach(statement -> statement.execute(cpu));
        return cpu.handleSystemFunction(SystemFunction.POP);
    }

    @Override
    public String prettyPrint(int tabs) {
        String s = printTabs(tabs) + returnType.prettyPrint() + " " + identifier + "(";
        for (VariableDeclaration v : parameterList) {
            s += v.prettyPrint(tabs) + ", ";
        }
        if (!parameterList.isEmpty()) {
            s = s.substring(0, s.length() - 2);
        }
        s += ") {\n";
        for (Statement stmt : statements) {
            s += stmt.prettyPrint(tabs + 1) + "\n";
        }
        return s + "}\n";
    }
}
