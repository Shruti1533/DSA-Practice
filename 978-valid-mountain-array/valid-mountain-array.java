class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean ans=false;
        int n = arr.length;
        int i = 0;

        // Walk up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        if(i==n-1){
            return true;
        }
        return false;
    }
}