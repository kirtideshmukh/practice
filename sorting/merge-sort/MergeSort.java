/**
 * Domain      :   Sorting (Divide and Conquer algorithm)
 * Level       :   Very Hard
 * Complexity  :   O(nlog(n)) Time | O(nlog(n)) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int middleIdx = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, middleIdx);
        int[] rightHalf = Arrays.copyOfRange(array, middleIdx, array.length);
        return mergeSortedArrays(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    public static int[] mergeSortedArrays(int[] leftSortedHalf, int[] rightSortedHalf) {
        int[] sortedArray = new int[leftSortedHalf.length + rightSortedHalf.length];
        int o = 0;
        int l = 0;
        int r = 0;
        while (l < leftSortedHalf.length && r < rightSortedHalf.length) {
            if (leftSortedHalf[l] <= rightSortedHalf[r]) {
                sortedArray[o++] = leftSortedHalf[l++];
            } else {
                sortedArray[o++] = rightSortedHalf[r++];
            }
        }
        while (l < leftSortedHalf.length) {
            sortedArray[o++] = leftSortedHalf[l++];
        }
        while (r < rightSortedHalf.length) {
            sortedArray[o++] = rightSortedHalf[r++];
        }
        return sortedArray;
    }
}
