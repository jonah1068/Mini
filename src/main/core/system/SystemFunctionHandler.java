package core.system;

import core.memory.MemoryBlock;

public class SystemFunctionHandler {

    private CPU cpu;

    public SystemFunctionHandler(CPU cpu) {
        this.cpu = cpu;
    }

    public int handle(SystemFunction systemFunction, int... args) {
        switch (systemFunction) {
            case POP:
                return handlePop();
            case PUSH:
                return handlePush(args[0]);
            case GET_BASE_PLUS:
                return handleGetBasePlus(args[0]);
            case SET_BASE_PLUS:
                return handleSetBasePlus(args[0], args[1]);
            case GET_HEAP:
                return handleGetHeap(args[0]);
            case SET_HEAP:
                return handleSetHeap(args[0], args[1]);
            case ALLOC:
                return handleAlloc(args[0]);
            case FREE:
                return handleFree(args[0]);
            case ADD:
                return handleAdd();
            case SUBTRACT:
                return handleSubtract();
            case MULTIPLY:
                return handleMultiply();
            case DIVIDE:
                return handleDivide();
            case MOD:
                return handleMod();
            case OUT:
                return handleOut(args[0]);
            default:
                return 0;
        }
    }

    public int handleOut(int i) {
        char c;
        StringBuilder s = new StringBuilder();
        while ((c = (char) cpu.heap.get(i++).getValue()) != '\0') {
            s.append(c);
        }
        System.out.print(s);
        return 0;
    }

    public int handleGetHeap(int index) {
        return cpu.heap.get(index).getValue();
    }

    public int handleSetHeap(int index, int i) {
        cpu.heap.put(index, new MemoryBlock(i));
        return 0;
    }

    public int handleAlloc(int size) {
        return cpu.heap.alloc(size);
    }

    public int handleFree(int index) {
        cpu.heap.free(index);
        return 0;
    }

    public int handleAdd() {
        return handlePop() + handlePop();
    }

    public int handleSubtract() {
        return handlePop() - handlePop();
    }

    public int handleMultiply() {
        return handlePop() * handlePop();
    }

    public int handleDivide() {
        return handlePop() / handlePop();
    }

    public int handleMod() {
        return handlePop() % handlePop();
    }

    public int handlePop() {
        return cpu.stack.pop().getValue();
    }

    public int handlePush(int i) {
        cpu.stack.push(new MemoryBlock(i));
        return 0;
    }

    public int handleGetBasePlus(int offset) {
        return cpu.stack.getBasePlus(offset).getValue();
    }

    public int handleSetBasePlus(int offset, int i) {
        cpu.stack.setBasePlus(offset, i);
        return 0;
    }


}
