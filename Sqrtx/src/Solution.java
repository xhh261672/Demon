/**
 * Created by Administrator on 2015/1/27.
 */
public class Solution {
    public int sqrt(int x) {
        if (x <= 0) return x;

        int sqrt = findu(x);
        return sqrt;
    }

    private int findroot(int x, int l, int r){
        if (l == r) {
            if (l*l > x) return l - 1;
            if (l*l <= x) return l;
        }
        int m = (l+r) /2;
        if (m*m > x) return findroot(x, l, m);
        if (m*m < x) return findroot(x, m+1, r);
        return m;
    }

    private int findu(int x){
        int l = 1, r = x;
        int m = (l+r) /2;
        while (l  <= r){
//            long temp = m * m;
            if (m == x / m) return m;
            if (m > x/m) r = m - 1;
            else l = m + 1;
            m = (l+r)/2;
        }
        return m;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(solution.sqrt(2147483647));
//        System.out.println(solution.sqrt(3));

//        System.out.println(Long.MAX_VALUE);
    }
}
