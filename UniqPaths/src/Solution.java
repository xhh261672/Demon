/**
 * Created by Administrator on 2015/1/30.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
//        return findPath(m -1, n -1);

        Integer[][] re = new Integer[m][n];
        for (int i = 0; i < m; i++)
            re[i][0] = 1;
        for (int j = 0; j < n; j++)
            re[0][j] = 1;

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++)
                re[i][j] = re[i-1][j] + re[i][j-1];
        }
        return re[m-1][n-1];
    }

    private int findPath(int m, int n){
        if (m == 0){
            if (n != 0) return 1 + findPath(0, n - 1);
            else return 0;
        }
        else if (n == 0){
            if (m != 0) return 1 + findPath(m - 1, 0);
            else return 0;
        }
        else return findPath(m - 1, n) + findPath(m, n - 1);
    }


    public static void main(String []args){
        Solution solution = new Solution();
        System.out.print(solution.uniquePaths(2, 2));
    }

}
