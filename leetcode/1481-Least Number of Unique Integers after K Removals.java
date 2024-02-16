class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i: arr){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        int m=hash.size();
        if(k==0){
            return m;
        }
        int[] a = new int[m];
        int j=0;
        for(int i: hash.values()){
            a[j++]=i;
        }
        Arrays.sort(a);
        for(int i=0; i<m; i++){
            if(k!=0){
                k-=a[i];
            }
            if(k==0){
                m-=i+1;
                break;
            }
            else if(k<0){
                m-=i;
                break;
            }
        }
        return m; 
    }
}
