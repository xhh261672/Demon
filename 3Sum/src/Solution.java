import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/2/4.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        if (num.length != 0 && num[0] >= 0) return null;

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for (int i = 0; i < num.length-2; i++){
            if (i > 0 && num[i]==num[i-1])
                continue;
            int j = i + 1, k = num.length-1;
            while (j < k){
                int sum = num[i] + num[j] + num[k];
                if (sum == 0){
                    results.add(Arrays.asList(num[i], num[j], num[k]));
                }
                if (sum < 0){
                    j++;
                    while (j < k && num[j] == num[j-1]) j++;
                }
                else{
                    k--;
                    while (j < k && num[k] == num[k+1]) k--;
                }
            }
        }
        return results;
    }
}
