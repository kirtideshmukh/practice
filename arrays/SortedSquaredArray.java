/**
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(nlog(n)) Time | O(n) Space ∈ n is the size of the input array
 * Sample input :
     array  = [-3, -1, 2, 5]
     output = [1, 4, 9, 25]
 */

import java.util.*;

class Program {

    public int[] sortedSquaredArray(int[] array) {
        int size = array.length;
        int[] sortedSquaredArray = new int[size];
        for (int counter = 0; counter < size; counter++) {
            sortedSquaredArray[counter] = array[counter]*array[counter];
        }
        Arrays.sort(sortedSquaredArray);
        return sortedSquaredArray;
    }
}