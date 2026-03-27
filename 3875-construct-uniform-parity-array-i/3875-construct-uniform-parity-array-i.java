class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;

        for (int num : nums1) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        if (odd == 0) return true;
        if (even == 0) return true;

        if (odd >= 1 && even >= 1) return true;
        if (even >= 1 && odd >= 2) return true;

        return false;
    }
}