class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]==target && nums[e]==target){
                break;
            }
            if(nums[s]!=target){
                s++;
            }
            if(nums[e]!=target){
                e--;
            }
        }
        int[] ans = new int[2];
        if(s>e){
        ans[0]=-1;
        ans[1]=-1;
        }
        else{
        ans[0]=s;
        ans[1]=e;
        }
        return ans;
    }
}
