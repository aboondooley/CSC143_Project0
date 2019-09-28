package test;

import hello.Range;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class RangeTest {
    @Test
    public void RangeTestZero() {
        Iterator i = new Range(0);
        assertFalse(i.hasNext());
    }

    @Test
    public void RangeTestOne() {
        Iterator i = new Range(1);
        assertTrue(i.hasNext());
    }

    @Test
    public void RangeTestGet() {
        Iterator i = new Range(1);
        assertEquals(0, i.next());
    }

    @Test(expected = NoSuchElementException.class)
    public void RangeTestThrowsWhenEmpty() {
        Iterator i = new Range(0);
        i.next();
    }

    @Test
    public void RangeTestCounting() {
        Iterator i = new Range(5);
        for (int j = 0; j < 5; j++) {
            assertEquals(j, i.next());
        }
        assertFalse(i.hasNext());
    }

    @Test
    public void RangeTestCountingFromFive() {
        Iterator i = new Range(5, 10);
        for (int j = 5; j < 10; ++j) {
            assertEquals(j, i.next());
        }
        assertFalse(i.hasNext());
    }

    @Test
    public void RangeTestCountEveryTwo() {
        Iterator i = new Range(0, 10, 2);
        for (int j = 0; j < 10; j += 2) {
            assertEquals(j, i.next());
        }
        assertFalse(i.hasNext());
    }

    @Test
    public void RangeTestCountEveryThree() {
        Iterator i = new Range(0, 10, 3);
        for (int j = 0; j < 10; j += 3) {
            assertEquals(j, i.next());
        }
        assertFalse(i.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void RangeTestThrowsWhenEnd() {
        Iterator i = new Range(0, 10, 3);
        for (int j = 0; j < 10; j += 3) {
            assertEquals(j, i.next());
        }
        i.next();
    }

    @Test
    public void RangeTestLessThan() {
        Comparable<Range> a = new Range(0, 5);
        Comparable<Range> b = new Range(6, 10);
        assertEquals(-1, a.compareTo((Range) b));

        Comparable<Range> i = new Range(0, 5, 2);
        Comparable<Range> j = new Range(2, 5, 2);
        assertEquals(-1, i.compareTo((Range) j));

        Comparable<Range> y = new Range(5, 10, 4);
        Comparable<Range> z = new Range(6, 10, 3);
        assertEquals(-1, y.compareTo((Range) z));
    }

    @Test
    public void RangeGreaterThan() {
        Comparable<Range> a = new Range(0, 5);
        Comparable<Range> b = new Range(6, 10);
        assertEquals(1, b.compareTo((Range) a));

        Comparable<Range> i = new Range(0, 5, 2);
        Comparable<Range> j = new Range(2, 5, 2);
        assertEquals(1, j.compareTo((Range) i));

        Comparable<Range> y = new Range(5, 10, 4);
        Comparable<Range> z = new Range(6, 11, 2);
        assertEquals(1, z.compareTo((Range) y));
    }

    @Test
    public void RangeEqualTo() {
        Comparable<Range> a = new Range(1, 5);
        assertEquals(0, a.compareTo((Range) a));

        Comparable<Range> b = new Range(1, 5);
        assertEquals(0, a.compareTo((Range) b));

        Comparable<Range> c = new Range(0, 6);
        assertEquals(0, a.compareTo((Range) c));

        Comparable<Range> d = new Range(0, 6, 5);
        assertEquals(0, c.compareTo((Range) d));

        Comparable<Range> y = new Range(3, 12, 2);
        Comparable<Range> z = new Range(4, 12, 4);
        assertEquals(0, y.compareTo((Range) z));
    }
}
