class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 0; i < n - 1; i++) {
            int num = Math.abs(nums[i] - nums[i+1]);
            if(num > maxDiff){
                maxDiff = num;
            }
        }
        if(Math.abs(nums[0] - nums[n-1]) > maxDiff){
            maxDiff = Math.abs(nums[0] - nums[n-1]);
        }
        return maxDiff;
    }
}