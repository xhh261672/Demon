import java.util.Arrays;

/**
 * Created by Administrator on 2015/2/4.
 */
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int closest = num[0]+num[1]+num[2], diff = Math.abs(closest - target);
        for (int i = 0; i < num.length-2; i++){
            if (i > 0 && num[i] == num[i-1]) continue;
            int j = i + 1, k = num.length -1;
            while (j < k){
                int sum = num[i] + num[j] + num[k];
                int curDiff =  Math.abs(sum - target);
                if (curDiff < diff){
                    diff = curDiff;
                    closest = sum;
                }
                if (sum < target) j++;
                else k--;
            }
        }
        return closest;
    }
}
