package language.model;

import core.system.CPU;

import java.util.List;

public class Program {
    private List<ProgramStatement> program;

    public Program(List<ProgramStatement> program) {
        this.program = program;
    }

    public void execute(CPU cpu) {
        execute(cpu, "main");
    }

    public void execute(CPU cpu, String name) {
        final String functionName = name == null ? "main" : name;

        ProgramStatement f = program
                .stream()
                .filter(p -> (p instanceof FunctionDeclaration) && ((FunctionDeclaration) p).getIdentifier().equals(functionName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("A"));

        f.execute(cpu);
    }

    public String prettyPrint() {
        String s = "";
        for (ProgramStatement stmt : program) {
            s += stmt.prettyPrint(0) + "\n";
        }
        return s;
    }

}
