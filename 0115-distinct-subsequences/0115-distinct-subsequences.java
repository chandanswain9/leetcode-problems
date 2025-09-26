class Solution {
    public int numDistinct(String s, String t) {
        int n = t.length();
        int m = s.length();
        int[][] memo = new int[n + 1][m + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return rec(0, 0, s, t, memo);
    }

    private int rec(int i, int j, String s, String t, int[][] memo) {
        int n = t.length();
        int m = s.length();

        if (i == n) return 1;
        if (j == m) return 0;
        if (memo[i][j] != -1) return memo[i][j];

        int ans = 0;
        if (t.charAt(i) == s.charAt(j)) {
            ans += rec(i + 1, j + 1, s, t, memo);
        }
        ans += rec(i, j + 1, s, t, memo);

        memo[i][j] = ans;
        return ans;
    }
}