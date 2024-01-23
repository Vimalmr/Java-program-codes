class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, n=nums.length;
        int i = 0, j = n-1;
        while(i<n && i<=j){
            if(nums[i]==val){
                if(nums[j]!=val){
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j--] = temp;
                }
                else{
                    j--;
                }
                count++;
            }
            else{
                i++;
            }
        }
        return (n-count);
    }
}
