class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for (int i = n - 1; i > 0; i--) {
            for (int j = m - 1; j > 0; j--) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}