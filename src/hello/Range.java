package hello;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterator<Integer>, Comparable<Range> {
    /* YOUR CODE HERE */
    private int start;
    private int stop;
    private int step;
    public int here = -1;

    public static void main(String[] args){
        Range test = new Range(0, 5, 1);
        for (int j = 0; j <= 5; j++) {
            System.out.println(test.hasNext());
            System.out.println(test.next());
        }
    }

    public Range(int inputStop) {
        /* YOUR CODE HERE */
        stop = inputStop;
        int start = 0;
        int step = 1;
    }

    public Range(int inputStart, int inputStop) {
        /* YOUR CODE HERE */
        stop = inputStop;
        start = inputStart;
        int step = 1;
    }

    public Range(int inputStart, int inputStop, int inputStep) {
        /* YOUR CODE HERE */
        start = inputStart;
        step = inputStep;
        stop = inputStop - ((inputStop-inputStart)%inputStep);

    }

    public boolean hasNext() {
        /* YOUR CODE HERE */
        if (here < start){
            // here is smaller than start
            here = start;
        }
        // Next, return here is it is still in range, and return either true or false
        if (here + step < stop){
            return true;
        }
          return false;
        }

    public Integer next() {
        /* YOUR CODE HERE */
        // First, set here to the next number
        if (here < start){
            // here is smaller than start
            here = start+step;
        } else { // here is equal to or past start
            here+=step;
        }
        // Next, return here is it is still in range, and return either an exception or the Integer  next
        if (here < stop){
            return (Integer) here;
        } else {
            throw new NoSuchElementException();
        }

    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(Range other) {
        /* YOUR CODE HERE */
        /* Comparitor returns 0, 1, -1 depending on the two integers */
        if (this.start >= other.start && this.stop > other.stop){
            //
            return this.start;
        } else if (this.start <= other.start && this.stop < other.stop){
            return -1;
        } else {
            return 0;
        }

    }
}
