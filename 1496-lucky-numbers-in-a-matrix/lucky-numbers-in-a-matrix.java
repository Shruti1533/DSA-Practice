class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> min=new ArrayList<>();
        List<Integer> max=new ArrayList<>();

        List<Integer> ans=new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Find the minimum element in each row using start and end
        for (int i = 0; i < rows; i++) {
            int m = Integer.MAX_VALUE;
            int start = 0;
            int end = cols - 1;

            while (start <= end) {
                m = Math.min(m, matrix[i][start]);
                m = Math.min(m, matrix[i][end]);
                start++;
                end--;
            }
            min.add(m);
        }
        
        // Find the maximum element in each column using start and end
        for (int j = 0; j < cols; j++) {
            int m = Integer.MIN_VALUE;
            int start = 0;
            int end = rows - 1;

            while (start <= end) {
                m = Math.max(m, matrix[start][j]);
                m = Math.max(m, matrix[end][j]);
                start++;
                end--;
            }
            max.add(m);
        }
        
        // Check for lucky numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == min.get(i) && matrix[i][j] == max.get(j)) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        
        return ans;
    }
}