/**
 * Domain      :   Sorting
 * Level       :   Medium
 * Complexity  :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public int[] threeNumberSort(int[] array, int[] order) {
        int size = array.length;
        int firstElement = order[0];
        int lastElement = order[2];
        int firstElementIndex = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == firstElement) {
                swap(array, firstElementIndex, i);
                firstElementIndex++;
            }
        }

        int lastElementIndex = size - 1;
        for (int i = size - 1; i >= firstElementIndex; i--) {
            if (array[i] == lastElement) {
                swap(array, lastElementIndex, i);
                lastElementIndex--;
            }

        }
        return array;
    }

    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
