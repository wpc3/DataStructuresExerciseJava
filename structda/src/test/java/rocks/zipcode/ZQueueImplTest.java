package rocks.zipcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZQueueImplTest {

    @Test
    public void testIsEmpty() {
        ZQueue<Integer> queue = new ZQueueImpl<>();
        assertTrue(queue.isEmpty());
        
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() {
        ZQueue<String> queue = new ZQueueImpl<>();
        assertEquals(0, queue.size());
        
        queue.enqueue("Hello");
        assertEquals(1, queue.size());
        
        queue.enqueue("World");
        assertEquals(2, queue.size());
        
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @Test
    public void testEnqueueAndDequeue() {
        ZQueue<Character> queue = new ZQueueImpl<>();
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');
        
        assertEquals('A', queue.dequeue().charValue());
        assertEquals('B', queue.dequeue().charValue());
        assertEquals('C', queue.dequeue().charValue());
    }

    @Test
    public void testPeek() {
        ZQueue<Integer> queue = new ZQueueImpl<>();
        assertNull(queue.peek());
        
        queue.enqueue(10);
        assertEquals(10, queue.peek().intValue());
        
        queue.enqueue(20);
        assertEquals(10, queue.peek().intValue());
        
        queue.dequeue();
        assertEquals(20, queue.peek().intValue());
    }
}