import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/3/9.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (numRows == 0) return result;
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++){
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i) {
                    temp.add(1); continue;
                }else{
                    temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }
}
