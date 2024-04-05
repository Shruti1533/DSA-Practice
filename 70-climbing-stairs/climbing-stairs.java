class Solution {
    public int climbStairs(int n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int num1=1,num2=2;
        // for (int i = 3; i <= n; i++) {
        //     sum = num1 + num2;
        //     num1 = num2;
        //     num2 = sum;
        // }
        return help(num1, num2, sum, n, 2);

    }

    int help(int num1, int num2, int sum, int n, int i){

        if(i == n){
            return sum;
        }

        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
        return help(num1, num2, sum, n, i+1);
    }
}