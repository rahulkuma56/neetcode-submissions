class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=prices.length;
        int res = 0;
        for(int i=0; i<prices.length;i++){
            l=i+1;
            while(l<r){
                if(prices[i]>prices[l]){
                    l++;
                    continue;
                }
                res = Math.max(res,(prices[l]-prices[i]));
                l++;
            }
            
        }
        return res;
        
    }
}
