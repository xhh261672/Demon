
/**
 * Created by Administrator on 2015/5/20.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(0);
        ListNode cur = head, nex = head.next;
        cur.next = null;
        while (nex != null){
            ListNode t = nex.next;
            nex.next = cur;
            cur = nex;
            nex = t;
        }
        newHead.next = cur;
        return newHead.next;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode rhead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return rhead;
    }

//    private ListNode reverse(ListNode cur, ListNode nex){
//        if (nex == null) return cur;
//        ListNode t = nex.next;
//        nex.next = cur;
//        return reverse(nex, t);
//    }

    public static void main (String []args){
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        solution.reverseList2(head);
    }
}
