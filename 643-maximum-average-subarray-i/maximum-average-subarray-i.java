class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0.0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        max=sum;
        int start=0;
        int end=k;
        while(end<nums.length){
            sum-=nums[start];
            start++;

            sum+=nums[end];
            end++;

             max=Math.max(sum,max);
        }

        ans=(double)max/k;
        return ans;
    }
}