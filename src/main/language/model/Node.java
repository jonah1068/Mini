package language.model;

import core.system.CPU;

import java.io.Serializable;

public interface Node extends Serializable {

    void execute(CPU cpu);

    String prettyPrint(int tabs);

}
