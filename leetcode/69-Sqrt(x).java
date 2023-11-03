class Solution {
    public int mySqrt(int x) {
        int i=1,count=0;
        while(true){
            if(i<=x){
                count++;
                x-=i;
                i+=2;
            }
            else{
                return count;
            }
        }
    }
}
