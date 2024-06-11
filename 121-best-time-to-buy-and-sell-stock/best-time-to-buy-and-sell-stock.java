class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        int curr_profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }

            curr_profit=prices[i]-buy;

            if(curr_profit>max){
                max=curr_profit;
            }
        }
        return max;
    }
}