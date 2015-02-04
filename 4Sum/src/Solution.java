import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/2/4.
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (num == null || num.length < 4) return results;
        Arrays.sort(num);

        for (int s = 0; s < num.length -3; s++){
            if (s>0 && num[s] == num[s-1]) continue;

            for (int e = num.length-1; e >= s+3; e--){
                if (e < num.length-1 && num[e] == num[e+1]) continue;

                int j = s+1, k = e -1;
                while (j < k){
                    int sum = num[s] + num[j] + num[k] + num[e];
                    if (sum == target)
                        results.add(Arrays.asList(num[s],num[j], num[k], num[e]));
                    if (sum < target){
                        j++;
                        while (j < k && num[j] == num[j-1]) j++;
                    }
                    else{
                        k--;
                        while (j < k && num[k] == num[k+1]) k--;
                    }
                }
            }
        }

        return results;
    }
}
