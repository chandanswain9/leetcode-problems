class Solution {
    static final int MOD = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < t; i++) {
            int[] newCount = new int[26];
            for (int j = 0; j < 25; j++) {
                newCount[j + 1] = (newCount[j + 1] + count[j]) % MOD;
            }
            newCount[0] = (newCount[0] + count[25]) % MOD;
            newCount[1] = (newCount[1] + count[25]) % MOD;

            count = newCount;
        }

        long result = 0;
        for (int c : count) {
            result = (result + c) % MOD;
        }

        return (int) result;
    }
}