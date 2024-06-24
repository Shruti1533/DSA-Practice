class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int n = prices.length;
        int total_profit = 0;

        for (int i = 0; i < n; i++) {
            buy = Math.min(buy, prices[i]);
            if (buy < prices[i]) {
                int today_profit = prices[i] - buy;
                total_profit = Math.max(total_profit, today_profit);
            } else {
                buy = prices[i];// price is less, so buy
            }
        }

        return total_profit;
    }
}