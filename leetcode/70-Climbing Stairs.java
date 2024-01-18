class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        if(n==2) return 2;
        int a=1, b=1, temp;
        for(int i=1; i<n; i++){
            temp=a;
            a+=b;
            b=temp;
        }
        return a;
    }
}
