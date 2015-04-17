import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/17.
 */
public class Main {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc.nextInt();
            for (int i = 0; i < t;  i++){
                int n = sc.nextInt();
                int count = 0;
                int flag = 1;
                while (flag != 0){
                    //输入负数会死循环 因为负数右移最高位补1
//                    if ((n&1) == 1) count++;
//                    n >>= 1;
                    if ((n & flag) != 0) count++;
                    flag <<= 1;
                }
                System.out.println(count);
            }
        }
    }
}
