class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int[] index : indices){
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int oddRow = 0;
        for(int row: rows){
            if(row%2!=0) oddRow++;
        }
        int oddCol = 0;
        for(int col: cols){
            if(col %2!=0) oddCol++;
        }
        int totOdd = (oddRow * (n-oddCol)) + ((m-oddRow) * oddCol);
        return totOdd;
    }
}