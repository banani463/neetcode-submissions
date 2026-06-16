class Solution {
    public int trap(int[] height) {
       

        int n = height.length;
        int water = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = height[i];
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            int rightMax = height[i];
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }
}
        
  