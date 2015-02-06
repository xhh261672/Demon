/**
 * Created by Administrator on 2015/2/6.
 */
public class Solution {
    public String convertToTitle(int n) {
        if (n==0) return "";

        int ret = n;
        StringBuilder builder = new StringBuilder();
        while (ret != 0){
//            char bit = Character.toChars(65 + ((ret % 26) - 1))[0];
            char bit = (char)('A'+ (ret-1)% 26);

            builder.append(bit);
            ret = (ret-1)/26;
        }
        String s = builder.toString();
        StringBuffer buffer = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--)
            buffer.append(s.charAt(i));

        return buffer.toString();


//        return builder.reverse().toString();

        //reverse 大法好。。。。。
    }

    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(53));
    }
}
