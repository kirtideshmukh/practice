/**
 * Domain       :   Array
 * Level        :   Medium
 * Problem      :   Given an array of integers between 1 and n inclusive, where n is the length of the array,
                    write a function that returns the first integer that appears more than once
                    (when the array is read from left to right).
 * Approach     :   1.Look at the given details the array of size n will always have values b/w 1 and n.
                    2.Map these values to index of array. [index = abs(value) - 1]
                    3.Mark negative the cell value at index of the array for which is visted.
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the size of input array
 * Sample input :
    array  = [1, 2, 3, 3, 2]
    output = 3
 */
import java.util.*;

class Program {

    public int firstDuplicateValue(int[] array) {
        int firstDuplicateValue = -1;
        for (int i = 0; i < array.length; i++) {
            int currentCellValue = array[i];
            int index = currentCellValue > 0
                    ? currentCellValue - 1
                    : currentCellValue * -1 - 1;
            boolean isIndexAlreadyVisited = array[index] < 0;
            if (isIndexAlreadyVisited) {
                return index + 1;
            }
            array[index] *= -1; // mark visited
        }
        return firstDuplicateValue;
    }
}
