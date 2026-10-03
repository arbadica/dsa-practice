class Solution {
    public int maxProfit(int[] prices) {

       int l=0,r=1;
       int min= Integer.MIN_VALUE;
       while(r<prices.length){
        if((prices[r]-prices[l])<=0){
            l=r;
            r++;
        }
        else{
            if(min<(prices[r]-prices[l])){
                min=prices[r]-prices[l];
            }
             r++;
        }
       } 

       return min==Integer.MIN_VALUE?0:min;
    }
}