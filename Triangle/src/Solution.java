import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2015/1/31.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();

        for (int i = 1; i < m; i++){
             int n = triangle.get(i).size();
            for (int j = 0; j < n; j++){
                if (j == 0)
                    triangle.get(i).set(j, triangle.get(i).get(j)+triangle.get(i-1).get(j));
                else if (j == n - 1)
                    triangle.get(i).set(j, triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                else{
                    int pre = triangle.get(i-1).get(j) > triangle.get(i-1).get(j-1) ? triangle.get(i-1).get(j-1): triangle.get(i-1).get(j);
                    triangle.get(i).set(j, triangle.get(i).get(j) + pre);
                }
            }
        }
        int re = Collections.min(triangle.get(m-1));
        return re;
    }
}
