class Solution {
    private int lcsHelper(String s1, String s2, int i, int j, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        
        if (dp[i][j] != -1) return dp[i][j];
        
        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + lcsHelper(s1, s2, i - 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(lcsHelper(s1, s2, i - 1, j, dp), lcsHelper(s1, s2, i, j - 1, dp));
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        int lcsLen = lcsHelper(word1, word2, m - 1, n - 1, dp);
        
        return (m - lcsLen) + (n - lcsLen);
    }
}