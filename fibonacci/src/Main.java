import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/16.
 */
public class Main {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(jump2(n));
        }
    }

    private static long calFib(int n){
        if (n == 0) return 0;
        if (n <= 2) return 1;
        long []a = new long[n];
        a[0] = 1; a[1] = 1;
        for (int i = 2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        }

        return a[n-1];
    }

    private static long jump(int n){
        if (n <= 2) return n;
        long []a = new long[n];
        a[0] = 1;a[1] = 2;
        for (int i = 2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        }

        return a[n-1];
    }

    private static long jump2(int n){
        if (n <= 2) return n;
        long []a = new long[n];
        a[0] = 1; a[1] = 2;
        for (int i = 2; i < n; i++){
            for (int j = i; j >= 0; j--)
                a[i] += a[j];
            a[i] += 1;
        }

        return a[n-1];
    }
}
