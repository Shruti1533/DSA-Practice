class Solution {
    public void setZeroes(int[][] matrix) {
         int col0 = 1;

        int n = matrix.length;
        int m = matrix[0].length;
        int i, j; // declare i and j outside the loops
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for (i = 1; i < n; i++) {
            for (j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}