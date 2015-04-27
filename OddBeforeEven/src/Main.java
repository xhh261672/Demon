import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/26.
 */
public class Main {
    public static void main1 (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++){
                if (a[i] % 2 == 1){
                    count++;
                    if (count < n)
                        System.out.print(a[i]+" ");
                    else
                        System.out.print(a[i]);
                }
            }
            for (int i = 0; i < n; i++){
                if (a[i] % 2 == 0){
                    count++;
                    if (count < n)
                        System.out.print(a[i]+" ");
                    else
                        System.out.print(a[i]);
                }
            }
            System.out.print('\n');
        }
    }

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int temp  = 0, i = 0, j = 0;
            while (i < n && j < n){
                System.out.println(i + " " + j);
                while (i < n && (a[i] & 1) == 0){
                    i++;
                }

                if (i == n) break;

                while (j < n && (a[j] & 1) == 1)
                    j++;

                //后移
                if (i > j){
                    temp = a[i];
                    int t = i;
                    for (; i > j; i--){
                        a[i] = a[i-1];
                    }
                    a[j] = temp;

                    i = t + 1;
                    j++;
                }else{
                    i++;
                }

            }

            for (int k = 0; k <n;k++){
                if (k != n-1)
                    System.out.print(a[k] + " ");
                else
                    System.out.print(a[k]);
            }
            System.out.print('\n');
        }
    }
}
