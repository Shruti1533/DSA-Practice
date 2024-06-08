class Solution {
    public int removeDuplicates(int[] nums) {
        int writer=0,reader=0;
        for(writer=1;writer<nums.length;writer++){
            if(nums[reader]!=nums[writer]){
                reader++;
                nums[reader]=nums[writer];
            }
        }
        return reader+1;
    }
}