class Solution {

    int gcd(int x, int y){
        if(y!=0) return gcd(y, x%y);
        else return x;
    }

    int divi(int x){
        while(x>0){
            if(x%2==0) x /= 2;
            else break;
        }
        return x;
    }

    public boolean isReachable(int x, int y) {
        int g = gcd(x,y);
        if(g==1) return true;
        else{
            if(gcd(divi(x),divi(y))==1) return true;
            return false;
        }
    }
}
