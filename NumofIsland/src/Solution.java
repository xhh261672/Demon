/**
 * Created by Administrator on 2015/5/2.
 */
public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0)return 0;
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (visit(grid, i, j)) count++;
            }
        }
        return count;
    }

    private boolean visit(char[][]grid, int r, int c){
        if (r<0 || c<0 ||  r >= grid.length || c >= grid[0].length || grid[r][c] != '1')
            return false;

        grid[r][c] = 'v';
        visit(grid, r, c-1);
        visit(grid, r, c+1);
        visit(grid, r-1, c);
        visit(grid, r+1, c);
        return true;
    }
}
