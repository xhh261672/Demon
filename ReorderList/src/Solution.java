/**
 * Created by Administrator on 2015/3/25.
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            if (fast == null)
                break;
            slow = slow.next;
        }

        ListNode end = slow;
        slow = slow.next;
        end.next = null;

        //reverse second half
        ListNode cur = slow;
        ListNode next = slow.next;
        slow.next = null;

        while (next != null){
            ListNode temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        slow = cur;
        ListNode temp1, temp2;
        while (slow != null){
            temp1 = head.next;
            temp2 = slow.next;
            slow.next = head.next;
            head.next = slow;
            head = temp1;
            slow = temp2;
        }

    }
}
