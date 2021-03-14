/**
 * Domain       :   Array
 * Level        :   Medium
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the length of input array
 * Sample input :
    array  = [2, 1, 2, 2, 2, 3, 4, 2] , toMove = 2
    output = [1, 3, 4, 2, 2, 2, 2, 2]      // the order of rest of elements(here 1, 3, 4) doesn't matter
 */


import java.util.*;

class Program {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            int rightElement = array.get(right);
            int leftElement = array.get(left);

            if (rightElement != toMove && leftElement == toMove) {
                array.remove(left);
                array.add(left, rightElement);
                array.remove(right);
                array.add(right, toMove);
                left++;
                right--;
            }
            if (array.get(right) == toMove) {
                right--;
            }
            if (array.get(left) != toMove) {
                left++;
            }
        }
        return array;
    }
}
