class Solution {
    public int timeRequiredToBuy(int[] tick, int k) {
        int t=0,i=0,n=tick.length;
        while(tick[k]!=0){
            if(i==n){
                i=0;
            }
            if(tick[i]!=0){
                tick[i]-=1;
                t++;
            }
            i++;
        }
        return t;
    }
}
