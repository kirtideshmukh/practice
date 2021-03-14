/**
 * Domain       :   Array
 * Level        :   Medium
 * Problem      :   output[i] = the product of every number in the input array other than input[i]
 * Complexity   :   O(n) Time | O(n) Space ∈ n is the length input array
 * Sample input :
 array       =   [5, 1, 4, 2]
 output      =   [8, 40, 10, 20]

 * Approach     :   Calculate and store left and right products for ith element.
                    output[i] = leftProducts[i] * rightProducts[i]
 */

import java.util.*;

class Program {
    public int[] arrayOfProducts(int[] array) {
        int size = array.length;
        int[] result = new int[size];
        int[] leftProducts = new int[size];
        Arrays.fill(leftProducts, 1);
        int[] rightProducts = new int[size];
        Arrays.fill(rightProducts, 1);
        int leftProduct = 1;
        for (int i = 1; i < size; i++) {
            leftProduct *= array[i - 1];
            leftProducts[i] = leftProduct;
        }
        int rightProduct = 1;
        for (int i = size - 2; i >= 0; i--) {
            rightProduct *= array[i + 1];
            rightProducts[i] = rightProduct;
        }

        for (int i = 0; i < size; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }
}