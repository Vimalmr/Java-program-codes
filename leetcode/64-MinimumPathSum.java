class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] dp = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int up = i-1>=0 ? dp[i-1][j] : Integer.MAX_VALUE;
                    int left = j-1>=0 ? dp[i][j-1] : Integer.MAX_VALUE;
                    dp[i][j] = grid[i][j] + Math.min(up,left);
                }
            }
        }
        return dp[r-1][c-1];
    }
}
