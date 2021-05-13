/**
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(n^2) Time | O(1) Space ∈ n is the size of the input array
 */

public class FindEvenDigitedNumbers {

    public int findNumbers(int[] nums) {
        int evenDigitNos = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNo = nums[i];

            if (checkIfEvenDigited(currentNo))
                evenDigitNos++;
        }
        return evenDigitNos;
    }

    private boolean checkIfEvenDigited(int currentNo) {
        int noOfDigits = 0;
        while (currentNo > 0) {
            noOfDigits++;
            currentNo = currentNo / 10;
        }
        return noOfDigits % 2 == 0;
    }
}
