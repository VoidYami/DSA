class Solution {
    public int maxProfit(int[] prices) {
        
        int buy =0;
        int min_price = prices[0];

        for(int i =0; i<prices.length; i++){
            buy = Math.max(buy , prices[i] - min_price);

            min_price = Math.min(min_price, prices[i]);
          
        }
        return buy;
    }
}