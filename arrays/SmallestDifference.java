/**
 * Domain       :   Array
 * Level        :   Medium
 * Complexity   :   O(nlog(n) +mlog(m)) Time | O(1) Space ∈ n, m are the size of the input arrays
 * Sample input :
    arrayOne    =   [-1, 5, 10, 20, 28, 3]
    arraytwo    =   [26, 134, 135, 15, 17]
    output      =   [28,26]
 */

import java.util.*;

class Program {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] pairWithSmallestDifference = new int[2];
        int n = arrayOne.length;
        int m = arrayTwo.length;
        int counter1 = 0;
        int counter2 = 0;
        int minDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        while ((counter1 < n) && (counter2 < m)) {

            int firstNumber = arrayOne[counter1];
            int secondNumber = arrayTwo[counter2];
            if (firstNumber < secondNumber) {
                currentDifference =  secondNumber - firstNumber;
                counter1++;
            } else if (secondNumber < firstNumber) {
                currentDifference = firstNumber - secondNumber;
                counter2++;
            } else {
                return new int[]{firstNumber, secondNumber};
            }
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                pairWithSmallestDifference = new int[]{firstNumber, secondNumber};
            }
        }

        return pairWithSmallestDifference;
    }
}