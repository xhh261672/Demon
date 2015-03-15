/**
 * Created by Administrator on 2015/3/16.
 */
public class Solution {

    public int reverseBits(int n) {
        int i = 0, re = 0;
        while (i < 32){
            re = (re << 1) + (n & 1);
            n >>>= 1;
            i++;
        }
        return re;
    }
}
