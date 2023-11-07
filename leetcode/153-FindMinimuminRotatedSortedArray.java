class Solution {
    public int findMin(int[] nums) {
        int n = nums.length, max=Integer.MAX_VALUE;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(nums[left]<=nums[right]) return nums[left];
            int mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        if(nums[left]<=nums[right]) return nums[left];
        return -1;
    }
}
