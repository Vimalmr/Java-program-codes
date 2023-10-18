class Solution {
    public int maxArea(int[] height) {
        int n = height.length,i=0;
        int j=n-1,diff=0,res=0;
        while(i<j){
            int st,en,temp;
            if(height[i]>height[j]){
                st=height[j];
                en=height[i];
            }
            else{
                st=height[i];
                en=height[j];
            }
            temp = (st)*(j-i);
            if(temp>res){
                res=temp;
            }
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
