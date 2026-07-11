class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//      HashMap<Integer,Integer>map = new HashMap<>();
//      for(int num:nums){
//         map.put(num,map.getOrDefault(num,0)+1);
//      }
// List<Integer>[]bucket = new ArrayList[nums.length+1];
// for(int num: map.keySet()){
//     int freq = map.get(num);
//     if(bucket[freq]==null){
//         bucket[freq]=new ArrayList<>();
    
//     }
//     bucket[freq].add(num);
// }
// int ans[] = new int [k];
// int index=0;
// for(int i=bucket.length-1;i>=0 && index<k;i--){
//     if(bucket[i]!=null){
//         for (int num: bucket[i]){
//             ans[index++] = num;
//             if(index == k ){
//                 break;
//             }
//         }
//     }
// }
// return ans;
HashMap<Integer,Integer>map = new HashMap<>();
      for(int num:nums){
         map.put(num,map.getOrDefault(num,0)+1);
      }
      PriorityQueue<Integer>pq = new PriorityQueue <>(
      (a , b) -> map.get(a) - map.get(b)
      );
      //keep only k frequent elements
      for(int key : map.keySet()){
        pq.offer(key);
        if(pq.size() > k){
            pq.poll();
        }
      }
      int [] ans = new int[k];
      for(int i =k-1;i>=0;i--){
        ans[i] = pq.poll();
      }
return ans;
    }
}
