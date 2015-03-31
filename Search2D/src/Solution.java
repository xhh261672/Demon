/**
 * Created by Administrator on 2015/2/11.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        int up = 0, down = m-1;
        int mr = (up+down) / 2;
        while (up < down){
            if (matrix[mr][0] == target) return true;
            if (target > matrix[mr][0]) {
                if (mr == down-1){
                    if (target >= matrix[down][0]) {
                        mr++; break;
                    }else break;
                }else if (mr == down){
                    break;
                }else{
                    up = mr;
                }
            }
            else down = mr - 1;
            mr = (up+down)/2;
        }

        int l = 0, r = n-1;
        int mc = (l+r)/2;
        while (l <= r){
            if (target == matrix[mr][mc]) return true;
            else if (target > matrix[mr][mc]) l = mc+1;
            else r = mc-1;
            mc = (l+r) / 2;
        }
        return false;
    }

    public boolean searchMatrix2(int [][]matrix, int target){
        int r = matrix.length, c = matrix[0].length;
        int left = 0, right = r*c-1;
        int m = (left + right) / 2;

        while (left <= right){
            int value = matrix[m/c][m%c];
            if (value == target) return true;
            else if (target >= value) left = m + 1;
            else right = m-1;
            m = (left+right)/2;
        }

        return false;
    }

}
