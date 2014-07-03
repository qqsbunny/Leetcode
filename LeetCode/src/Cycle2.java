import java.util.HashSet;
import java.util.LinkedHashSet;

public class Cycle2 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	 }
    public ListNode detectCycle(ListNode head) {
    	
    	HashSet<ListNode> h=new LinkedHashSet<ListNode>();
    	while(!h.contains(head)&&head!=null){
    		h.add(head);
    		head=head.next;
    	}
    	return head;
    }
}
