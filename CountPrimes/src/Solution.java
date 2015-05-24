
/**
 * Created by Administrator on 2015/5/23.
 */
public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean []res = new boolean[n];
        for (int i = 0; i < n; i++){
            res[i] = true;
        }
        res[0] = res[1] = false;
        int re = 0;
        for  (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (res[i]){
               //System.out.println(i);
                for (int j = i*2;j<n;j+=i)
                    res[j] = false;
            }
        }
        for (int i = 0; i < n; i++){
            if (res[i]) re++;
            //System.out.println(i+" "+res[i]);
        }
        return re;
    }

//    private boolean isPrime(int n){
//        int t = (int)Math.sqrt(n);
//        for (int i = 2; i <= t; i++){
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

    public static void main (String []args){
        Solution solution = new Solution();
        System.out.print(solution.countPrimes(1500000));
    }
}
