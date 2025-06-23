class Solution {
    public int search(int[] nums, int target) {
        int lt = 0, rt = nums.length - 1;
        while(lt <= rt) {
            int mid = lt + (rt - lt) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[lt] <= nums[mid]) {
                if(nums[lt] <= target && target < nums[mid]){
                    rt = mid - 1;
                } else {
                    lt = mid + 1;
                }
            }else {
                if(nums[mid] < target && target <= nums[rt]){
                    lt = mid + 1;
                }else {
                    rt = mid -1;
                }
            }
        }
        return -1;
    }
}