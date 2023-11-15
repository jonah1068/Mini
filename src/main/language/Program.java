package language;

import java.util.List;

public class Program {
    private List<ProgramStatement> program;
    private ProgramStatement main;

    public Program(List<ProgramStatement> program) {
        main = program
                .stream()
                .filter(p ->
                        (p instanceof FunctionDeclaration) && ((FunctionDeclaration) p).getIdentifier().equals("main"))
                .findFirst()
                .get();
        this.program = program;
    }

}
