class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=(nums.length)-1;
        int m=(s+e)/2;
        while(s<=e){
            if(nums[m]==target){
                return m;
            }
            else{
                if(target>nums[m]){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
                m=(s+e)/2;
            }
        }
        return -1;
    }
}
