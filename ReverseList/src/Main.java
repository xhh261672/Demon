import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/30.
 */
public class Main {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n == 0){
                System.out.println("NULL");
                continue;
            }
            ListNode head = new ListNode(0);
            ListNode cur = head;
            for(int i = 0; i < n; i++){
                cur.next = new ListNode(sc.nextInt());
                cur = cur.next;
            }
            if (n == 1){
                System.out.println(head.next.val);
                continue;
            }
            ListNode prev = head.next, next = head.next.next;
            prev.next = null;
            while (next.next != null){
                ListNode temp = next.next;
                next.next = prev;
                prev = next;
                next = temp;
            }
            next.next = prev;
            while (next != null){
                if (next.next == null)
                    System.out.print(next.val);
                else System.out.print(next.val + " ");
                next = next.next;
            }
            System.out.print('\n');
        }
    }
}
