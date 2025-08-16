class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int maxProfit=0;

        for(int i=1;i<n;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            int profit=prices[i]-buy;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}