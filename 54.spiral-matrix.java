/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */


// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol = new ArrayList<Integer>(); 
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        while(left<right && top<bottom) {
            for(int i=left; i<right; i++) 
                sol.add(matrix[top][i]);
            top++;
            for (int j=top; j<bottom; j++)
                sol.add(matrix[j][right-1]);
            right--;
            if (!(left<right && top<bottom))
                break;
            for(int i=right-1; i>=left; i--)
                sol.add(matrix[bottom-1][i]);
            bottom--;
            for(int j =bottom-1; j>=top;j--)
                sol.add(matrix[j][left]);
            left++;
        }
        return sol;
    }
}
// @lc code=end

