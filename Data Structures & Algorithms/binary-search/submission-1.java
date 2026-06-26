class Solution {
    public int search(int[] nums, int target) {
        //this solution is not optinal as its time complexity is o(n)
        // we are considering the fact that the array is sorted.
    //    for(int i =0; i<nums.length; i++){
    //     if (nums[i]== target){
    //         return i;
    //     }
    //    } 
    //    return -1;
    int left =0;
    int right = nums.length-1;
    while(left<=right){
        int mid = left +(right-left)/2;
        if(target == nums[mid]){
            return mid;}
           else if(nums[mid]<target){
                left = mid+1;

            }else{
                right = mid-1;

            }
        }
        return -1;
    }
    }

