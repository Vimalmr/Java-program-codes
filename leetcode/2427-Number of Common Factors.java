class Solution {
    public int commonFactors(int a, int b) {
        int c=1, sm=Math.min(a, b);
        for(int i=2; i<=sm; i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}
