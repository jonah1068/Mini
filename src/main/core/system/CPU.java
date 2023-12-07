package core.system;

import core.memory.Heap;
import core.memory.Instructions;
import core.memory.MemoryStack;
import core.processor.Processor;
import core.processor.Processor1_0;

public class CPU {

    final MemoryStack stack;
    final Heap heap;
    final Instructions instructions;
    final Processor processor;
    final SystemFunctionHandler systemFunctionHandler;

    public CPU() {
        stack = new MemoryStack();
        heap = new Heap();
        instructions = new Instructions();
        processor = new Processor1_0(this);
        systemFunctionHandler = new SystemFunctionHandler(this);
    }

    public CPU(int size) {
        stack = new MemoryStack(size);
        heap = new Heap(size);
        instructions = new Instructions(size);
        processor = new Processor1_0(this);
        systemFunctionHandler = new SystemFunctionHandler(this);
    }

    public void startLive() {
        processor.startLive();
    }

    public int handleSystemFunction(SystemFunction systemFunction, int... args) {
        return systemFunctionHandler.handle(systemFunction, args);
    }

    public static void main(String[] args) {
        if (args.length != 2 || args[0].equals("-live")) {
            System.out.println("Starting live/default mode.");
            new CPU().startLive();
            return;
        }
        if (args[0].equals("-debug")) {

        } else if (args[0].equals("-execute")) {

        }

    }

}
