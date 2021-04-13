/**
 * Domain      :   Searching
 * Level       :   Easy
 * Complexity  :   O(log(n)) Time | O(log(n) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        return binarySearch(array, target, left, right);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        int potentialMatch = array[middle];
        if (potentialMatch == target) {
            return middle;
        } else if (potentialMatch > target) {
            binarySearch(array, target, left, middle - 1);
        } else {
            binarySearch(array, target, middle + 1, right);
        }
    }
}
