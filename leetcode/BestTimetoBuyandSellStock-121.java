class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, profit=0, temp=prices[0];
        for(int i=1;i<n;i++){
            if(temp>prices[i]){
                temp=prices[i];
            }
            else if(temp<prices[i]){
                if(profit<prices[i]-temp){
                    profit=prices[i]-temp;
                }
            }
        }
        return profit;
    }
}
