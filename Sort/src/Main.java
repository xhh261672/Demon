import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/4.
 */
public class Main {
    public  static void main (String []args){
        Scanner scanner  = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int []a = new int[n];
            int i = 0;
            while (i < n)
                a[i++] = scanner.nextInt();

            sort(a, 0, n-1);
            for (int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.print('\n');
        }
    }
    private static void sort(int []a, int left, int right){
        if (left >= right) return;
//        for (int j = 0; j < a.length; j++){
//            System.out.print(a[j] + " ");
//        }
//        System.out.print('\n');
        int i = left, j = right+1;
        int piv = a[left];
        while (i < j){
            do i++; while (i < right && a[i] < piv);
            do j--; while (a[j] > piv);
            if (i < j){
                int t = a[i];a[i] = a[j];a[j] = t;
            }
        }
        int t = a[left]; a[left] = a[j]; a[j] = t;
        sort(a, left, j-1);
        sort(a, j+1, right);
    }
}
