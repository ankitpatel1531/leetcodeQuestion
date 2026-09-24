class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int min =prices[0];
        int n = prices.length;

        for(int i =1;i<n;i++){
            int cost  = prices[i] - min;
            prof = Math.max(prof,cost);
            min = Math.min(min,prices[i]); 
        }
        return prof;
                
         
         
         
         
         
         
         
         
        //  int maxProfit = 0;

        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {

        //         int profit = prices[j] - prices[i];
                
        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        // }
        // return maxProfit;
        
    }
}