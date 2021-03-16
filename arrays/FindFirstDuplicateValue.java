/**
 * Domain       :   Array
 * Level        :   Medium
 * Problem      :   Given an array of integers between 1 and n inclusive, where n is the length of the array,
                    write a function that returns the first integer that appears more than once
                    (when the array is read from left to right).
 * Complexity   :   O(n) Time | O(c) Space ∈ n is the size of input array, c is the unique numbers in the array
 * Sample input :
    array  = [1, 2, 3, 3, 2]
    output = 3
 */
import java.util.*;

class Program {

    public int firstDuplicateValue(int[] array) {
        int firstDuplicateValue = -1;
        Set<Integer> visitedNumbers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int currentCellValue = array[i];
            if (visitedNumbers.contains(currentCellValue)) {
                return currentCellValue;
            }
            visitedNumbers.add(currentCellValue);
        }
        return firstDuplicateValue;
    }
}