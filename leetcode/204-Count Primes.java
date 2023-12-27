class Solution {
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        else{
            int arr[] = new int[n];
            Arrays.fill(arr, 1);
            int count = 0;
            arr[0]=0;
            arr[1]=1;
            for(int i=2;i<n;i++){
                if(arr[i]==1){
                    for(int j=i*2;j<n;j=j+i){
                        arr[j]=0;
                    }
                    count++;
                }
            }
            return count;
        }
    }
}
