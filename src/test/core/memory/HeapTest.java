package core.memory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HeapTest {

    @Test
    public void testHeapExceptions() {
        Heap heap = new Heap(10);
        Assertions.assertThrows(IllegalArgumentException.class, () -> heap.alloc(100));
        Assertions.assertThrows(IllegalArgumentException.class, () -> heap.alloc(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> heap.get(100));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> heap.put(100, null));
    }

    @Test
    public void testFillHeap() {
        Heap heap = new Heap(10);

        int index = heap.alloc(10);
        Assertions.assertEquals(0, index);
        Assertions.assertEquals(-1, heap.alloc(1));

        MemoryBlock m = Mockito.mock(MemoryBlock.class);

        heap.put(4, m);
        Assertions.assertEquals(m, heap.get(4));

        heap.free(index);
        Assertions.assertNotEquals(-1, heap.alloc(1));
    }

}
