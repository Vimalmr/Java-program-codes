class Solution {
    public int largestPerimeter(int[] nums) {

        //For a triangle side to be formed the side A should be smaller than Other sides
        // Ex: Side A < Side B + Side C

        Arrays.sort(nums); //Sort the Array
        int flag =0,n=nums.length,res=0;

        for(int i=n-1;i>1;i--){ 
            //Checking whether the Largest side is smaller than addition other two side
            if(nums[i-1]+nums[i-2]>nums[i]){
                res+=nums[i]+nums[i-1]+nums[i-2];
                flag=1;
                break;
            }
        }

        //Returning the answers
        if(flag == 0){
            return 0;
        }
        return res;
    }
}
