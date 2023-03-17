class Solution {
    public int maxProfit(int[] prices) {
        
    
        if(prices.length == 1) return 0;

        int profit = 0;
        int left = 0;
        int right  = 1;
        int maxProfit = 0;
        while( right < prices.length ) {
            profit = prices[right] - prices[left];
            if(profit <= 0) {
                left = right;
                right++;
                continue;
            }
            else if(profit > maxProfit) {
               maxProfit = profit;
            }
            right++;
        }
        return maxProfit;

    }
}