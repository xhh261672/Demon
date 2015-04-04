import java.util.*;

/**
 * Created by Administrator on 2015/4/3.
 */
public class Main{
    public static void main (String []args){
        Scanner scanner  = new Scanner(System.in);

        while (scanner.hasNextLine()){
            int []a = new int[3];
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            a[0] = x; a[1] = y; a[2] = z;
            Arrays.sort(a);
                String s = scanner.next();
                int R = 0;
                int Y = 0;
                int B = 0;
                int l = s.length();
                int count = 0;
                int max = 0;
                for (int i = 0; i < l; i++){

                    if (s.charAt(i) == 'R')
                        R++;
                    if (s.charAt(i) == 'Y')
                        Y++;
                    if (s.charAt(i) == 'B')
                        B++;
                    count++;
                    if (count > max) max = count;
                    int []b = new int[3];
                    b[0] = Math.abs(R-Y); b[1] = Math.abs(R-B);b[2] = Math.abs(B-Y);
                    Arrays.sort(b);
                    if (b[0] == a[0] && b[1] == a[1] && b[2] == a[2]){
                        count = 0;
                    }
                }
                System.out.println(max);
            }
        }
}

