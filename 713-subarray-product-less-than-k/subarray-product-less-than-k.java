class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int c=0;
        int start=0;

        if(k<=1){
            return 0;
        }

        for(int end=0;end<nums.length;end++){
            prod*=nums[end];
            while(prod>=k){
                prod/=nums[start];
                start++;
            }
            c=c+end-start+1;//Window size=end-start+1;
        }
        
    return c;
    }
}