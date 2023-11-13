package core.memory;

import java.util.HashMap;

public class Instructions {

    private final HashMap<String, Integer> labelMap;
    private final MemoryBlock[] instructions;

    public Instructions() {
        this(1_000_000);
    }

    public Instructions(int size) {
        this.instructions = new MemoryBlock[size];
        this.labelMap = new HashMap<>();
    }

    public void putInstruction(int i, MemoryBlock instruction) {
        putInstruction(i, null, instruction);
    }

    public void putInstruction(int i, String label, MemoryBlock instruction) {
        if (i > instructions.length)
            throw new RuntimeException(String.format("Instruction index %i out of bounds for size %i", i, instructions.length));

        if (label != null) {
            labelMap.put(label, i);
        }

        instructions[i] = instruction;
    }

}
