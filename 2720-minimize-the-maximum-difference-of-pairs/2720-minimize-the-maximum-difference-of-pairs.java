class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int lo = -1, hi = 1000000007;
        while (lo < hi - 1) {
            int mid = lo + (hi - lo) / 2;
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    count++;
                    i++;
                }
            }
            if (count >= p) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        return hi;
    }
}