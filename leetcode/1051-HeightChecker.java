class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int []expected = heights.clone(); // Cloning the array
        Arrays.sort(expected); //Sorting the array
        for(int i=0;i<heights.length;i++){
            // Checking the height array with the expected array
            if(heights[i] != expected[i]){
                c++;
            }
        }
        // Returning the answer
        return c;
    }
}
