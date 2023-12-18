package language.model;

import core.system.CPU;

import java.io.Serializable;
import java.util.*;

public class Program implements Serializable {
    private List<ProgramStatement> program;
    private Map<String, ProgramStatement> functionMap;

    public Program(List<ProgramStatement> program) {
        this.program = program;
        functionMap = new HashMap<>();
        String identifier;
        for (ProgramStatement p : program) {
            if (p instanceof FunctionDeclaration) {
                identifier = ((FunctionDeclaration) p).getIdentifier();
                if (functionMap.containsKey(identifier)) {
                    throw new RuntimeException("Duplicate function definition: " + identifier);
                }
                functionMap.put(identifier, p);
            }
        }
    }

    public int execute(CPU cpu) {
        return execute(cpu, "main");
    }

    public int execute(CPU cpu, String name) {
        cpu.setProgram(this);

        final String functionName = name == null ? "main" : name;

        FunctionDeclaration f = (FunctionDeclaration) program
                .stream()
                .filter(p -> (p instanceof FunctionDeclaration) && ((FunctionDeclaration) p).getIdentifier().equals(functionName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Function " + name + " not found."));

        cpu.pushStackFrame();
        final int returnValue = f.executeFunction(cpu);
        cpu.popStackFrame();

        return returnValue;
    }

    public String prettyPrint() {
        String s = "";
        for (ProgramStatement stmt : program) {
            s += stmt.prettyPrint(0) + "\n";
        }
        return s;
    }

}
