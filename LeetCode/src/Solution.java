
public class Solution {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode template = null,result=null;
        result=template;
        if(l1!=null&&l2!=null){
        	if(l1.val>l2.val){
        		template=l1;
        		l1=l1.next;
        	}
        	else{
        		template=l2;
        		l2=l2.next;
        	}
        }
        while(true){
        	if(l1==null){
        		template.next=l2;
        		break;
        	}
        	if(l2==null){
        		template.next=l1;
        		break;
        	}
        	if(l1.val>l2.val){
        		template.next=l1;
        		l1=l1.next;
        	}else{
        		template.next=l2;
        		l2=l2.next;
        	}
        }
        
		return result;
        
        
    }
}