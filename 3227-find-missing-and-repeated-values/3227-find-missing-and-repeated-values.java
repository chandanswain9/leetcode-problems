class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];
        int[] ans  = new int[2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        for(int num = 1; num <= size; num++) {
            if(freq[num] == 2) ans[0] = num;
            if(freq[num] == 0) ans[1] = num;
        }

        return ans;
    }
}