import java.util.HashMap;

/**
 * Created by Administrator on 2015/2/3.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int max = 0;
        for (int i=0, j=0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))) j = Math.max( j, map.get(s.charAt(i))+1 );
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
