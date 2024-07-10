package rocks.zipcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class ZPriorityQueueTest {

    private ConcreteZPriorityQueue<Object> queue;

    @Before
    public void setup() {
        queue = new ConcreteZPriorityQueue<>();
    }

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue("A", 1);
        queue.enqueue("B", 2);
        queue.enqueue("C", 1);

        assertEquals("B", queue.dequeue(2));
        assertEquals("A", queue.dequeue(1));
        assertEquals("C", queue.dequeue(1));
    }

    @Test
    public void testPeek() {
        queue.enqueue("A", 1);
        queue.enqueue("B", 2);
        queue.enqueue("C", 1);

        assertEquals("B", queue.peek(2));
        assertEquals("A", queue.peek(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeueEmptyQueue() {
        queue.dequeue(1);
    }

    @Test
    public void testSize() {
        assertEquals(0, queue.size());

        queue.enqueue("A", 1);
        queue.enqueue("B", 2);
        queue.enqueue("C", 1);

        assertEquals(3, queue.size());
    }

    @Test
    public void testSizeByPriority() {
        queue.enqueue("A", 1);
        queue.enqueue("B", 2);
        queue.enqueue("C", 1);

        assertEquals(2, queue.size(1));
        assertEquals(1, queue.size(2));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue("A", 1);

        assertFalse(queue.isEmpty());
    }
}