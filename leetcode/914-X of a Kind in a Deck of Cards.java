class Solution {
    int gcd(int a, int b){
        return b > 0 ? gcd(b, a%b) : a;
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        int temp=0;
        for(int i: deck){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        for(int i: hash.values()){
            temp = gcd(i, temp);
        }
        return temp > 1;
    }
}
