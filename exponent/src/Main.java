import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/24.
 */
public class Main {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            DecimalFormat df = new DecimalFormat("0.00");
            for (int i = 0; i < n; i++){
                double base = sc.nextDouble();
                int exp = sc.nextInt();
                System.out.println(df.format(Math.pow(base, exp)));
            }
        }
    }

    private static double calExp (double base, int exp){
        if (exp == 0)
            return 1;
        if (exp == 1)
            return base;

        double re = calExp(base, exp>>1);
        re *= re;
        if ((exp & 1) == 1)
            re *= base;
        return re;
    }
}
