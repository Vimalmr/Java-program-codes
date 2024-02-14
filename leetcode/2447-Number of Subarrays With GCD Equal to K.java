class Solution {
    int gcd(int a, int b){
        return b > 0 ? gcd(b, a%b) : a;
    }
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int res = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[j]<k){
                    break;
                }
                res = gcd(res, nums[j]);
                if(res==k)
                    count++;
            }
        }
        return count;
    }
}
