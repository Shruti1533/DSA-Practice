class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        //Right-> down-> left-> up

        int start_row=0;
        int end_row=matrix.length-1;

        int start_col=0;
        int end_col=matrix[0].length-1;

        List <Integer> l=new ArrayList<>();

        
        while(start_row <= end_row && start_col<=end_col){
            
            //Right
            for(int j=start_row;j<=end_col;j++){
                l.add(matrix[start_row][j]);
            }

            //Down
            for(int i=start_row+1;i<=end_row;i++){
                l.add(matrix[i][end_col]);
            }

            //Left
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row==end_row){
                    break ;
                }
                l.add(matrix[end_row][j]);
            }

            //Up
            for(int i=end_row-1;i>=start_row+1;i--){
                if(start_col==end_col){
                    break ;
                }
                l.add(matrix[i][start_col]);
            }

            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }

        return l;
    }
}