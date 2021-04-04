/**
 * Domain      :   Sorting
 * Level       :   Easy
 * Complexity  :   O(n^2) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] selectionSort(int[] array) {
        int size = array.length;
        for (int startIndex = 0; startIndex < size - 1; startIndex++) {
            int smallestIndex = startIndex;
            for (int j = startIndex + 1; j < size; j++) {
                if (array[j] <  array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (startIndex != smallestIndex) {
                swap(array, startIndex, smallestIndex);
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
