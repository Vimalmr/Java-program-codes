class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            int count=0;
            if(!set.contains(i-1)){
                while(set.contains(i++)){
                    count++;
                }
                max = (max<count) ? count : max;
            }
        }
        return max;
    }
}
