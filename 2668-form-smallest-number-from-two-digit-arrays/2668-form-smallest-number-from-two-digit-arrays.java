class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set1 =new HashSet<>();
        int min1 = 10, min2 = 10;

        for(int num  : nums1) {
            set1.add(num);
            min1 = Math.min(min1,num);
        }
        int minCommon = 10;
        for(int num : nums2) {
            if(set1.contains(num)) {
                minCommon = Math.min(minCommon,num);
            }
            min2 = Math.min(min2,num);
        }
        if(minCommon != 10) {
            return minCommon;
        }
        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }
}