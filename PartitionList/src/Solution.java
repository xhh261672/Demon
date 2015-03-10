/**
 * Created by Administrator on 2015/2/15.
 */
public class Solution {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
             val = x;
             next = null;
          }
    }
    public ListNode partition(ListNode head, int x) {
         if (head == null || head.next == null) return head;
        ListNode head2 = new ListNode(0);
        head2.next = head;
         ListNode cur = head2, finder = head2;
         while (cur.next != null && finder.next != null){
            if (cur.next.val >= x) break;
            cur = cur.next;
            finder = finder.next;
         }

        finder = finder.next;
        while (finder != null && finder.next != null){
            if (finder.next.val < x){

                ListNode move = finder.next;
                finder.next = finder.next.next;
                move.next = cur.next;
                cur.next = move;
                cur = cur.next;
            }else
                finder = finder.next;
        }

        return head2.next;
    }
}
