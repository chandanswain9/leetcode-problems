class Solution {
    private Map<Integer, List<Integer>> map;
    private Random rand;

    public Solution(int[] nums) {
        map = new HashMap<>();
        rand = new Random();
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> indices = map.get(target);
        return indices.get(rand.nextInt(indices.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */