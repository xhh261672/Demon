import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/6/2.
 */
public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.equals("")) return -1;
        int re = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        re += map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++){
            if (map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                re  = re - map.get(s.charAt(i-1))*2 + map.get(s.charAt(i));
            }else{
                re += map.get(s.charAt(i));
            }
        }
        return re;
    }

    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        List<Integer> list = new ArrayList<Integer>();
        int bits = 0;
        while (num != 0){
            bits++;
            list.add(num%10);
            num /= 10;
        }

        for (int i = bits; i > 0; i--){
            int digit = list.get(i-1);
            if (i == 4){
                for (int j = 0; j < digit; j++)
                    sb.append('M');
            }
            else if (i == 3){
                if (digit < 4){
                    for (int j = 0; j < digit; j++)
                        sb.append('C');
                }else if (digit == 4){
                    sb.append("CD");
                }else if (digit == 5){
                    sb.append("D");
                }else if (digit < 9){
                    sb.append("D");
                    for (int j = 0; j < digit-5; j++)
                        sb.append('C');
                }else
                    sb.append("CM");
            }else if (i == 2){
                if (digit < 4){
                    for (int j = 0; j < digit; j++)
                        sb.append('X');
                }else if (digit == 4){
                    sb.append("XL");
                }else if (digit == 5){
                    sb.append("L");
                }else if (digit < 9){
                    sb.append("L");
                    for (int j = 0; j < digit-5; j++)
                        sb.append('X');
                }else
                    sb.append("XC");
            }else if (i == 1){
                if (digit < 4){
                    for (int j = 0; j < digit; j++)
                        sb.append('I');
                }else if (digit == 4){
                    sb.append("IV");
                }else if (digit == 5){
                    sb.append("V");
                }else if (digit < 9){
                    sb.append("V");
                    for (int j = 0; j < digit-5; j++)
                        sb.append('I');
                }else
                    sb.append("IX");
            }
        }

        return sb.toString();
    }



    public static void main (String []args){
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("XCIX"));
    }
}
