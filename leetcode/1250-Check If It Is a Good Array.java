class Solution {
    int gcd(int x, int y){
        if(y!=0) return gcd(y , x%y);
        else return x;
    }
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;
        if(n>1){
            int t = gcd(nums[0],nums[1]);
            if(t==1) {return true;}
            for(int i=2; i<n; i++){
                t = gcd(t,nums[i]);
                if(t==1) return true;
            }
            return false;
        }
        if(nums[0]==1) return true;
        else return false;
    }
}
