/**
 * Domain      :    Array
 * Level       :    Hard
 * Problem     :    Write a function that takes in a non-empty array of distinct integers and an
                    integer representing a target sum. The function should find all quadruplets in
                    the array that sum up to the target sum and return a two-dimensional array of
                    all these quadruplets in no particular order.
 * Complexity  :   O(n^4) Time | O(1) Space ∈ n is the size of the input array
 */
import java.util.*;

class Program {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        int n = array.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int currentSum = array[i] + array[j] + array[k] + array[l];
                        if (currentSum == targetSum) {
                            quadruplets.add(new Integer[]{array[i], array[j], array[k], array[l]});
                        }
                    }
                }
            }
        }
        return quadruplets;
    }
}
