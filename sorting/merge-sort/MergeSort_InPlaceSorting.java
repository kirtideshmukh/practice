/**
 * Domain      :   Sorting (Divide and Conquer algorithm)
 * Level       :   Very Hard
 * Complexity  :   O(nlog(n)) Time | O(n) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int[] auxiliaryArray = array.clone();
        mergeSort(array, 0, array.length - 1, auxiliaryArray);
        return array;
    }

    public static void mergeSort(int[] mainArray, int startIdx, int endIdx, int[] auxiliaryArray) {
        if (startIdx == endIdx) {
            return;
        }
        int middle = (startIdx + endIdx) / 2;
        mergeSort(auxiliaryArray, startIdx, middle, mainArray);
        mergeSort(auxiliaryArray, middle + 1, endIdx, mainArray);
        doMerge(mainArray, startIdx, middle, endIdx, auxiliaryArray);
    }

    public static void doMerge(int[] mainArray, int startIdx, int middleIdx, int endIdx, int[] auxiliaryArray) {

        int o = startIdx;
        int l = startIdx;
        int r = middleIdx + 1;
        while (l <= middleIdx && r <= endIdx) {
            if (auxiliaryArray[l] <= auxiliaryArray[r]) {
                mainArray[o++] = auxiliaryArray[l++];
            } else {
                mainArray[o++] = auxiliaryArray[r++];
            }
        }
        while (l <= middleIdx) {
            mainArray[o++] = auxiliaryArray[l++];
        }
        while (r <= endIdx) {
            mainArray[o++] = auxiliaryArray[r++];
        }
    }
}
