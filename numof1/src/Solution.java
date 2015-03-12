/**
 * Created by Administrator on 2015/3/11.
 */
public class Solution {
    public int hammingWeight(int n) {
        int i = 0;
        int count = 0;
        while (i < 32){
            if ((n & 1) == 1) count++;
            n >>>= 1;
            i++;
        }
        return count;
    }
}
