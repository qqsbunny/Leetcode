
public class RemoveDuplicatedfromSortedList {
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	    	if(head==null)return null;
	    	ListNode temp=head;
	    	while(temp.next!=null){
	    		if(temp.val==temp.next.val){
	    			temp.next=temp.next.next;
	    			
	    		}else{
	    			temp=temp.next;
	    		}
	    	}
	    	
			return head;
	        
	    }
	}
}
