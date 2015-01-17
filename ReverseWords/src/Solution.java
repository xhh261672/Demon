/**
 * Created by Administrator on 2015/1/16.
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null)
            return null;
        if (s.equals(""))
            return "";
        s = s.trim();
        String []ss = s.split("\\s+");
        //System.out.println(ss[0]);
        StringBuffer sbuffer = new StringBuffer();
        for (int i = ss.length -1 ; i >=0; i--){
            sbuffer.append(ss[i]);
            if (i != 0)
                sbuffer.append(" ");
        }
        s = sbuffer.toString();
        //System.out.print(s);
        return s;
    }

    public static void main(String []args){
        String s = " 1";
        Solution solution = new Solution();
        System.out.print(solution.reverseWords(s));
    }
}
