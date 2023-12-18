package language.model;

import core.system.CPU;
import core.system.SystemFunction;
import core.system.SystemFunctionHandler;

import java.util.ArrayList;

public class FunctionCall extends Expression {

    private final String functionName;
    private final ArrayList<Expression> actualList;
    private boolean isSystemFunctionCall;

    public FunctionCall(String name, boolean isSystemFunction, ArrayList<Expression> list) {
        super(null, null);
        this.functionName = name;
        this.isSystemFunctionCall = isSystemFunction;
        this.actualList = list;
    }

    public void execute(CPU cpu) {
        if (isSystemFunctionCall) {
            executeSystemFunction(cpu);
        }
        else {
            int returnValue = cpu.executeProgram(functionName);
            cpu.handleSystemFunction(SystemFunction.PUSH, returnValue);
        }
    }

    @Override
    public String prettyPrint(int tabs) {
        String s = isSystemFunctionCall ? "System." : "";
        s += functionName + "(";
        for (Expression e : actualList) {
            s += e.prettyPrint(tabs) + ", ";
        }
        if (!actualList.isEmpty()) {
            s = s.substring(0, s.length() - 2);
        }
        return s + ")";
    }

    public void executeSystemFunction(CPU cpu) {
        // Push actual expression values onto stack
        for (int i = actualList.size() - 1; i >= 0; i--) {
            actualList.get(i).execute(cpu);
        }

        // Collect actual values from stack
        int[] actuals = new int[actualList.size()];
        for (int i = 0; i < actuals.length; i++) {
            actuals[i] = cpu.handleSystemFunction(SystemFunction.POP);
        }

        // Call System function
        int returnValue = cpu.handleSystemFunction(SystemFunction.getSystemFunction(functionName), actuals);

        // Push return value onto stack
        cpu.handleSystemFunction(SystemFunction.PUSH, returnValue);
    }

}
