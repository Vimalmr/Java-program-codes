class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length;
        for(int i = 0;i<r;i++){
            if(matrix[i][0] <= target && matrix[i][c-1] >= target){
                int low = 0, high = c;
                while(low < high){    
                    int mid = (low+high)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    if(matrix[i][mid]>target){
                        high = mid;
                    }
                    else{
                        low = mid + 1;
                    }
                }
                return false;
            }
        }
        return matrix[0][0]==target;
    }
}
