/**
 * Domain      :   Strings
 * Level       :   Easy
 * Complexity  :   O(n) Time | O(1) Space ∈ n is the length of the input string
 */

class Program {
    public static boolean isPalindrome(String inputString) {
        Integer leftCounter =0;
        Integer rightCounter = inputString.length() - 1;
        for(;leftCounter< rightCounter; leftCounter++, rightCounter--) {
            if( inputString.charAt(leftCounter) != inputString.charAt(rightCounter)) {
                return false;
            }
        }
        return true;
    }
}
