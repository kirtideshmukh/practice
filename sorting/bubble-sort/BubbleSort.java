/**
 * Domain      :   Sorting
 * Level       :   Easy
 * Complexity  :   O(n^2) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] bubbleSort(int[] array) {

        int size = array.length;
        for (int pass = size - 1; pass > 0; pass--) {
            for (int i = 0; i <= pass - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
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
