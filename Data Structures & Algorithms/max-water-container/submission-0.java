class Solution {
    public int maxArea(int[] heights) {
        int maxarea =0;
        for(int i=0;i<heights.length-1;i++){
            for(int right=i+1;right<heights.length;right++){
                int width = right -i;
                int minHeight = Math.min(heights[i], heights[right]);
                int vol = width * minHeight;

                maxarea = Math.max(vol,maxarea);
            }
        }
       return maxarea;
    }
}
