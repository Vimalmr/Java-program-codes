class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        int rowend = matrix.length-1, colend = matrix[0].length-1;
        int rowst = 0, colst = 0;
        while(rowst <= rowend && colst <=colend){

            for(int i=colst; i<=colend; i++){
                spiral.add(matrix[rowst][i]);
            }
            rowst++;

            for(int i=rowst; i<=rowend; i++){
                spiral.add(matrix[i][colend]);
            }
            colend--;

            if(rowend >= rowst){
                for(int i=colend; i>=colst; i--){
                    spiral.add(matrix[rowend][i]);
                }
                rowend--;
            }

            if(colend >= colst){
                for(int i=rowend; i>=rowst; i--){
                    spiral.add(matrix[i][colst]);
                }
                colst++;
            }
        }
        return spiral;
    }
}
