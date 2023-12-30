class Solution {
    public int singleNumber(int[] nums) {
        int a[] = new int[32];
        int tot=0;
        for(int i: nums){
            for(int j=0;j<32;j++){
                if((i & 1<<j)!=0){
                    a[j]++;
                }
            }
        }
        for(int i=0; i<32; i++){
            if(a[i]%3!=0){
                tot+=(1<<i);
            }
        }
        return tot;
    }
}
