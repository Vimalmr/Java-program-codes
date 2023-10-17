class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length,l=0,r=0,i=0;
        int k = n+m;
        int a[] = new int [k];
        System.arraycopy(nums1, 0, a, 0, n);
        System.arraycopy(nums2, 0, a, n, m);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        if(k%2==0){
            return (a[k/2]+a[k/2-1])/2.0; 
        }
        else{
            return a[k/2];
        }
    }
}
