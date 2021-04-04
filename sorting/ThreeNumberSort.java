/**
 * Domain      :   Sorting
 * Level       :   Medium
 * Problem     :   Given an array of integers and another array of three distinct
                 integers. The first array is guaranteed to only contain integers that are in
                 the second array, and the second array represents a desired order for the
                 integers in the first array. For example, a second array of [x, y, z]  represents
                 a desired order of [x, x, ..., x, y, y, ..., y, z, z, ..., z]  in the first array.

 * Complexity  :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */

import java.util.*;

class Program {
    public int[] threeNumberSort(int[] array, int[] order) {
        int size = array.length;
        int[] result = new int[size];
        int counter1=0;
        int counter2=0;
        int counter3=0;
        for(int i=0;i<size;i++) {
            if(array[i]==order[0]) {
                counter1++;
            } else if (array[i]==order[1]) {
                counter2++;
            } else {
                counter3++;
            }
        }

        for(int i=0;i<counter1;i++) {
            result[i] = order[0];
        }

        for(int i=counter1;i<counter1 + counter2;i++) {
            result[i] = order[1];
        }

        for(int i= counter1+counter2;i<counter1 + counter2 + counter3;i++) {
            result[i] = order[2];
        }
        return result;
    }
}
