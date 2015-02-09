import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/2/9.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null) return null;
        List<Integer> list = new ArrayList<Integer>();

        int size = digits.length;
        int digit = 0, t = 0;
        if (digits[size-1] == 9) {
            digit = 0;
            t = 1;
        }else {
            digit = digits[size-1] + 1;
        }
        list.add(digit);
        for (int i = size-2; i >= 0; i--){
            digit = (digits[i]+t)%10;
            t = (digits[i]+t)/10;
            list.add(digit);
        }
        if (t == 1) list.add(1);
        size = list.size();
        int []re = new int[size];
        for (int i = list.size()-1; i >= 0;i--){
            re[size-1-i] = list.get(i);
        }
        return re;
    }
}
