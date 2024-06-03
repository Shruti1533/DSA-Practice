class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        int n=nums.length;
        k=k%n; //To handle cases where k>n

        //To copy last k elements in new array
        for(int i=0;i<k;i++){
            a[i]=nums[n-k+i];
        }

        //To copy starting elements till n-k
        for(int i=k;i<n;i++){
            a[i]=nums[i-k];
        }

        //Copy new values to original array
        for(int i=0;i<n;i++){
            nums[i]=a[i];
        }
    }
}