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
        Range test2 = new Range(0, 6, 2);
        for (int j = 0; j < 5; j++) {
            //System.out.println(test.hasNext());
            System.out.println(test.next());
        }
        System.out.println(test2.compareTo(test));
    }

    public Range(int inputStop) {
        /* YOUR CODE HERE */
        stop = inputStop - 1;
        start = 0;
        step = 1;
    }

    public Range(int inputStart, int inputStop) {
        /* YOUR CODE HERE */
        stop = inputStop - 1;
        start = inputStart;
        step = 1;
    }

    public Range(int inputStart, int inputStop, int inputStep) {
        /* YOUR CODE HERE */
        start = inputStart;
        step = inputStep;
        if ((inputStart - inputStop)%inputStep==0){
            stop = inputStop - inputStep;
        } else {
            stop = (inputStop - ((inputStop-inputStart)%inputStep));
        }


    }

    public boolean hasNext() {
        /* YOUR CODE HERE */
        if (here < start){
            // here is smaller than start
            here = start;
        } else {
            here += step;
        }
        // Next, return here is it is still in range, and return either true or false
        if (here <= stop){
            return true;
        }
          return false;
        }

    public Integer next() {
        /* YOUR CODE HERE */
        // First, set here to the next number
        if (here < start){
            // here is smaller than start
            here = start;
        } else { // here is equal to or past start
            here+=step;
        }
        // Next, return here if it is still in range, and return either an exception or the Integer  next
        if (here <= stop){
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
        if (this.start > other.start && this.stop >= other.stop){
          return 1;
        } else if (this.start < other.start && this.stop <= other.stop){
            return -1;
        } else {
            return 0;
        }

    }
}
