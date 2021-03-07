import java.util.*;
/**
 * Concept      :   Non constructible change is to attempt to create every single amount
 *                  of change, starting at 1 and going up until you eventually can't create
 *                  an amount.
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(nlog(n)) Time | O(1) Space ∈ n is the size of the input array
 */
class Program {

    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int constructibleChange = 0;
        for (int counter = 0; counter < coins.length; counter++) {
            if (constructibleChange + 1 >= coins[counter]) {
                constructibleChange = constructibleChange + coins[counter];
            } else {
                return constructibleChange + 1;
            }
        }
        return constructibleChange + 1;
    }
}
/*
Approach:
Non constructible change = currentChange + 1 ∈ (currentChange + 1) < next value in sorted array
*/