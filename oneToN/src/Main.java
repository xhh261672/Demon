import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/26.
 */
public class Main {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++){
                sb.append('0');
            }
            int carry = 0;
            boolean over = false;
            while(!over){
                for (int i = n-1; i >= 0; i--){
                    int nextVal = Character.getNumericValue(sb.charAt(i)) + carry;
                    if (i == n-1) nextVal += 1;
                    if (nextVal >= 10){
                        if (i == 0) over = true;
                        else{
                            nextVal -= 10;
                            carry = 1;
                            sb.setCharAt(i, Character.forDigit(nextVal, 10));
                        }

                    }else{
                        carry = 0;
                        sb.setCharAt(i, Character.forDigit(nextVal, 10));
                        break;
                    }
                }
                if (!over)
                    print(sb);
            }
        }
    }

    private static void print(StringBuffer sb){
        int n = sb.length();
        boolean isStart  = false;
        for (int i = 0; i < n; i++){
            if ( (!isStart) && sb.charAt(i) == '0') continue;
            if (sb.charAt(i) != '0') isStart = true;
            System.out.print(sb.charAt(i));
        }
        System.out.print('\n');
    }
}
