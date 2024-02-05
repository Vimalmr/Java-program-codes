class Solution {
    public int partitionString(String s) {
        int count=1;
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> hash = new HashMap<>();
            hash.put(s.charAt(i), 1);
            int k=0;
            for(int j=i+1; j<s.length(); j++){
                if(hash.containsKey(s.charAt(j))){
                    i+=k;
                    count++;
                    break;
                }
                else{
                    hash.put(s.charAt(j), 1);
                    k++;
                }
            }
        }
        return count;
    }
}
