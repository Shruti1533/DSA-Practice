class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int i=0;

        prefix[0]=1;
        for(i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        //suffix multiplication
        suffix[nums.length-1]=1;
        for(i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(i=0;i<nums.length;i++){
                ans[i]=prefix[i]*suffix[i];
        }
        return ans;
    }
}