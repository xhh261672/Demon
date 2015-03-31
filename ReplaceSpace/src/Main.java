import java.util.Scanner;

/**
 * Created by Administrator on 2015/3/31.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ')
                sb.append("%20");
            else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
