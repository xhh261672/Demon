import java.util.List;

/**
 * Created by Administrator on 2015/1/31.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int sum = triangle.get(0).get(0), idx = 0;
        for (int i = 0; i < m; i++){
             if ((i+1) < m){
                 if (triangle.get(i+1).get(idx) <= triangle.get(i+1).get(idx+1))
                     sum += triangle.get(i+1).get(idx);
                 else{
                     idx ++;
                     sum += triangle.get(i+1).get(idx);
                 }
             }else
                 break;
        }
        return sum;
    }
}
