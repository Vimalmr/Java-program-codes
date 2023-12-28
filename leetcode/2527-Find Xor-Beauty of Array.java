class Solution {
    public int xorBeauty(int[] nums) {
        int res=0;
        for(int i: nums) res = res ^ i;
        return res;
    }
}
