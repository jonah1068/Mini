package core.memory;

public class MemoryBlock {
    private int value;

    public MemoryBlock(int value) {
        this.value = value;
    }

    public MemoryBlock() {
        this(0);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
