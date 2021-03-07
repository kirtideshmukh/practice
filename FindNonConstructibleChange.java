import java.util.*;
/**
 * Concept      :   Non constructible change is to attempt to create every single amount
 *                  of change, starting at 1 and going up until you eventually can't create
 *                  an amount.
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */
class Program {

    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;
        for (int counter = 0; counter < coins.length; counter++) {
            if (change + 1 >= coins[counter]) {
                change = change + coins[counter];
            } else {
                return change + 1;
            }
        }
        return change + 1;
    }
}
/*
Approach:
Non constructible change = currentChange + 1 ∈ (currentChange + 1) < next value in sorted array
*/