class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int i: derived){
            res = res ^ i;
        }
        return (res==0);
    }
}
