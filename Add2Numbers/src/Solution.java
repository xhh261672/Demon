
  //Definition for singly-linked list.
  
 
public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	if(l1 == null || l2 == null){
		 		return (l1 == null ? l2 : l1);
		 	}
	        ListNode head = new ListNode(0);
	        ListNode result = head;
	        int inc = 0;
	        while (l1 != null && l2 !=null){
	        	int digit = l1.val + l2.val + inc;
	        	if (digit >= 10){
	        		digit -= 10;
	        		inc = 1;
	        	}
	        	else
	        		inc = 0;
	        	//System.out.println(digit);
	        	result.next= new ListNode(digit);
	        	l1 = l1.next;
	        	l2 = l2.next;
	        	result = result.next;
	        	
	        }
	        if (l1 == null && l2 == null){
	        	if (inc != 0){
	        		result.next = new ListNode(0);
	        		result.next.val = inc;
	        	}
	        	return head.next;
	        }else if (l1 == null){
	        	//System.out.println("l1 null");
	        	while (l2 != null){
	        		result.next = new ListNode((l2.val + inc)%10);
	        		inc = (l2.val + inc)/10;
	        		l2 = l2.next;
	        		result = result.next;
	        	}
	        		        	
	        }else if (l2 == null){	
	        	while (l1 != null){
	        		result.next = new ListNode((l1.val + inc)%10);
	        		inc = (l2.val + inc)/10;
	        		l1 = l1.next;
	        		result = result.next;
	        	}
	        }
	        if (inc != 0)
	        	result.next = new ListNode(inc);
	        
	        return head.next;
	 }
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if(l1 == null && l2 == null) {
//            return null;
//        }
//            
//        ListNode head = new ListNode(0);
//        ListNode point = head;
//        int carry = 0;
//        while(l1 != null && l2!=null){
//            int sum = carry + l1.val + l2.val;
//            point.next = new ListNode(sum % 10);
//            carry = sum / 10;
//            l1 = l1.next;
//            l2 = l2.next;
//            point = point.next;
//        }
//        
//        while(l1 != null) {
//            int sum =  carry + l1.val;
//            point.next = new ListNode(sum % 10);
//            carry = sum /10;
//            l1 = l1.next;
//            point = point.next;
//        }
//        
//        while(l2 != null) {
//            int sum =  carry + l2.val;
//            point.next = new ListNode(sum % 10);
//            carry = sum /10;
//            l2 = l2.next;
//            point = point.next;
//        }
//        
//        if (carry != 0) {
//            point.next = new ListNode(carry);
//        }
//        return head.next;
//    }
	 public static void main(String[] args){
		 Solution solution = new Solution();
		 ListNode l1 = new ListNode(1);
		 ListNode l2 = new ListNode(9);
		 l2.next = new ListNode(9);
		 ListNode result = solution.addTwoNumbers(l1, l2);
		 //while (result != null)
			 //System.out.print(result.val + "-");result = result.next;
	 }
}
