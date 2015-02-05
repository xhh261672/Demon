/**
 * Created by Administrator on 2015/2/5.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        int []p = new int[m];
        for (int i = 0; i < m; i++) p[i] = 0;

        for (int i = 1; i < m; i++){
            p[i] = p[i-1];
            while (p[i] > 0 && needle.charAt(p[i]) != needle.charAt(i))
                p[i] = p[p[i] - 1];

            if (needle.charAt(p[i]) == needle.charAt(i))
                p[i] ++;
        }

        // KMP

        int pre = 0;
        for (int i = 0; i < n; i++){
            while (pre > 0 && needle.charAt(pre) != haystack.charAt(i))
                pre = p[pre - 1];
            if (needle.charAt(pre) == haystack.charAt(i)) pre ++;
            if (pre == m) return i - pre + 1;
        }

        return -1;
    }
}
