class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int mid=0;

            while(l<=h){
                mid=(h+l)/2;
                if(target==nums[mid]){
                    return mid;
                }
                else if(target<nums[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return -1;
    }
}