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

    @Override
    public String prettyPrint(int tabs) {
        String t = new String(new char[tabs]).replace("\0", "\t");
        String s = t + returnType.prettyPrint() + " " + identifier + "(";
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
        return s + "}\n\n";
    }
}
