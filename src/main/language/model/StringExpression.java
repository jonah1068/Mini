package language.model;

import core.system.CPU;
import core.system.SystemFunction;

public class StringExpression extends Expression {

    final String value;

    public StringExpression(String value) {
        super(null, null);
        this.value = value;
    }

    public void execute(CPU cpu) {
        int addr = cpu.handleSystemFunction(SystemFunction.ALLOC, value.length() + 1);
        if (addr < 0) {
            throw new RuntimeException("Heap is full");
        }
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            cpu.handleSystemFunction(SystemFunction.SET_HEAP, addr + i, chars[i]);
        }
        cpu.handleSystemFunction(SystemFunction.SET_HEAP, addr + chars.length, '\0');

        cpu.handleSystemFunction(SystemFunction.PUSH, addr);
    }

}
