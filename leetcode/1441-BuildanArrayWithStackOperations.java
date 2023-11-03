class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ll = new ArrayList<String>();
        int k=0;
        for(int i=1;i<=n;i++){
            if(k==target.length){
                break;
            }
            ll.add("Push");
            if(i!=target[k]){
                ll.add("Pop");
            }
            else{
                k++;
            }
        }
        return ll;
    }
}
