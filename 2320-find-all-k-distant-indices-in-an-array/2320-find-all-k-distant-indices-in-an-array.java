class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> res = new HashSet<>();
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int start = Math.max(0, j - k);
                int end = Math.min(n - 1, j + k);
                for (int i = start; i <= end; i++) {
                    res.add(i);
                }
            }
        }
        List<Integer> sortedRes = new ArrayList<>(res);
        Collections.sort(sortedRes);
        return sortedRes;
    }
}