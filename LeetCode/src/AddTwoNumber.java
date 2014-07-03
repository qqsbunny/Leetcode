import org.w3c.dom.NodeList;


public class AddTwoNumber {
	public static void main(String[] args){
		AddTwoNumber a=new AddTwoNumber();
		ListNode x=a.new ListNode(1);
		ListNode y=a.new ListNode(9);
		y.next=a.new ListNode(9);
		ListNode r=a.addTwoNumbers(x, y);
		System.out.println(r.val);
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
		
	 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode l=new ListNode(0),p=l;
    	int carry=0;
    	int v1,v2;
    	while(l1!=null||l2!=null){
    		v1=l1==null?0:l1.val;
    		v2=l2==null?0:l2.val;
    		if((v1+v2+carry)>=10){
    			p.next=new ListNode(v1+v2+carry-10);
    			carry=1;
    		}else{
    			p.next=new ListNode(v1+v2+carry);
    			carry=0;
    		}
    		p=p.next;
    		l1=l1==null?l1:l1.next;
    		l2=l2==null?l2:l2.next;
    	}
    	if(l1==null&&l2==null&&carry!=0){
    		p.next=new ListNode(0);
        	p.next.val+=carry;

    	}
    	return l.next;
    }
}
