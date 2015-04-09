import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2015/4/8.
 */
public class Main {
    private static Stack<Integer> s = new Stack<Integer>();
    private static Stack<Integer> t = new Stack<Integer>();

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            String order = sc.next();
            if (order.equals("PUSH")){
                push(sc.nextInt());
            }else{
                System.out.println(pop());
            }
        }
    }

    private static void push(int x){
        if (x < 0) return;
        s.push(x);
    }

    private static int pop(){
        if (t.isEmpty()){
            while (!s.isEmpty())
                t.push(s.pop());
        }
        if (t.isEmpty())
            return -1;
        else
            return t.pop();
    }
// my solution TLE::
    private static void Push(int x){
        if (x < 0) return;
        while (!s.isEmpty()){
            t.push(s.pop());
        }
        s.push(x);
        while (!t.isEmpty()){
            s.push(t.pop());
        }
    }

    private static int Pop(){
        if (s.isEmpty()) return -1;
        return s.pop();
    }
}
