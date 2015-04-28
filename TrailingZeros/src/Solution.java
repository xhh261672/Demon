/**
 * Created by Administrator on 2015/4/28.
 */
public class Solution {

    //TLE 1808548329
    public int trailingZeroes2(int n) {
        if (n <= 4) return 0;
        int []a = new int [3];
        int t = 0;
        for (int i = 1; i <= n; i++){
            t = i % 10;
            if (t == 0) a[0]++;
            if (t == 2) a[1]++;
            if (t == 5) a[2]++;
        }
        int couple = Math.min(a[1], a[2]);
        return a[0] + couple;
    }

    // 每个5的倍数都有一个5能产生一个0
    // 每个25的倍数都多一个5能产生一个0
    // 每个125的倍数也能。。

    public int trailingZeroes(int n) {
        int z = 0;
        while (n > 0){
            n = n/5; //5的倍数里面必定包括25,125,5^4的倍数
            z += n;
        }

        return z;
    }


    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(1808548329));
    }
}
