class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,k=0;
        int sorted[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                sorted[k++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                sorted[k++]=nums[i];
            }
        }
        return sorted;
    }
}
