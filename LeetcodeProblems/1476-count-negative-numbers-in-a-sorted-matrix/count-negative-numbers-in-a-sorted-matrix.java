class Solution {
    public int countNegatives(int[][] grid) {
        // int m = grid.length;
        // int n = grid[0].length - 1;
        // int row = m-1;
        // int col = 0;
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}