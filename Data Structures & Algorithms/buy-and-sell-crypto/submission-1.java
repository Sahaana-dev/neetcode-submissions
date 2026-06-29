class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0, right = 1; 
        int max = 0;
        while(left <n && right < n)
        {
            if(prices[left] > prices[right])
            {
                left = right;
            }
            else
            {
                int profit = prices[right] - prices[left];
                max = Math.max(profit, max);
            }
            right++;
            
        }
        return max;
    }
}
