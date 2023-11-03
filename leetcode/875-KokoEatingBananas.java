class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1, right=piles[piles.length-1];
        while(left<right){
            int mid = left+(right-left)/2;
            if(EatingTime(piles, mid, h)){
                right = mid;
            }
            else{
                left = ++mid;
            }
        }
        return left;
    }

    boolean EatingTime(int[] piles, int k, int h){
        int hr = 0;
        for(int p: piles){
            hr+=p/k;
            if(p%k!=0){
                hr++;
            }
        }
        return hr<=h;
    }
}
