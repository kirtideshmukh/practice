/**
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(n) Time | O(1) Space ∈ n is the size of the input array
 */

class FindConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveOnes = Integer.MIN_VALUE;
        int currentConsecutiveOnes = 0;

        for(int i=0; i< nums.length ; i++) {

            if(nums[i] == 1) {
                currentConsecutiveOnes++;
            } else {
                maxConsecutiveOnes = deriveMaxConsecutiveOnesInPreviousWindow(maxConsecutiveOnes, currentConsecutiveOnes);
                currentConsecutiveOnes = 0;
            }
        }
        maxConsecutiveOnes = deriveMaxConsecutiveOnesInPreviousWindow(maxConsecutiveOnes, currentConsecutiveOnes);

        return maxConsecutiveOnes;
    }

    private int deriveMaxConsecutiveOnesInPreviousWindow(int maxConsecutiveOnes, int currentConsecutiveOnes) {
        if (currentConsecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = currentConsecutiveOnes;
        }
        return maxConsecutiveOnes;
    }
}