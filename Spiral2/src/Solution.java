/**
 * Created by Administrator on 2015/2/8.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int [][]m = new int[n][n];
        int k = 1;

        int l = 0, r = n-1;
        int u = 0, d = n-1;
        int i = 0, j = 0;
        while (l < r && u < d){
//            System.out.println(k);
            m[i][j] = k;
            if (i == u && j < r) j++;
            else if (j == r && i < d) i++;
            else if (i == d && j > l) j--;
            else if (j == l && i > u+1) i--;
            else if (i == u+1 && j == l){
                l++;u++;
                r--;d--;
                j++;
            }
            k++;
        }

        if (l == r){
            for (int s = u; s <= d; s++, k++)
                m[s][l] = k;
        }

        return m;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int [][]m = solution.generateMatrix(4);

        for (int i = 0; i < m.length; i ++){
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
