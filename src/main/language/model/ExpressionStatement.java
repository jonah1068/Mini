package language.model;

import core.system.CPU;
import core.system.SystemFunction;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExpressionStatement implements Statement{

    private Expression e;

    public void execute(CPU cpu) {
        e.execute(cpu);
        cpu.handleSystemFunction(SystemFunction.POP);
    }

    @Override
    public String prettyPrint(int tabs) {
        String s = new String(new char[tabs]).replace("\0", "\t");
        return s + e.prettyPrint(tabs) + ";";
    }

}
