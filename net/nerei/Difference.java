package net.nerei;

/**
 * Created by rl on 21/09/16.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements =a;
        maximumDifference=0;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int k = i + 1; k < elements.length; k++) {
                if (elements[i] != elements[k]) {
                   maximumDifference = (Math.abs(elements[i]-elements[k]) > maximumDifference) ? Math.abs(elements[i]-elements[k]) : maximumDifference;
                }
            }
        }
    }
}
