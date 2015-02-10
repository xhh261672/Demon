/**
 * Created by Administrator on 2015/2/10.
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (a == null) return b;
        if (b == null) return a;

        int l1 = a.length(), l2 = b.length();

        StringBuilder builder = new StringBuilder();
        int i = l1-1, j = l2 -1, t = 0;
        for (; i >=0 && j >= 0; i--, j--){
            int da = a.charAt(i) - '0', db = b.charAt(j) - '0';
            builder.append(Integer.toString((da+db+t)%2));
            t = (da+db+t)/2;
        }
        while (i >= 0){
            int da = a.charAt(i) - '0';
            builder.append(Integer.toString((da+t)%2));
            t = (da+t) /2;
            i--;
        }
        while (j >= 0){
            int db = b.charAt(j) - '0';
            builder.append(Integer.toString((db+t)%2));
            t = (db+t)/2;
            j--;
        }
        if (t == 1)
            builder.append("1");

        return builder.reverse().toString();
    }
}
