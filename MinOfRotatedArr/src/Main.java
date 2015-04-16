import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/14.
 */
public class Main {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int []arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int m = find2(arr);
            if (m >= 0)
                System.out.println(arr[m]);
        }
    }

    private static int find(int[] arr){
        int l = 0, r = arr.length-1;
        int m = l + ((r-l)>>1);
        while (l < r){
//                System.out.println(l+ " "+ m+" "+ r);
            if (arr[m] >= arr[l] && arr[r] < arr[m])
                l = m+1;
            else
                r = m;
            m = l+((r-l)>>1);
        }
        return m;
    }

    private static int find2(int []arr){
        int l = 0, r = arr.length-1;
        int m = 0;
        while (arr[l] >= arr[r] && l < r){

            if (l == r-1){
                m = r;break;
            }
            m = l+((r-l)>>1);
            if (arr[l] == arr[m] && arr[m] == arr[r]){
                for (int i = l+1; i <= r; i++){
                    if (arr[i] < arr[i-1]) return i;
                }
            }
            if (arr[m] >= arr[l])
                l = m;
            else if (arr[m] < arr[r])
                r = m;
        }
        return m;
    }
}
