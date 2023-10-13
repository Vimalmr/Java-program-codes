class Solution {
    public static void rev(int s, int e, int []nums){
        while(s<e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>=n){
            k=k%n;
        }
        rev(0,n-k-1,nums);
        rev(n-k,n-1,nums);
        rev(0,n-1,nums);
    }
}
