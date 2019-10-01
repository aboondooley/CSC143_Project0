package hello;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterator<Integer>, Comparable<Range> {
    // This class creates a range object which can be iterated through, can return elements and warn if there is another element.
    // It also has functionality to compare two ranges


    // Initializing our markers
    // `here` (the place along the range where we are at) needs to be less than 0.
    // This works because we are not creating negative ranges in this project
    private int start;
    private int stop;
    private int step;
    public int here = -1;


    public Range(int inputStop) {
        // `Stop` = (`stop` - 1) because the range creator is not-inclusive
        stop = inputStop - 1;
        start = 0;
        step = 1;
    }

    public Range(int inputStart, int inputStop) {
        stop = inputStop - 1;
        start = inputStart;
        step = 1;
    }

    public Range(int inputStart, int inputStop, int inputStep) {
        start = inputStart;
        step = inputStep;
        if ((inputStart - inputStop)%inputStep==0){
            // If `stop` is a multiple of `step`, then stop one short
            stop = inputStop - inputStep;
        } else {
            // If `stop` is not a multiple of `step` then keep stepping but stop before passing `stop`
            stop = (inputStop - ((inputStop-inputStart)%inputStep));
        }

    }

    public boolean hasNext() {
        // This method does not step
        if (here < start & (start<stop)){
            // If we haven't reached `start` yet, and `stop` isn't zero, there has to be another element
            return true;
        } else if (here + step <= stop){
            // If the next step is less than `stop`, we can step again
            return true;
        } else { // Otherwise, we cannot step farther
            return false;
        }
    }

    public Integer next() {
        if (here < start){
            // For when `here` is smaller than `start`, get caught up to `start`
            here = start;
        } else { // Already at or past `start` then step once
            here+=step;
        }
        // The same concept as hasNext(), except the Integer or an exception will be returned
        // AND we have actually stepped, rather than looking ahead
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
        // Compare two ranges
        if (this.start > other.start && this.stop >= other.stop){
            // This range starts later than the other range and also ends later or at the same spot
          return 1;
        } else if (this.start < other.start && this.stop <= other.stop){
            // This range starts sooner or at the same spot and also ends sooner
            return -1;
        } else { // Either `start` and `stop` are exactly the same or one range has a smaller `start` AND a larger `stop`
            return 0;
        }

    }
}
