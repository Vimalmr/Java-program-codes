class Solution {
    public int islandPerimeter(int[][] grid) {
        int island = 0, neig = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    island++;
                    if(i+1<grid.length && grid[i+1][j]==1) neig++;
                    if(j+1<grid[i].length && grid[i][j+1]==1) neig++;
                }
            }
        }
        return (island*4)-(neig*2);
    }
}
