class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i<c0){
                nums[i]=0;
            }
            else if(i>=c0 && i<c0+c1){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
}