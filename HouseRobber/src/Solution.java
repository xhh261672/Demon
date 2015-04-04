/**
 * Created by Administrator on 2015/4/4.
 */
public class Solution {
    public int rob(int[] num) {
        int l = num.length;
        if (l == 0) return 0;
        if (l == 1) return num[0];
        if (l == 2) return Math.max(num[0], num[1]);
        int premax = num[0];
        for (int i = 2; i < l; i++){
            num[i] += premax;
            if (num[i-1] > premax) premax = num[i-1];
        }
        return Math.max(num[l-2], num[l-1]);
    }
}
