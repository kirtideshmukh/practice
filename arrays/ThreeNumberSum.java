/**
 * Domain      :   Array
 * Level       :   Medium
 * Complexity  :   O(n^2) Time | O(n) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public static List<Integer[]> calculateThreeNumberSum(int[] inputArray, int targetSum) {
        Arrays.sort(inputArray);
        List<Integer[]> triplets = new ArrayList<>();
        int size = inputArray.length;
        for (int counter = 0; counter < size - 2; counter++) {

            int left = counter + 1;
            int right = size - 1;
            while (left < right) {
                int currentSum = inputArray[counter] + inputArray[left] + inputArray[right];
                if (currentSum == targetSum) {
                    triplets.add(new Integer[]{inputArray[counter], inputArray[left], inputArray[right]});
                    left++;
                    right--;
                } else if (currentSum > targetSum) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return triplets;
    }
}