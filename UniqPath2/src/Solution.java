import sun.misc.OSEnvironment;

/**
 * Created by Administrator on 2015/1/30.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length -1, n = obstacleGrid[0].length -1;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m][n] == 1) return 0;
//        System.out.println(obstacleGrid.length + " "+ obstacleGrid[0].length);
        boolean blocked = false;
        for (int i = 0; i < obstacleGrid.length; i++){
            if (blocked) {
                obstacleGrid[i][0] = 0;
                continue;
            }
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
                blocked = true;
                continue;
            }
            obstacleGrid[i][0] = 1;
        }
        blocked = false;
        for(int j = 1; j< obstacleGrid[0].length; j++){
            if (blocked){
                obstacleGrid[0][j] = 0;
                continue;
            }
            if (obstacleGrid[0][j] == 1) {
                obstacleGrid[0][j] = 0;
                blocked = true;
                continue;
            }
            obstacleGrid[0][j] = 1;
        }

        for (int i = 1; i< obstacleGrid.length; i++){
            for (int j = 1; j < obstacleGrid[0].length; j++){
                if (obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
            }
        }

        return obstacleGrid[m][n];
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int [][]a = {{1,0}};
        System.out.println(solution.uniquePathsWithObstacles(a));
    }
}
