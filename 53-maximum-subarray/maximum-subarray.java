class Solution {
    public int maxSubArray(int[] nums){

        int m = Integer.MIN_VALUE;  
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            sum = sum + val;
            m = Math.max(m, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return m;
    }
}