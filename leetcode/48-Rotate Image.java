class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
                System.out.print(matrix[i][j]);
            }
        }
        int s=0, e=0;
        for(int i=0; i<n; i++){
            s=0;
            e=n-1;
            while(s<e){
                int t = matrix[i][s]; 
                matrix[i][s++] = matrix[i][e];
                matrix[i][e--] = t;
            }
        }
    }
}
