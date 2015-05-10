import java.util.*;

/**
 * Created by Administrator on 2015/5/9.
 */
public class StringSort {
    public static void main (String []args){
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.equals("")){
                break;
            }
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
    }
}
