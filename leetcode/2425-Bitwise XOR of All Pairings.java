class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int v1=0;
        int n1 = nums2.length % 2, n2 = nums1.length % 2;
        if(n1!=0){
            for(int i: nums1){
                v1 = v1 ^ i;
            }
        }
        if(n2!=0){
            for(int i: nums2){
                v1 = v1 ^ i;
            }
        }
        return v1;
    }
}
