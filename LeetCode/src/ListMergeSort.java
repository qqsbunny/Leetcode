public class ListMergeSort {
	public static void main(String[] args){
		int x[]={9,7,5,3,1,8,6,4,2,0};
		ListMergeSort is=new ListMergeSort();
		ListNode head=is.new ListNode(x[0]),tmp=head;
		for(int i=1;i<x.length;i++){
			tmp.next=is.new ListNode(x[i]);
			tmp=tmp.next;
		}
		Print(head);
		head=is.sortList(head);
		Print(head);
	}
	public  class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		val = x;
		next = null;
		}
	}
    public ListNode sortList(ListNode head) {
    	if(head==null||head.next==null)return head;
    	ListNode a=head,b=head;
    	while(b.next!=null&&b.next.next!=null){
    		a=a.next;
    		b=b.next.next;
    	}
    	b=a.next;
    	a.next=null;
    	ListNode c,d,e=new ListNode(0),p;
    	p=e;
    	c=sortList(head);
    	d=sortList(b);
    	while(c!=null&&d!=null){
    		if(c.val<d.val){
    			p.next=c;
    			c=c.next;
    		}else{
    			p.next=d;
    			d=d.next;
    		}
    		p=p.next;
    	}
    	if(d==null){
    		p.next=c;
    	}
    	if(c==null){
    		p.next=d;
    	}
    	
    	return e.next;
    	
    	
        
    }
	public static void Print(ListNode q){
		ListNode p=q;
		while(p!=null){
			System.out.print(p.val+" ");
			p=p.next;
		}
		System.out.println();
	}

}
