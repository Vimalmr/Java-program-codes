class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int r = arr1.length, c = arr2.length,k=0;
        int val=0, res=0;
        for(int i=0;i<r;i++){
            val = val ^ arr1[i];
        }
        for(int i=0;i<c;i++){
            res = res ^ (val & arr2[i]);
        }
        return res;
    }
}
