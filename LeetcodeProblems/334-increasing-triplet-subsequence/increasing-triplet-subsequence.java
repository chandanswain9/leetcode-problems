class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int n: nums) {
            if (n <= small) {
                small = n;
            } else if (n <= secSmall) {
                secSmall = n;
            } else {
                return true;
            }
        }
        return false;
    }
}