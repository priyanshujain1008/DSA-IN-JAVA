class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum buying price seen so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit if selling today is better
            }
        }
        
        return maxProfit;
    }
}
