import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] sortedRotatedArray = new int[]{11, 15, 6, 8, 9, 10};
        int[] result = new Solution().getPairWithGivenSum(sortedRotatedArray, 16);
        System.out.println(Arrays.toString(result));
    }

    public int[] getPairWithGivenSum(int[] sortedRotatedArray, int targetSum) {
        int n = sortedRotatedArray.length;
        boolean isRotated = sortedRotatedArray[0] > sortedRotatedArray[n - 1];
        int smallerElementsCounter = 0;
        int largerElementsCounter = n - 1;

        if (isRotated) {
            for (int i = 0; i < n - 1; i++) {
                boolean isPivotElement = !(sortedRotatedArray[i] < sortedRotatedArray[i + 1]);
                if (isPivotElement) {
                    smallerElementsCounter = i + 1;
                    largerElementsCounter = i;
                    break;
                }
            }
        }

        while (sortedRotatedArray[smallerElementsCounter] < sortedRotatedArray[largerElementsCounter]) {
            int currentSum = sortedRotatedArray[smallerElementsCounter] + sortedRotatedArray[largerElementsCounter];
            System.out.println(smallerElementsCounter + " " + largerElementsCounter + ": " + currentSum);
            if (currentSum > targetSum) {
                largerElementsCounter = (n + largerElementsCounter - 1) % n;
            } else if (currentSum < targetSum) {
                smallerElementsCounter = (smallerElementsCounter + 1) % n;
            } else {
                return new int[]{sortedRotatedArray[smallerElementsCounter], sortedRotatedArray[largerElementsCounter]};
            }
        }

        return new int[]{};
    }
}