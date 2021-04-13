/**
 * Domain      :   Searching
 * Level       :   Easy
 * Complexity  :   O(log(n)) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialMatch = array[middle];
            if (potentialMatch == target) {
                return middle;
            } else if (potentialMatch > target) {
                right--;
            } else {
                left++;
            }
        }
        return -1;
    }
}
