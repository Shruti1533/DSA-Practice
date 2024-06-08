class Solution {
    public int removeDuplicates(int[] nums) {
        int writer=0,reader=0;
        for(reader=1;reader<nums.length;reader++){
            if(nums[reader]!=nums[writer]){
                writer++;
                nums[writer]=nums[reader];
            }
        }
        return writer+1;
    }
}