import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2015/4/2.
 */
public class GenRandom {
    private int count = 0;
    private Map<Integer, Object> map = new HashMap<Integer, Object>();
    public void genran(){
        int count = 0;
        boolean f = false;

        Random random = new Random();
        int temp;
        while (count < 900){
            temp = random.nextInt(1000)+1;
            if (map.get(temp) == null){
                System.out.print(temp+" ");
                map.put(temp, temp);
                count++;
            }
        }
    }

    public static  void main (String []args){
        GenRandom gen = new GenRandom();
        gen.genran();
    }
}
