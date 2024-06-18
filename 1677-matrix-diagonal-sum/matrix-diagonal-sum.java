class Solution {
    public int diagonalSum(int[][] mat) {

        int n=mat.length;

        //Approach 1-:
        // int s=0,p=0,sum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){

        //         if(i==j){
        //             p=p+mat[i][j];
        //         }
        //         else if((i+j)==(n-1)){
        //             s=s+mat[i][j];
        //         }
            
        //     }
        // }
        // sum=sum+s+p;
        // return sum;

        //APPROACH 2-:
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }

        if (n % 2 == 1) {
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}