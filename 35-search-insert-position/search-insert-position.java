class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
