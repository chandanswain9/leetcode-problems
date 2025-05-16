class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int totSum = 0;
        for(int i = 0; i < m; i++) {
            totSum += mat[i][i];
            if(i != n-1-i) {
                totSum += mat[i][n-1-i];
            }
        }
        return totSum;
    }
}