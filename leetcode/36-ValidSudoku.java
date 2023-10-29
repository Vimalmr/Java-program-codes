class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visit = new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    char num = board[i][j];
                    if( !visit.add(i+"row"+num) || !visit.add(j+"column"+num) ||
                        !visit.add(i/3+"row"+j/3+"column"+num)){
                            return false;
                        } 
                }
            }
        }
        return true;
    }
}
