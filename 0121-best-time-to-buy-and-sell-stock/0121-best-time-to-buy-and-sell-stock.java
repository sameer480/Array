class Solution {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int p:prices){
            if(p<minP){
                minP=p;
            }else{
                maxprofit=Math.max(maxprofit,p-minP);
            }
        }
        return maxprofit;
        
    }
}