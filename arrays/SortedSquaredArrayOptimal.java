/**
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(n) Time | O(n) Space ∈ n is the size of the input array
 * Sample input :
 * array  = [-3, -1, 2, 5]
 * output = [1, 4, 9, 25]
 */

public class SortedSquaredArrayOptimal {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;

        int positiveAndNegativeDivider = 0;
        for (; positiveAndNegativeDivider < size; positiveAndNegativeDivider++) {
            if (nums[positiveAndNegativeDivider] >= 0) {
                break;
            }
        }

        int negativeNoIdx = positiveAndNegativeDivider - 1;
        int positiveNoIdx = positiveAndNegativeDivider;
        int idx = 0;
        int[] result = new int[size];

        while (negativeNoIdx >= 0 && positiveNoIdx < size) {
            if (nums[negativeNoIdx] * nums[negativeNoIdx] < nums[positiveNoIdx] * nums[positiveNoIdx]) {
                result[idx++] = nums[negativeNoIdx] * nums[negativeNoIdx];
                negativeNoIdx--;
            } else {
                result[idx++] = nums[positiveNoIdx] * nums[positiveNoIdx];
                positiveNoIdx++;
            }
        }

        while (negativeNoIdx >= 0) {
            result[idx++] = nums[negativeNoIdx] * nums[negativeNoIdx];
            negativeNoIdx--;
        }
        while (positiveNoIdx < size) {
            result[idx++] = nums[positiveNoIdx] * nums[positiveNoIdx];
            positiveNoIdx++;
        }
        return result;
    }
}
