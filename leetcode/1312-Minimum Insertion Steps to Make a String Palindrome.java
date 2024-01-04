class Solution {
    public int lcs(int m, int n, String s1, String s2, int[][] dp){
        if(m==0 || n==0) return 0;

        if(dp[m][n] != -1 ) return dp[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1+ lcs(m-1, n-1, s1, s2, dp);
        }

        int a = lcs(m-1, n, s1, s2, dp);
        int b = lcs(m, n-1, s1, s2, dp);
        return dp[m][n] = Math.max(a,b);
    }
    public int minInsertions(String s) {
        int n = s.length();
        String ss = "";
        for(int i=n-1; i>=0; i--){
            ss += s.charAt(i);
        }
        int [][] dp = new int[n+1][n+1];
        for(int[] i: dp){
            Arrays.fill(i, -1);
        }
        int a = lcs(n, n, s, ss, dp);
        return n-a;
    }
}
