class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2, c=0;
        for(int i:nums){
            c+=i;
        }
        return sum-c;
    }
}
