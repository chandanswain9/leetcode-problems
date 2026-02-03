class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;
        boolean[] inc = new boolean[n];
        boolean[] dec = new boolean[n];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            inc[i] = inc[i - 1] && nums[i - 1] < nums[i];
        }
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = dec[i + 1] && nums[i] < nums[i + 1];
        }
        for (int p = 1; p < n - 2; p++) {
            if (!inc[p]) continue;
            int q = p;
            while (q + 1 < n && nums[q] > nums[q + 1]) {
                q++;
                if (q < n - 1 && dec[q]) return true;
            }
        }
        return false;
    }
}
