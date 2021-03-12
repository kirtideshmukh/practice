/**
 * Domain      :   Strings
 * Level       :   Easy
 * Complexity  :   O(n) Time | O(1) Space ∈ n is the length of the input string
 */

import java.util.*;

class Program {
    public static boolean isPalindrome(String str, int leftCounter, int rightCounter) {

        return leftCounter >= rightCounter
                ? true
                : (str.charAt(leftCounter) == str.charAt(rightCounter)
                && isPalindrome(str, ++leftCounter, --rightCounter));
    }

    public static boolean isPalindrome(String str) {
        Integer leftCounter = 0;
        Integer rightCounter = str.length() - 1;
        return isPalindrome(str, leftCounter, rightCounter);
    }
}
