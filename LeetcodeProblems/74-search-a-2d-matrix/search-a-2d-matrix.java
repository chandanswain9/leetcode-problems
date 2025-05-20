class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int right = n-1;
        
        while(top < m && right >= 0) {
            if(matrix[top][right] == target) {
                return true;
            }else if(target < matrix[top][right]) {
                right--;
            }else if(target > matrix[top][right]) {
                top++;
            }else if(target == matrix[top][right]) {
                return true;
            }
        }
        return false;
    }
}