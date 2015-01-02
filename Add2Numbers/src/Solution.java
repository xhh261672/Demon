
  //Definition for singly-linked list.
  
 
public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	if(l1 == null || l2 == null){
		 		return (l1 == null ? l2 : l1);
		 	}
	        ListNode result = new ListNode(0);
	        ListNode head = result;
	        int inc = 0;
	        while (l1 != null && l2 !=null){
	        	int digit = l1.val + l2.val + inc;
	        	if (digit >= 10){
	        		digit -= 10;
	        		inc = 1;
	        	}
	        	else
	        		inc = 0;
	        	result.val = digit;
	        	
	        	l1 = l1.next;
	        	l2 = l2.next;
	        	
	        	result.next = new ListNode(0);
	        	result = result.next;
	        }
	        if (l1 == null && l2 == null){
	        	result = null;
	        	return head;
	        }else if (l1 == null){
	        	result = l2;
	        	result.val = l2.val + inc;
	        }else if (l2 == null){	
	        	result = l1;
	        	result.val = l1.val + inc;
	        }
	        
	        return head;
	 }
}
