class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //   list<list<String>>result = new ArrayList<>();
    //   boolean visited[] = new boolean[strs.length];
    //   for(int i =0; i< strs.length ; i++){
    //     if(visited[i]){
    //         continue;
    //     }
    //     list<String> group = new ArrayList<>();
    //     group.add(strs [i]);
    //     visited [i] = true;
    //     for(int j = i+1 ; j<strs.length ; j++){
    //     if(!visited[j] && isAnagram(strs[i],strs[j])){
    //       group.add(strs[j]);
    //       visited[j] = true;
    //     }
    //     }
    //     results.add(group);
    //   }
    //   return results;
    // }
    // private boolean isAnagram(String s1 , String s2){
    //   if(s1.length() != s2.length()){
    //     return false;
    //   }
    //   char []a = s1.toCharArray();
    //   char []b = s2.toCharArray();
    //   Arrays.sort(a);
    //   Arrays.sort(b);
    //   return Arrays.equals(a,b);
    HashMap<String, List<String>> map = new HashMap<>();
    for(String str: strs){
      char [] arr = str.toCharArray();
      Arrays.sort(arr);

      String key = new String(arr);
      if(!map.containsKey(key)){
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
    }
}
