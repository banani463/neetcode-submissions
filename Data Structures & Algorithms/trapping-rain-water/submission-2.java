class Solution {
    public int trap(int[] height) {
       
        // int water =0;
        // int n = height.length ;
        // for(int i = 0;i<n;i++){
        //     int leftmax = height[i];
        //     for (int j =0; j<=i; j++){
        //         leftmax = Math.max(leftmax , height[j]);
        //     }
        //      int rightmax = height[i];
        //     for(int j =i;j<n;j++){
               
        //         rightmax = Math.max(rightmax , height[j]);
        //     }
        //     water += Math.min(leftmax , rightmax)- height[i];
        // }
        // return water;
        int water = 0;

        int left =0;
        int right = height.length -1;

        int leftmax = 0;
        int rightmax = 0;

        while(left<right){

            if(height[left]< height[right]){

            if(height[left] >= leftmax){
                leftmax = height[left];
            }else{
                water += leftmax - height[left];
            }
            left++;
            }else{
                if(height[right]>= rightmax){
                    rightmax = height[right];
                }else{
                    water += rightmax - height[right];
                }

                right--;
            }

        }
        return water;
        
    
    }
}
        
 