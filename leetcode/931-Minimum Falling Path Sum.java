class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length, c=matrix[0].length, minPath = Integer.MAX_VALUE;
        for(int i=1; i<r; i++){
            for(int j=0; j<c; j++){
                if(j==0){
                    matrix[i][j] = Math.min(matrix[i][j] + matrix[i-1][j], matrix[i][j] + matrix[i-1][j+1]);
                }
                else if(j==c-1){
                    matrix[i][j] = Math.min(matrix[i][j] + matrix[i-1][j-1], matrix[i][j]+matrix[i-1][j]);
                }
                else{
                    matrix[i][j] = Math.min(matrix[i][j] + matrix[i-1][j-1], Math.min(matrix[i][j] + matrix[i-1][j], matrix[i][j] + matrix[i-1][j+1]));
                }
            }
        }
        for(int i=0; i<c; i++){
            minPath = Math.min(matrix[r-1][i], minPath);
        }
        return minPath;
    }
}
