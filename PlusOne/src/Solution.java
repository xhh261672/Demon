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

    public int[] plusOne2(int[] digits){
        if (digits == null) return null;

        int size = digits.length;
        int t = 0;
        for (int i = size-1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0; t = 1;
            }
            else {
                t = 0; digits[i]++;
            }
            if (t == 0) return digits;
        }
        if (t == 1)
            size ++;
        int []re = new int [size];
        re[0] = 1;

        for (int i = 0; i < size-1; i++)
            re[i+1] = digits[i];
        return re;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int []a = {9};
        solution.plusOne2(a);
    }

}
