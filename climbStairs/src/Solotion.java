/**
 * Created by Administrator on 2015/4/3.
 */
public class Solotion {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int []num = new int[n+1];
        num[0] = 0;
        num[1] = 1;
        num[2] = 2;
        for (int i = 3; i <= n; i++){
            num[i] = num[i-1] + num[i-2];
        }
        return num[n];
    }

    public static void main (String []args){
        Solotion solotion = new Solotion();
        System.out.print(solotion.climbStairs(5));
    }
}
