package Solutions.BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int profit = 0, maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxProfit = Integer.max(maxProfit, profit);
            } else {
                left = right;
            }
            right += 1;
        }
        return maxProfit;
    }
}
