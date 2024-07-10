class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int i=0;i<nums1.length;i++) {
            set1.add(nums1[i]);
        }

        // Find the intersection 
        for (int i=0;i<nums2.length;i++) {
            if (set1.contains(nums2[i])) {
                intersectionSet.add(nums2[i]);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}