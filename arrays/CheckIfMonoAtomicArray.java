/**
 * Concept      :   Array is monoatomic if its elements, from left to right,
                    are entirely non-increasing or entirely non-decreasing.
 * Domain       :   Array
 * Level        :   Medium
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static boolean checkIfDirectionBreaks(int direction, int previousCell, int currentCell) {
        int difference = currentCell - previousCell;
        if (direction > 0) {
            return difference < 0;
        }
        return difference > 0;
    }

    public static boolean isMonotonic(int[] array) {
        int size = array.length;
        if (size <= 2) {
            return true;
        }

        int direction = array[1] - array[0];

        for (int counter = 2; counter < size; counter++) {
            int previousCell = array[counter - 1];
            int currentCell = array[counter];

            if (direction == 0) {
                direction = currentCell - previousCell;
                continue;
            }

            if (checkIfDirectionBreaks(direction, previousCell, currentCell)) {
                return false;
            }
        }
        return true;
    }
}
