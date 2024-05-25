class Solution {
    static boolean b[][];
    public int totalNQueens(int n) {
        b=new boolean [n][n];//false set
        return helper(0,n);
    }

    public static int helper(int row,int n){

        //Base case
        if(row==n){
            return 1;
        }

        int count=0;

        for(int col=0;col<n;col++){
            if(isSafe(row,col)){
                b[row][col]=true;//Queen placed
                //Move to next zero and col=0
                count+=helper(row+1,n);

                b[row][col]=false;//Undo operation
            }
        }
        return count;
    }

    public static boolean isSafe(int row, int col){
            //Above row
            for(int i=row;i>=0;i--){
                if(b[i][col]==true){
                    return false;
                }
            }
        
        //Left diagonal
         for(int i=row,j=col;i>=0 && j>=0;i--, j--){
                if(b[i][j]==true){
                    return false;
                }
            }
        //Right diagonal
        for(int i=row,j=col;i>=0 && j<b[0].length;i--, j++){
                if(b[i][j]==true){
                    return false;
                }
            }
        
        return true;
    }
}

