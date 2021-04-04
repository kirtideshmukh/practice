/**
 * Domain       :   Searching
 * Level        :   Easy
 * Problem      :   Find the three largest elements without sorting input array
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the length input array
 */

import java.util.*;

class Program {
    public static int[] findThreeLargestNumbers(int[] array) {

        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            updateLargest(array, threeLargest, i);
        }
        return threeLargest;
    }

    private static void updateLargest(int[] array, int[] threeLargest, int i) {
        if (array[i] >= threeLargest[2]) {
            shiftAndUpdate(threeLargest, 2, array[i]);
        } else if (array[i] >= threeLargest[1]) {
            shiftAndUpdate(threeLargest, 1, array[i]);
        } else if (array[i] > threeLargest[0]) {
            shiftAndUpdate(threeLargest, 0, array[i]);
        }
    }

    public static void shiftAndUpdate(int[] threeLargest, int right, int value) {
        for (int i = 0; i <= right; i++) {
            if (i == right) {
                threeLargest[i] = value;
            } else {
                threeLargest[i] = threeLargest[i + 1];
            }
        }
    }
}