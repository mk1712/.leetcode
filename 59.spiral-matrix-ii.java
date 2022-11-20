/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 1;
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        while(left<right && top<bottom) {
            for(int j=left; j<right; j++) {
                matrix[top][j]=i;
                i++;}
            top++;
            for (int j=top; j<bottom; j++){
                matrix[j][right-1]=i;
                i++;}
            right--;
            if (!(left<right && top<bottom))
                break;
            for(int j=right-1; j>=left; j--){
                matrix[bottom-1][j]=i;
                i++;}
            bottom--;
            for(int j =bottom-1; j>=top;j--){
                matrix[j][left]=i;
                i++;}
            left++;
        }
        return matrix;
        }
    }

// @lc code=end

