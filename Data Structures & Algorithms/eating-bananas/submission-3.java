class Solution {
    public int minEatingSpeed(int[] piles, int h) {
//     int max = 0;
//     for(int pile:piles){
//         if(pile>max){
//              max=pile;
//         }

//     }
//     for(int k=1;k<max;k++){
//         int hours = 0;
//         for(int pile:piles){
//             hours +=(pile+k-1)/k;
//         }
//         if(hours<=h){
//             return k;
//         }
//     }
// return max;
int max =0;
for(int pile:piles){
    if(pile>max){
        max=pile;
    }
}
int low =1;
int high = max;
int ans = max;
while(low<=high){
    int mid = low + (high-low)/2;
    int hours =0;
    for(int pile:piles){
        hours += (pile+mid-1)/mid; 
    }
    if(hours<=h){
        ans = mid;
        high = mid -1;
    }else{
        low = mid +1;
    }
} 
return ans;
    }
}
