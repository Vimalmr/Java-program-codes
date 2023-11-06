class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int left=0, right=n-1, lmax=height[0], rmax=height[n-1], container=0;

        while(left<=right){ 

            if(lmax<=rmax){
                if(lmax-height[left]>=0){
                    container += lmax-height[left];
                }
                else{
                    lmax = height[left];
                }
                left++;
            }

            else{
                if(rmax-height[right]>=0){
                    container += rmax-height[right];
                }
                else{
                    rmax = height[right];
                }
                right--;
            }
        }
        return container;
    }
}
