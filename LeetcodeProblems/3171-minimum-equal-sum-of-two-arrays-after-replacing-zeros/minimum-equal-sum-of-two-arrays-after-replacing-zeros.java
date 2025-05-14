class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int zero1 = 0, zero2 = 0;
        for(int n : nums1) {
            if(n == 0){
                zero1++;
            }else {
                sum1 += n;
            }
        }
        for(int n : nums2) {
            if(n == 0) {
                zero2++;
            }else {
                sum2 += n;
            }
        }
        long minTarget = Math.max(sum1 + zero1, sum2 + zero2);
        long extra1 = minTarget - sum1;
        long extra2 = minTarget - sum2;

        if ((zero1 == 0 && sum1 != minTarget) || (zero2 == 0 && sum2 != minTarget)) {
            return -1;
        }

        if (extra1 < zero1 || extra2 < zero2) {
            return -1;
        }
        return minTarget;
    }
}