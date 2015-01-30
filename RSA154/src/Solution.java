/**
 * Created by Administrator on 2015/1/30.
 */
public class Solution {
    public int findMin(int[] num) {
        int l = 0, r = num.length -1;
        while (l < r){
            int m = l + (r - l)/2;
            if (num[m] > num[r]) l = m + 1;
            if (num[m] < num[r]) r = m;
            else r -- ;
        }
        return num[l];
    }
}
