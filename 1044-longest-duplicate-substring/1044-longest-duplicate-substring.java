class Solution {
    private static final long MOD1 = 1_000_000_007L;
    private static final long MOD2 = 1_000_000_009L;
    private static final long BASE = 26;

    public String longestDupSubstring(String s) {
        int n = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.charAt(i) - 'a';
        }
        int left = 1, right = n - 1;
        int start = 0, maxLen = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int idx = search(mid, nums, n);
            if (idx != -1) {
                start = idx;
                maxLen = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return s.substring(start, start + maxLen);
    }

    private int search(int L, int[] nums, int n) {
        long hash1 = 0, hash2 = 0;
        for (int i = 0; i < L; i++) {
            hash1 = (hash1 * BASE + nums[i]) % MOD1;
            hash2 = (hash2 * BASE + nums[i]) % MOD2;
        }
        HashSet<Long> seen = new HashSet<>();
        seen.add((hash1 << 32) | hash2);
        long pow1 = 1, pow2 = 1;
        for (int i = 0; i < L; i++) {
            pow1 = (pow1 * BASE) % MOD1;
            pow2 = (pow2 * BASE) % MOD2;
        }
        for (int i = L; i < n; i++) {
            hash1 = (hash1 * BASE - nums[i - L] * pow1 % MOD1 + MOD1) % MOD1;
            hash1 = (hash1 + nums[i]) % MOD1;
            hash2 = (hash2 * BASE - nums[i - L] * pow2 % MOD2 + MOD2) % MOD2;
            hash2 = (hash2 + nums[i]) % MOD2;

            long combined = (hash1 << 32) | hash2;
            if (seen.contains(combined)) {
                return i - L + 1;
            }
            seen.add(combined);
        }
        return -1;
    }
}
