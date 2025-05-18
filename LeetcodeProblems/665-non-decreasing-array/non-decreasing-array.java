class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean modified = false;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (modified) {
                    return false;
                }
                modified = true;
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }

        return true;
    }
}
