/**
 * Concept      :   Array is monoatomic if its elements, from left to right, are entirely non-increasing or entirely non-decreasing.
 * Domain       :   Array
 * Level        :   Medium
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static boolean isMonotonic(int[] array) {
        int size = array.length;
        if (size < 2) {
            return true;
        }

        int i = 0;
        for (; i < size - 2 && array[i] == array[i + 1]; i++) ;

        if (i == size - 2) {
            return true;
        }

        Boolean isInceasingOrDecreasingPattern = null;
        isInceasingOrDecreasingPattern = array[i] < array[i + 1];
        int counter = 0;
        for (; counter < size - 2; counter++) {
            int currentCell = array[counter];
            int nextCell = array[counter + 1];
            if (currentCell == nextCell) {
                continue;
            }
            if (isInceasingOrDecreasingPattern != (currentCell < nextCell)) {
                break;
            }
        }

        return counter == size - 2 && isInceasingOrDecreasingPattern == (array[size - 2] < array[size - 1]);
    }
}
