class Solution {
    public int largestCombination(int[] candidates) {
        int a[] = new int[24];
        int count,max=0;
        for(int i: candidates){
            count = 0;
            while(i!=0){
                if((i & 1) == 1){
                    a[count] += 1;
                    if(max < a[count]){
                        max = a[count];
                    }
                }
                count++;
                i = i>>1;
            }
        }
        return max;
    }
}
