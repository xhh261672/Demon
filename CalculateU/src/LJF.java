import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/9.
 */
public class LJF {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double rou = 7.93;
        double pi = Math.PI;
        while (sc.hasNextLine()){
             double d1 = sc.nextDouble();
             double d2 = sc.nextDouble();
             double h = sc.nextDouble();
             System.out.println(rou * (pi * h * (d1 * d1 - d2 * d2))/4000000);
        }
    }
}
