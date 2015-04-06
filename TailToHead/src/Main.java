import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/6.
 */
public class Main {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        ListNode end = new ListNode(-1);
        ListNode cur = new ListNode(0);
        cur.next = end;
        while (sc.hasNext()){
            int val = sc.nextInt();
            if (val ==  -1)
                break;
            else if (val > 0){
                cur.val = val;
                ListNode temp  = new ListNode(0);
                temp.next = cur;
                cur = temp;
            }
        }
        cur = cur.next;
        while (cur.val != -1){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
