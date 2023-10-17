class Solution {
  public int candy(int[] rat) {
    int n = rat.length;
    int[] candy = new int[n];
    Arrays.fill(candy,1);
    for(int i=0;i<n-1;i++){
      if(rat[i]>rat[i+1] && candy[i]<=candy[i+1]){
        candy[i]=candy[i+1]+1;
      }
      else if(rat[i]<rat[i+1] && candy[i]>=candy[i+1]){
        candy[i+1]=candy[i]+1;
      }
    }
    for(int i=n-1;i>=1;i--){
      if(rat[i]>rat[i-1] && candy[i]<=candy[i-1]){
        candy[i]=candy[i-1]+1;
      }
      else if(rat[i]<rat[i-1] && candy[i]>=candy[i-1]){
        candy[i-1]=candy[i]+1;
      }
    }
    int count=0;
    for(int i=0;i<n;i++){
      count+=candy[i];
    }
    return count;
  }
}
