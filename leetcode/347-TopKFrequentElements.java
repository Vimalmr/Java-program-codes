class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.merge(i,1,Integer::sum);
        }
        List<Integer> l = new ArrayList<>(map.keySet());
        l.sort((a,b)->map.get(b)-map.get(a));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
