import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/2/7.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        int m = matrix.length;
        if (m == 0) return spiral;
        int n = matrix[0].length;

        int u = 0, d = m-1;
        int l = 0, r = n-1;

        int i = 0, j = 0;

        while (l < r && u < d){
//            System.out.println(i + " " + j);
            spiral.add(matrix[i][j]);
            if (i == u && j < r) j++;
            else if (j == r && i < d) i++;
            else if (i == d && j > l) j--;
            else if (j == l && i > u+1) i--;
            else if (i == u+1 && j == l){
                l++;u++;
                r--;d--;
                j++;
            }

        }
//        System.out.println(l + " " + r +" "+u+" "+d);
        if (l == r){
            for (int k = u; k <= d; k++)
                spiral.add(matrix[k][l]);
        }
        else if (u == d){
            for (int k = l; k <= r; k++)
                spiral.add(matrix[u][k]);
        }
        return spiral;
    }

    public static void main(String []args){
        int [][]m = {{1,2,3},{4,5,6},{7,8,9}};
        Solution solution = new Solution();
        List<Integer> re = solution.spiralOrder(m);
        for (int i = 0; i < re.size(); i++)
            System.out.print(re.get(i) + " ");
    }
}
