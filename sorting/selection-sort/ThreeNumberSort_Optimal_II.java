/**
 * Domain      :   Sorting
 * Level       :   Medium
 * Complexity  :   O(n) Time | O(1) Space ∈ n is the size of the input array
 * Approach    :   Keep track for all the three noss indices. Use second index as a counter.
 */

import java.util.*;

class Program {
    public int[] threeNumberSort(int[] array, int[] order) {
        int size = array.length;
        int firstElement = order[0];
        int secondElement = order[1];
        int lastElement = order[2];
        int firstElementIndex = 0;
        int secondElementIndex = 0;
        int thirdElementIndex = size - 1;
        while (secondElementIndex <= thirdElementIndex) {
            int currentValue = array[secondElementIndex];
            if (currentValue == firstElement) {
                swap(array, firstElementIndex, secondElementIndex);
                firstElementIndex++;
                secondElementIndex++;
            } else if (currentValue == secondElement) {
                secondElementIndex++;
            } else {
                swap(array, thirdElementIndex, secondElementIndex);
                thirdElementIndex--;
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
