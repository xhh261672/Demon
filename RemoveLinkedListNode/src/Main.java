import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/29.
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
            int k = sc.nextInt();

            ListNode head = new ListNode(0);
            ListNode cur = head;

            for (int i = 0; i < n; i++){
                cur.next = new ListNode(sc.nextInt());
                cur = cur.next;
            }
            if (k > n){
                System.out.println("NULL");
            }else{
                getLastK(head, k);
            }
        }
    }

    private static void getLastK(ListNode head, int k){
        if (k == 0){
            System.out.println("NULL");
            return;
        }
        ListNode slow = head.next, fast = head.next;
        for (int j = 0; j < k-1; j++)
            fast = fast.next;
//            System.out.println(fast.val);
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.val);
    }

}

