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

}
