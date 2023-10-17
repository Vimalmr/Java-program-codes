class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int sum=0,n=numbers.length;
        for(int i=0;i<n;i++){
            sum = target - numbers[i];
            for(int j=i+1;j<n;j++){
                if(sum == numbers[j]){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }
                if(sum <= numbers[j]){
                    break;
                }
            }
        }
        return ans;
    }
}
