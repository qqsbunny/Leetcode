
public class LinkedListCycle {
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	    public boolean hasCycle(ListNode head) {
            if(head!=null&&head.next!=null&&head.next.next==head)return true;

	        ListNode slow=head,fast=head;
	        while(true){
	        	if(fast==null||fast.next==null||fast.next.next==null)return false;
	        	if(fast==slow&&fast!=head)return true;
	        	fast=fast.next.next;
	        	slow=slow.next;
	        }
	        
	    }
}
