class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = word1.length(), m = word2.length(), i=0;
        while(i<n || i<m){
            if(i<n){
                res.append(word1.charAt(i));
            }
            if(i<m){
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}
