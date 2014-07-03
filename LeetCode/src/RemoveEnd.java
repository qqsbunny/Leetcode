
public class RemoveEnd {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
			}
		}
		public static void main(String[] args){
			RemoveEnd r=new RemoveEnd();
			
		}
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        int total=0;
	        ListNode p=head;
	        while(p!=null){
	        	total++;
	        	p=p.next;
	        }
	        int x=total-n;
	        if(x==0)return head.next;
	        p=head;
	        while(x--!=1){
	        	p=p.next;
	        }
	        p.next=p.next.next;
	        
	        
			return head;
	    }
}
