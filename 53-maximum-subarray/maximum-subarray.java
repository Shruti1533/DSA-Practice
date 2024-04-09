class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Flag to check if all elements are negative
        boolean allNegative = true;
        for (int num : nums) {
            if (num >= 0) {
                allNegative = false;
                break;
            }
            maxSum = Math.max(maxSum, num);
        }

        // If all elements are negative, return the maximum negative number
        if (allNegative) {
            return maxSum;
        }

        // Otherwise, proceed with Kadane's algorithm to find maximum subarray sum
        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}