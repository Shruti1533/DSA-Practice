class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose the matrix
        for (int rows = 0; rows < n; rows++) {
            for (int col = rows; col < n; col++) {
                int temp = matrix[rows][col];
                matrix[rows][col] = matrix[col][rows];
                matrix[col][rows] = temp;
            }
        }
        
        // Reverse each row
        for (int rows = 0; rows < n; rows++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[rows][start];
                matrix[rows][start] = matrix[rows][end];
                matrix[rows][end] = temp;
                start++;
                end--;
            }
        }
    }
}
