class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            if (set.contains(nums[left])) {
                return true;
            }
            set.add(nums[left]);
            
            if (set.contains(nums[right])) {
                return true;
            }
            set.add(nums[right]);
            
            left++;
            right--;
        }
        // For arrays with odd length, check the middle element
        if (left == right && set.contains(nums[left])) {
            return true;
        }
        return false;
    }
}