package language.model;

import core.system.CPU;

public class VariableInitializationStatement implements Statement {

    @Override
    public void execute(CPU cpu) {

    }

    @Override
    public String prettyPrint(int tabs) {
        return null;
//        String s = new String(new char[tabs]).replace("\0", "\t");
//        return s;
    }
}
