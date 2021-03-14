/**
 * Domain       :   Array
 * Level        :   Medium
 * Problem      :   output[i] = the product of every number in the input array other than input[i]
 * Complexity   :   O(n^2) Time | O(n) Space ∈ n is the length input array
 * Sample input :
    array       =   [5, 1, 4, 2]
    output      =   [8, 40, 10, 20]
 */
import java.util.*;

class Program {
    public int[] arrayOfProducts(int[] array) {
        int size = array.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int productOfRestOfElements = 1;
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    productOfRestOfElements *= array[j];
                }
            }
            result[i] = productOfRestOfElements;
        }
        return result;
    }
}
