class Solution {
    private int helper(String s, int i, int j, Integer[][] memo) {
        if (i >= j) return 0;
        if (memo[i][j] != null) return memo[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = helper(s, i + 1, j - 1, memo);
        } else {
            memo[i][j] = 1 + Math.min(helper(s, i + 1, j, memo), helper(s, i, j - 1, memo));
        }

        return memo[i][j];
    }
    public int minInsertions(String s) {
        int n = s.length();
        Integer[][] memo = new Integer[n][n];
        return helper(s, 0, n - 1, memo);
    }
}