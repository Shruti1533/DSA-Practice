class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=matrix.length;
        int j=matrix[0].length;

        int l=0;
        int h=(i*j)-1;

        while(l<=h){
            int mid=(l+(h-l)/2);
            if(matrix[mid/j][mid%j]==target){
                return true;
            }
            if(matrix[mid/j][mid%j]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}