class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // To store the minimum price encountered so far
        int maxProfit = 0; // To store the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                // Update the minimum price
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                // Calculate the profit and update the maximum profit
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}