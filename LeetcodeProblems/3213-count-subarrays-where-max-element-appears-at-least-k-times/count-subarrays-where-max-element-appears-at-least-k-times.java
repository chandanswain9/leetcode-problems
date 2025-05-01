class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        long ans = 0;
        int count = 0, left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxVal) {
                count++;
            }
            while (count >= k) {
                if (nums[left] == maxVal) {
                    count--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}