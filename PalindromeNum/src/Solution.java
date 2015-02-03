/**
 * Created by Administrator on 2015/2/3.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int l = 0, r = 0, len = 0, t = x;
        while (t != 0){
            t = t/10;
            len ++;
        }
//        System.out.println(len);
        if (len == 1) return true;
        if (len == 2 && x % 11 == 0) return true;

        while (true){
            if (len == 1) return true;
            if (len == 2 && x % 11 == 0) return true;

            int mag = (int) Math.pow(10.0, len -1);
            l = x / mag;
            x %= mag;
            len --;
//            mag = (int) Math.pow(10.0, len -1);
            r = x % 10;
            x /= 10;
            len --;
            if (l != r) return false;
        }
    }

    public  boolean isPalindrome2(int x){
        if (x<0 || (x !=0 && x % 10 == 0)) return false;
        int ret = 0;
        while (x > ret){
            ret = ret*10 + x%10;
            x /= 10;
        }

        return (x == ret) || (x == ret/10);
    }

    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(solution.isPalindrome(-2147447412));
    }

}
