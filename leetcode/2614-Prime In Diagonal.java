class Solution {
    static boolean isPrime(int n) 
    { 
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    } 
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i][i] && isPrime(nums[i][i])){
                max = nums[i][i];
            }
            if( max<nums[nums.length - i - 1][i] && isPrime(nums[nums.length - i - 1][i])){
                max = nums[nums.length - i - 1][i];
            }
        }
        return max;
    }
}
