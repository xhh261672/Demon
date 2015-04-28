
/**
 * Created by Administrator on 2015/4/28.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode pre = newhead, cur = newhead.next;
        while (cur != null){
            if (cur.val == val){
                cur = cur.next;
                pre.next = cur;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }
        return newhead.next;
    }
}
