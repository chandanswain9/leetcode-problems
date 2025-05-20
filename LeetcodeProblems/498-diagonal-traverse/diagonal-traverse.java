class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat[0].length == 0 ) {
            return  new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];
        int idx = 0;
        
        for(int d = 0; d < m+n -1; d++) {
            List<Integer> helper = new ArrayList<>();
            int row = (d<n)?0 : d-n+1;
            int col = (d<n)?d : n-1;

            while( row < m && col >= 0) {
                helper.add(mat[row][col]);
                row++;
                col--;
            }
            if(d%2 == 0) {
                Collections.reverse(helper);
            }
            for(int num : helper) {
                res[idx++] = num; 
            }
        }
        return res;
    }
}