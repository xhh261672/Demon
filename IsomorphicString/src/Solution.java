import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/25.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                if (t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            }else if (map.containsValue(t.charAt(i))){
                return false;
            }
            else
                map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static void main (String []args){
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));
    }
}
