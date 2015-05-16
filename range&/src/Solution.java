/**
 * Created by Administrator on 2015/5/16.
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        if (m == n) return m;

        int rightTail = 0;
        while (m != n){
            m>>=1;
            n>>=1;
            rightTail++;
        }
        return m<<rightTail;
    }
}
