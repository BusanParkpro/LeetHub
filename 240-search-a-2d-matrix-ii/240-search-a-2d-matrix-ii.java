class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = 0;
        int r = matrix.length - 1;
        
        while (r >= 0 && c < matrix[0].length) {
            int value = matrix[r][c];
            
            if (target == value) {
                return true;
            } else if (target < value) {
                r--;
            } else {
                c++;
            }
        }
        return false;
    }
}