package hello;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterator<Integer>, Comparable<Range> {
    /* YOUR CODE HERE */
    private int start;
    private int stop;
    private int step;

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
        //for (int i = start; i <= stop; i+=step){
        //    return true;
       // }
       // return false;
    }

    public Integer next() {
        /* YOUR CODE HERE */
        //for (int i = start; i <= stop; i+=step){
        //    return ;
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
            return 1;
        } else if (this.start <= other.start && this.stop < other.stop){
            return -1;
        } else {
            return 0;
        }

    }
}
