/**
 * Created by Administrator on 2015/2/15.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null) return;

        int m = matrix.length, n = matrix[0].length;
        boolean upzero = false, leftzero = false;
        for (int i = 0; i < n; i++){
            if (matrix[0][i]  == 0){
                upzero = true; break;
            }
        }

        for (int i = 0; i < m; i++){
            if (matrix[i][0] == 0){
                leftzero = true; break;
            }
        }

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0; matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++){
            if (matrix[0][i] == 0){
                for (int j = 0; j < m; j++)
                    matrix[j][i] = 0;
            }
        }

        for (int i = 1; i < m; i++){
            if (matrix[i][0] == 0){
                for (int j = 0; j < n; j++)
                    matrix[i][j] = 0;
            }
        }

        if (upzero){
            for (int i = 0; i < n; i++)
                matrix[0][i] = 0;
        }

        if (leftzero){
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }
    }
}
