import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/2/1.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(S);

        for (int i = 0; i < 1<<(S.length); i++){
            List<Integer> result = new ArrayList<Integer>();
            for (int j = 0; j < S.length; j++){
                if ((i&(1<<j))!= 0) result.add(S[j]);
            }
            results.add(result);
        }

        return results;
    }
}
