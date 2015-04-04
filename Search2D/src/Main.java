import java.util.Scanner;

/**
 * Created by Administrator on 2015/3/31.
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            if (m == 0 || n == 0) return;
            int [][]a = new int[m][n];
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n;j++){
                    a[i][j] = scanner.nextInt();
                }
            }

            int l = 0, r = m*n-1;
            while (l <= r){
                int mid = l + (r-l)/2;
                int i = mid/n, j = mid%n;
                if (a[i][j] == t){
                    System.out.println("Yes");
                    return;
                }
                else if (t < a[i][j]) r = mid - 1;
                else l = mid + 1;
            }
            System.out.println("No");
        }
    }
}
