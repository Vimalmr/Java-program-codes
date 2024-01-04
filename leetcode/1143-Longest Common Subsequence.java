class Solution {
    int lcs(int[][] dp,int m, int n, String text1, String text2){
        if(n==0 || m==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(text1.charAt(m-1) == text2.charAt(n-1))
            return dp[m][n]=1 + lcs(dp, m-1, n-1, text1, text2);

        int a = lcs(dp, m-1, n, text1, text2);
        int b = lcs(dp, m, n-1, text1, text2);
        return dp[m][n]=(Math.max(a,b));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int mm = text1.length();
        int nn = text2.length();
        int dp[][] = new int[mm+1][nn+1];
        for(int[] i: dp){
            Arrays.fill(i, -1);
        }
        return lcs(dp,mm, nn, text1, text2);
    }
}
