class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step=0,cap = capacity;
        for(int i=0;i<plants.length;i++){
            if(cap>=plants[i]){
                step++;
                cap-=plants[i];
            }
            else{
                step+=(i)*2;
                cap=capacity;
                i--;
            }
        }
        return step;
    }
}
