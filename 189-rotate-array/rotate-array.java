class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        int n=nums.length;
        k=k%n; //To handle cases where k>n

        //APPROACH 2-:
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest of the array
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

        // //APPROACH 1-:
        // //To copy last k elements in new array
        // for(int i=0;i<k;i++){
        //     a[i]=nums[n-k+i];
        // }

        // //To copy starting elements till n-k
        // for(int i=k;i<n;i++){
        //     a[i]=nums[i-k];
        // }

        // //Copy new values to original array
        // for(int i=0;i<n;i++){
        //     nums[i]=a[i];
        // }