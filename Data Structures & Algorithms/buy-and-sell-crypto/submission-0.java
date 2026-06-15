class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int product=prices[0];

        for(int i=1;i<prices.length;i++){
            
            
            product=Math.min(product,prices[i]);
            profit=Math.max(profit,prices[i]-product);
        }
        return profit;
    }
}
