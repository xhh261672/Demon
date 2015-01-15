/**
 * Created by Administrator on 2015/1/15.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode host = cur;
        boolean ischange = false;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                ischange = true;
                cur.next = cur.next.next;
                cur = cur.next;
            } else {
                ischange = false;
                host.next = cur;
                host = host.next;
                cur = cur.next;
            }
            if (ischange){

            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
