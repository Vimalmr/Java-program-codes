class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right=Integer.MAX_VALUE, min=-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(calculate(dist, mid, hour)){
                min = mid;
                right = mid;
            }
            else{
                left = ++mid;
            }
        }
        return min;
    }

    boolean calculate(int[] dist,int s ,double hour){
        double count=0;
        for(int i=0;i<dist.length;i++){
            double d = dist[i]*1.0/s;
            if(i!=dist.length-1){
                count += Math.ceil(d);
            }
            else{
                count+=d;
            }
            if(count>hour){
                return false;
            }
        }
        return count<=hour;
    }
}
