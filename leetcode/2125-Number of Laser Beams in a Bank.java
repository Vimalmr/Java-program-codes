class Solution {
    public int numberOfBeams(String[] bank) {
        boolean check=false;
        int m = bank[0].length(), count, backup=0, tot = 0;
        for(String i: bank){
            count = 0;
            for(int j=0; j<m; j++){
                if(i.charAt(j)=='1') count++;
            }
            if(check && count!=0){
                tot += count * backup;
                backup = count;
            }
            else if(!(check) && count!=0){
                backup = count;
                check = true;
            }
        }
        return tot;
    }
}
