class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k){
                int t = nums[i] + nums[j] + nums[k];
                if(t==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(t<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        ll.addAll(s);
        return ll;
    }
}
