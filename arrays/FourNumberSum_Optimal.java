/**
 * Domain      :   Array
 * Level       :   Hard
 * Complexity  :   Average : O(n^2) Time | O(n^2) Space
                   Worst   : O(n^3) Time | O(n^2) Space ∈ n is the size of the input array
                             Due to innermost array to create quadruplets
 */
import java.util.*;

class Program {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        int n = array.length;
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        Map<Integer, List<Integer[]>> pairsBySum = new HashMap<Integer, List<Integer[]>>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Integer currentPairSum = array[i] + array[j];
                Integer reuiredPairSum = targetSum - currentPairSum;
                if (pairsBySum.containsKey(reuiredPairSum)) {
                    List<Integer[]> requiredPairs = pairsBySum.get(reuiredPairSum);
                    for (Integer[] otherPair : requiredPairs) {
                        quadruplets.add(new Integer[]{array[i], array[j], otherPair[0], otherPair[1]});
                    }
                }
            }
            for (int j = 0; j < i; j++) {
                Integer currentPairSum = array[i] + array[j];
                if (pairsBySum.containsKey(currentPairSum)) {
                    List<Integer[]> existingPairs = pairsBySum.get(currentPairSum);
                    existingPairs.add(new Integer[]{array[i], array[j]});

                    pairsBySum.put(currentPairSum,
                            existingPairs);
                } else {
                    List<Integer[]> pairs = new ArrayList<>();
                    pairs.add(new Integer[]{array[i], array[j]});

                    pairsBySum.put(currentPairSum,
                            pairs);
                }
            }

        }
        return quadruplets;
    }
}
