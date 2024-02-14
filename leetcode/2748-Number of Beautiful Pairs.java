class Solution {
    int gcd(int a, int b){
        return b > 0 ? gcd(b, a%b) : a;
    }

    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0; i< nums.length; i++){
            String f = Integer.toString(nums[i]);
            int first = f.charAt(0) - '0';
            for(int j=i+1; j<nums.length; j++){
                if(gcd(first, nums[j]%10)==1){
                    count++;
                }
            }
        }
        return count;
    }
}
