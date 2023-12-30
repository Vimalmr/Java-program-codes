class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return nums[0];
        }
        else{
            int val=nums[0];
            for(int i=1;i<n;i++){
                val = val ^ nums[i];
            }
            return val;
        }
    }
}
