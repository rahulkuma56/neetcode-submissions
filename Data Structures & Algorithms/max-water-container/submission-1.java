class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1;
        int max = 0;
        //for(int i=0; i<heights.length-1; i++){

            while(l<r){
            int bar = Math.min(heights[l], heights[r]);
            max = Math.max(max, (bar*(r-l)));
            if (heights[l] <= heights[r])
                l++; 
            else
                r--;
        }
        return max;
             
    }
}
