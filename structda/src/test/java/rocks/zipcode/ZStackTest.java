package rocks.zipcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ZStackTest {

    private ZStack<Integer> stack;

    @Before
    public void setup() {
        stack = new ConcreteZStack<>();
    }

    @Test
    public void testPush() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer popped = stack.pop();

        assertEquals(3, popped.intValue());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer peeked = stack.peek();

        assertEquals(3, peeked.intValue());
        assertEquals(3, stack.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }
}