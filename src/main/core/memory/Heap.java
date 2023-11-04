package core.memory;

import lombok.Getter;

import java.util.*;

public class Heap {

    protected static final int DEFAULT_SIZE = 1000000;

    private final MemoryBlock[] heap;
    private final boolean[] free;
    private final List<Block> blockList;
    private final Map<Integer, Block> blockMap;


    public Heap() {
        this(DEFAULT_SIZE);
    }

    public Heap(int size) {
        heap = new MemoryBlock[size];
        free = new boolean[size];
        for (int i = 0; i < size; i++) {
            free[i] = true;
        }
        blockList = new LinkedList<>();
        blockMap = new HashMap<>();
    }

    public int alloc(int size) {
        if (size > heap.length) {
            throw new IllegalArgumentException("alloc() size greater than heap size");
        }

        if (size <= 0) {
            throw new IllegalArgumentException("alloc() called with non-positive size");
        }

        // TODO: Trivial implementation for now
        boolean inFree = false;
        int index = -1;
        for (int i = 0; i < heap.length; i++) {
            if (inFree && !free[i]) {
                // Transition from in free zone to not free zone
                inFree = false;
            } else if (free[i]) {
                if (!inFree) {
                    // Transition from not free zone to in free zone
                    inFree = true;
                    index = i;
                }

                if (i - index == size - 1) {
                    // Found free region of right size
                    alloc(index, i);
                    return index;
                }
            }
        }

        if (inFree && heap.length - index == size) {
            // Found free region of right size
            alloc(index, heap.length - 1);
            return index;
        }

        // Memory is full
        return -1;
    }

    private void alloc(int start, int end) {
        // Mark all blocks as not free
        for (int j = start; j <= end; j++) {
            free[j] = false;
        }

        Block b = new Block(start, end); // newly allocated block
        blockMap.put(b.start, b);

        // Insert block into sorted spot
        if (blockList.size() == 0) {
            blockList.add(b);
            return;
        }

        for (int k = 1; k <= blockList.size(); k++) {
            if (k == blockList.size() || b.end < blockList.get(k).start) {
                blockList.add(k, b);
            }
        }
    }

    public void free(int index) {
        Block b;
        if ((b = blockMap.get(index)) == null) {
            return;
        }

        blockList.remove(b);
        blockMap.remove(b);

        for (int i = b.start; i <= b.end; i++) {
            free[i] = true;
        }
    }

    public MemoryBlock get(int index) {
        if (index < 0 || index > heap.length) {
            throw new IndexOutOfBoundsException("get() index out of bounds");
        }
        return heap[index];
    }

    public void put(int index, MemoryBlock m) {
        if (index < 0 || index > heap.length) {
            throw new IndexOutOfBoundsException("get() index out of bounds");
        }
        for (Block b : blockList) {
            if (b.in(index)) {
                heap[index] = m;
                return;
            }

            if (index > b.end) {
                return;
            }
        }
    }

    @Getter
    class Block {
        private int start;
        private int end;

        public Block(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean in(int index) {
            return start <= index && index <= end;
        }
    }

}
