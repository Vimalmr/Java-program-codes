class Solution {
    public void merge(int nums[], int st, int mid, int end){
        int merged[] = new int[end-st+1];
        int i=st, j=mid+1, x=0;
        while(i<= mid && j<=end){
            if(nums[i]<=nums[j]){
                merged[x++]=nums[i];
                i++;
            }
            else{
                merged[x++]=nums[j];
                j++;
            }
        }
        while(i<=mid){
            merged[x++]=nums[i];
            i++;
        }
        while(j<=end){
            merged[x++]=nums[j];
            j++;
        }
        for(int k=0; k<merged.length; k++){
            nums[st++]=merged[k];
        }
    }

    public void merge_sort(int nums[], int st, int end){
        if(st<end){
            int mid = (st+end)/2;
            merge_sort(nums, st, mid);
            merge_sort(nums, mid+1, end);
            merge(nums, st, mid, end);
        }
    }

    public int[] sortArray(int[] nums) {
        merge_sort(nums, 0, nums.length-1);
        return nums; 
    }
}
