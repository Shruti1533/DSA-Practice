class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int s1 = 0, s2 = 0, m = 0;
        int merged[] = new int[n1 + n2];

        while (s1 < n1 && s2 < n2) {
            if (nums1[s1] <= nums2[s2]) {
                merged[m++] = nums1[s1++];
            } else {
                merged[m++] = nums2[s2++];
            }
        }

        while (s1 < n1) {
            merged[m++] = nums1[s1++];
        }

        while (s2 < n2) {
            merged[m++] = nums2[s2++];
        }
        if (m % 2 != 0) {
            med = merged[m / 2];
        } else {
            int sum = merged[m / 2] + merged[(m / 2) - 1];
            med = sum / 2.0;
        }
        return med;
    }
}