package Solutions.BestTimeToBuyAndSellStockII;

import java.util.Arrays;

/*
* This is not an optimized solution. It does not consider if there's a better opportunity to sell in the future.
* It sells if there's any profit. Better solution would be a greedy algorithm to calculate the opportunity sell/buy to maximize profit
*  */

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        boolean holding = false;
        int lastBoughtPrice = 0;
        boolean hasHigherPrice = false;
        int currentPrice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            currentPrice = prices[i];
            int finalCurrentPrice = currentPrice;
            hasHigherPrice = Arrays.stream(prices).anyMatch((p) -> finalCurrentPrice < p);
            if (!holding && hasHigherPrice) {
                //buy
                lastBoughtPrice = prices[i];
                holding = true;
            } else if (holding && lastBoughtPrice < currentPrice) {
                profit = prices[i] - lastBoughtPrice;
                holding = false;
            }
        }
        return profit;
    }
}