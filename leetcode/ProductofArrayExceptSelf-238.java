class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Arrays.fill(prefix, 0);
        Arrays.fill(suffix, 0);
        suffix[0]=1;
        for(int i=1;i<n;i++){
            suffix[i]=suffix[i-1]*nums[i-1];
        }
        prefix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            prefix[i]=prefix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            nums[i] = prefix[i]*suffix[i];
        }

        return nums;
    }
}
