import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Solution {
    public String countAndSay(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";
        String s = "1";

        for (int i = 0; i < n -1; i++){
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < s.length();){
                int count = 1, cur = j+1;
                while (cur < s.length() && s.charAt(cur) == s.charAt(j)){
                    cur++;
                    count++;
                }
                builder.append(count).append(s.charAt(j));
                j += count;
            }
            s = builder.toString();
//            System.out.println(s);
        }
        return s;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        solution.countAndSay(2);
    }
}
