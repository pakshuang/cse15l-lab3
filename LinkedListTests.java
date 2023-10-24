import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        assertEquals(3, list.root.value);
        assertEquals(2, list.root.next.value);
        assertEquals(1, list.root.next.next.value);
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.root.value);
        assertEquals(2, list.root.next.value);
        assertEquals(3, list.root.next.next.value);
    }

    @Test
    public void testFirst() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.first());
    }

    @Test
    public void testLast() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.last());
        LinkedList list2 = new LinkedList();
        assertThrows(NoSuchElementException.class, () -> list2.last());
    }

    @Test
    public void testToString() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("1 2 3", list.toString());
    }

    @Test
    public void testLength() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.length());
    }
}