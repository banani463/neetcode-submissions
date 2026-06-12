class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(nums);
      Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i <=nums.length - 3; i++) {
            for (int j = i + 1; j <=nums.length - 2; j++) {
                for (int k = j + 1; k <=nums.length-1; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}