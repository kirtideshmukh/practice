/**
 * Domain      :   Sorting
 * Level       :   Easy
 * Complexity  :   O(n^2) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] insertionSort(int[] array) {

        int size = array.length;
        for (int counter = 1; counter < size; counter++) {
            int valueToPutAtRightPlace = array[counter];
            int leftCounter = counter - 1;
            for (; leftCounter >= 0 && array[leftCounter] > valueToPutAtRightPlace; leftCounter--) {
                array[leftCounter + 1] = array[leftCounter];
            }
            array[leftCounter + 1] = valueToPutAtRightPlace;
        }
        return array;
    }
}
