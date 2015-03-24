/**
 * Created by Administrator on 2015/3/23.
 */
public class Solution {

    /**
     *	判断str1是否是str2的旋转词
     *	输入：字符串str1，字符串str2
     *	返回：true代表str1是str2的旋转词；false代表不是
     */
    public boolean isRotation(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        if (len1 != len2) return false;
        int s = 0;
        for (; s < len1; s++){
            if (str1.charAt(s) == str2.charAt(0))
                break;
        }
        int i = 0;
        while (i < len2){
            if (str1.charAt(s) != str2.charAt(i))
                return false;
            s++;i++;
            s %= len1;
        }

        return true;
    }
}
