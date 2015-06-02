import java.util.HashMap;
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

    }

    

    public static void main (String []args){
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("XCIX"));
    }
}
