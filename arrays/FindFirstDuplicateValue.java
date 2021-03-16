/**
 * Domain       :   Array
 * Level        :   Medium
 * Problem      :   Given an array of integers between 1 and n inclusive, where n is the length of the array,
                    write a function that returns the first integer that appears more than once
                    (when the array is read from left to right).
 * Complexity   :   O(n^2) Time | O(1) Space ∈ n is the size of input array
 * Sample input :
    array  = [1, 2, 3, 3, 2]
    output = 3
 */
import java.util.*;

class Program {

    public int firstDuplicateValue(int[] array) {
        int firstDuplicateValue = -1;
        int minimumSecondIndex = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            int currentCellValue = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (j < minimumSecondIndex) {
                        firstDuplicateValue = currentCellValue;
                        minimumSecondIndex = j;
                        break;
                    }
                }
            }
        }
        return firstDuplicateValue;
    }
}