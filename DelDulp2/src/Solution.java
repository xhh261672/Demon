/**
 * Created by Administrator on 2015/1/15.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode cur = new ListNode(0);
        cur.next = head;
        head = cur;
        ListNode pre = head;
        cur = cur.next;
        boolean isdup = false;
        //System.out.println(head.next.val);
        while (cur != null && cur.next != null){

           while (cur != null && cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
                isdup = true;
           }
           if (isdup){
               cur = cur.next;
               pre.next = cur;
               //pre = pre.next;
               isdup = false;
           }else{
               pre.next = cur;
               cur = cur.next;
               pre = pre.next;
           }
           //System.out.println(head.next.val);
        }
        return head.next;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head = solution.deleteDuplicates(head);
        System.out.println(head.val);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
