class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i: nums){
            xor ^= i;
        }
        int pos = 0;
        while(((xor & 1) != 1)){
            xor = xor>>1;
            pos++;
        }
        int a=0,b=0;
        for(int i:nums){
            if(((i>>pos) & 1)==0){
                a = a ^ i;
            }
            else{
                b = b ^ i;
            }
        }
        int arr[] = {a,b};
        return arr;
    }
}
