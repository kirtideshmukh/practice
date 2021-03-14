/**
 * Domain       :   Array
 * Level        :   Medium
 * Concept      :   Traverse outer perimeter then inner and so on
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the length of input array
                    [few elemets(left of the peak) will be visited multiple times]

 * Sample input :
 array  = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]
 output = 6
 explination :
  peak 1 [3, 4, 0] = 3
  peak 2 [0, 10, 6, 5, -1, -3] = 6
 */

import java.util.*;

class Program {
    public static int longestPeak(int[] array) {

        if (array.length < 3) {
            return 0;
        }
        int currentPeakIndex = 1;
        int longestPeakLength = 0;
        while (currentPeakIndex < (array.length - 1)) {

            if (array[currentPeakIndex] > array[currentPeakIndex - 1] && array[currentPeakIndex] > array[currentPeakIndex + 1]) {

                int leftIndex = currentPeakIndex - 2;
                while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
                    leftIndex--;
                }
                int rightIndex = currentPeakIndex + 2;
                while (rightIndex < array.length && array[rightIndex] < array[rightIndex - 1]) {
                    rightIndex++;
                }
                int currentPeakLength = rightIndex - leftIndex - 1;
                if (currentPeakLength > longestPeakLength) {
                    longestPeakLength = currentPeakLength;
                }
                currentPeakIndex = rightIndex;
            } else {
                currentPeakIndex++;
            }
        }
        return longestPeakLength;
    }
}
