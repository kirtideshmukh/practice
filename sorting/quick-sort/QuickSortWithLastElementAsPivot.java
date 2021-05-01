/**
 * Domain      :   Sorting (Divide and Conquer algorithm)
 * Level       :   Hard
 * Complexity  :   O(nlog(n)) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] quickSort(int[] array) {

        int size = array.length;
        quickSort(array, 0, size - 1);
        return array;
    }

    public static void quickSort(int[] array, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int pivotIdx = endIdx;
        int leftIdx = startIdx;
        int rightIdx = endIdx - 1;
        while (rightIdx >= leftIdx) {
            if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
                swap(array, leftIdx, rightIdx);

            }
            if (array[leftIdx] <= array[pivotIdx]) {
                leftIdx++;
            }

            if (array[rightIdx] >= array[pivotIdx]) {
                rightIdx--;
            }
        }
        swap(array, pivotIdx, leftIdx);
        boolean isLeftSubArraySmaller = leftIdx - 1 - startIdx < endIdx - 1 - (leftIdx + 1);
        if (isLeftSubArraySmaller) {
            quickSort(array, startIdx, leftIdx - 1);
            quickSort(array, leftIdx + 1, endIdx);
        } else {
            quickSort(array, leftIdx + 1, endIdx);
            quickSort(array, startIdx, leftIdx - 1);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}