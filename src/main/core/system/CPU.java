package core.system;

import core.memory.Heap;
import core.memory.MemoryStack;
import core.processor.Processor;
import core.processor.Processor1_0;
import language.model.Program;

public class CPU {

    final MemoryStack stack;
    final Heap heap;
    final Processor processor;
    final SystemFunctionHandler systemFunctionHandler;
    Program program;

    public CPU() {
        stack = new MemoryStack();
        heap = new Heap();
        processor = new Processor1_0(this);
        systemFunctionHandler = new SystemFunctionHandler(this);
    }

    public CPU(int size) {
        stack = new MemoryStack(size);
        heap = new Heap(size);
        processor = new Processor1_0(this);
        systemFunctionHandler = new SystemFunctionHandler(this);
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public int executeProgram(String name) {
        return program.execute(this, name);
    }

    public void pushStackFrame() {
        stack.pushFrame();
    }

    public void popStackFrame() {
        stack.popFrame();
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
