class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i: nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        int k=0;
        for(int i=0; i<=2; i++){
            if(hash.containsKey(i)){
                int temp = hash.get(i);
                while(temp-->0){
                    nums[k++]=i;
                }
            }
        }
    }
}
