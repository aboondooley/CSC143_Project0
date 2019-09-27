package hello;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterator<Integer>, Comparable<Range> {
    /* YOUR CODE HERE */

    public Range(int end) {
        /* YOUR CODE HERE */
    }

    public Range(int begin, int end) {
        /* YOUR CODE HERE */
    }

    public Range(int begin, int end, int step) {
        /* YOUR CODE HERE */
    }

    public boolean hasNext() {
        /* YOUR CODE HERE */
    }

    public Integer next() {
        /* YOUR CODE HERE */
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(Range o) {
        /* YOUR CODE HERE */
        /* Comparitor returns 0, 1, -1 depending on the two integers */

    }
}
