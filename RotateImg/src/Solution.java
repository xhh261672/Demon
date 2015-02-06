/**
 * Created by Administrator on 2015/2/6.
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][]rm = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                rm[i][j] = matrix[n-1-j][i];
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                matrix[i][j] = rm[i][j];
        }
    }

    // rotate in-place
    public void rotate2(int [][]matrix){
        int n = matrix.length;
        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = tmp;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    // rotate unclockwise
    public void rotateUnclockwise(int [][]matrix){

        int n = matrix.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

    }
}
