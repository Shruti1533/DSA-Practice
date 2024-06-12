class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int m=Integer.MAX_VALUE,sum=0;
        int n=nums.length;
        int sub=0;
        int left=0;

        for (int right = 0; right < n; right++) {
            sum+=nums[right];
            while(sum>=target){
                sub=right-left+1; 

                m=Math.min(m,sub);
                sum=sum-nums[left];
                left++;
            }
        }
        if(m==Integer.MAX_VALUE){
            return 0;
        }
        return m;
    }
}