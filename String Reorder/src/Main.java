import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/3/31.
 */
public class Main {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++){
                if (Character.isLetterOrDigit(s.charAt(i))){
                    if (map.get(s.charAt(i))==null){
                        map.put(s.charAt(i), 1);
                    }else{
                        int count = map.get(s.charAt(i));
                        map.put(s.charAt(i), ++count);
                    }
                }else{
                    System.out.println("<invalid input string>");
                    break;
                }
            }
        }
    }
}
