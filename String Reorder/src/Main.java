import java.util.*;

/**
 * Created by Administrator on 2015/3/31.
 */
public class Main {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            Map<Character, Integer> map = Collections.synchronizedMap(new TreeMap<Character, Integer>());
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
            StringBuffer sb = new StringBuffer();
            while (sb.length() != s.length()){
                Set<Character> set = map.keySet();
                Iterator<Character> iterator = set.iterator();
                while (iterator.hasNext()){
                    Character key = iterator.next();
                    Integer num = map.get(key);
                    if (num > 0){
                        sb.append(key);
                        map.put(key, --num);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
