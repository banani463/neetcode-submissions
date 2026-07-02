class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        //find the correct row 
        int rows = -1;
        for (int i =0;i<row;i++){
            if (target>=matrix[i][0] && target <= matrix[i][col-1]){
                rows=i;
                break;
            }
        }
        if(rows==-1){
            return false;
        }
     int left = 0;
     int right = col - 1;
     while(left<=right){
        int mid = left+(right-left)/2;

        if(matrix[rows][mid]==target){
            return  true;
        }else if(
        matrix[rows][mid]<target
        ) {left = mid +1;
     } else{
        right = mid -1;
     } }
     return false; 
    }
}
