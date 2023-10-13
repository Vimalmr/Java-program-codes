class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,max=Integer.MIN_VALUE,me=0;
        for(int i=0;i<n;i++){
            me=me+nums[i];
            if(max<me){
                max = me;
            }
            if(me<0){
                me=0;
            }
        }
        return max;
    }
}
