import java.util.Set;

/**
 * Created by haeckel on 15-5-31.
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (s == null || wordDict.isEmpty()) return false;
        int i = 0, j = 0;
        while (i < s.length()){
            while (j+1 < s.length()){
                if (wordDict.contains(s.substring(i, j+1))){
                    i = j+1;
                }
                j++;
            }
        }

        if (j >= s.length() && i < s.length()) return false;
        return true;
    }
}
