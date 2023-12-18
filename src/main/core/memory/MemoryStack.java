package core.memory;

import java.util.LinkedList;
import java.util.Stack;

public class MemoryStack {

    private Stack<LinkedList<MemoryBlock>> stack;
    private int stackIndex;
    private int capacity;

    public MemoryStack() {
        this(1_000_000);
    }

    public MemoryStack(int size) {
        stack = new Stack<>();
        capacity = size;
        stackIndex = -1;
    }

    public MemoryBlock getBasePlus(int offset) {
        if (offset >= 0) {
            // Local variable
            return stack.get(stackIndex).get(offset);
        }

        // Parameter
        LinkedList<MemoryBlock> frame = stack.get(stackIndex - 1);
        return frame.get(frame.size() + offset);
    }

    public void setBasePlus(int offset, int i) {
        if (offset >= 0) {
            // Local variable
            stack.get(stackIndex).set(offset, new MemoryBlock(i));
        }
        else {
            // Parameter
            LinkedList<MemoryBlock> frame = stack.get(stackIndex - 1);
            frame.get(frame.size() + offset).setValue(i);
        }
    }

    public void push(MemoryBlock m) {
        stack.get(stackIndex).addLast(m);
    }

    public MemoryBlock pop() {
        return stack.get(stackIndex).removeLast();
    }

    public MemoryBlock peek() {
        return stack.get(stackIndex).getLast();
    }

    public void pushFrame() {
        stack.push(new LinkedList<>());
        stackIndex++;
    }

    public void popFrame() {
        stack.pop();
        stackIndex--;
    }

}
