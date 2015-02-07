/**
 * Created by Administrator on 2015/2/7.
 */
public class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null) return head;
        if (n == 0) return head;

        ListNode slow = head, fast = head;
        int len = 1;
        while (fast.next != null){
            len++;
            fast = fast.next;
        }
        int step = (len - n%len);
        for (int i = 1; i < step; i++)
            slow = slow.next;

        if (slow.next == null) return head;

        ListNode newhead = new ListNode(0);
        newhead.next = slow.next;
        slow.next = null;
        fast.next = head;
        return newhead.next;
    }
}
