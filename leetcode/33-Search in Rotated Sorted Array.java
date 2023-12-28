class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[high] > nums[mid] && target <= nums[high]){
                    if(nums[mid]>target) high = mid;
                    else low = mid + 1;
                }
                else if(nums[high] > nums[mid] && target > nums[high]){
                    high = mid;
                }
                else if(nums[low] < nums[mid] && target >= nums[low]){
                    if(nums[mid]>target) high = mid;
                    else low = mid + 1;
                }
                else if(nums[low] < nums[mid] && target < nums[low]){
                    low = mid+1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
