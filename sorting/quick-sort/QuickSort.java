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
        int pivotIdx = startIdx; // first element as pivot
        int leftIdx = pivotIdx + 1;
        int rightIdx = endIdx;
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
        swap(array, pivotIdx, rightIdx);

        boolean isLeftSubArraySmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);

        if (isLeftSubArraySmaller) {
            //apply logic on smaller array in terms of space complexity for the recursion
            quickSort(array, startIdx, rightIdx - 1);
            quickSort(array, rightIdx + 1, endIdx);
        } else {
            quickSort(array, rightIdx + 1, endIdx);
            quickSort(array, startIdx, rightIdx - 1);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}