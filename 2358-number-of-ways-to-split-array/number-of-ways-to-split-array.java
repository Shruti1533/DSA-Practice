class Solution {
    public int waysToSplitArray(int[] nums) {
        long s1=0;
        long s2=0;
        int splits=0;

        for(int i=0;i<nums.length;i++){
            s2+=nums[i];
        }

        for(int i=0;i<nums.length-1;i++){
            s1+=nums[i];
            long remSum=s2-s1;

            if(remSum<=s1){
                splits++;
            }
        }
       
        return splits;
    }
}