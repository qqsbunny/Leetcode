
public class CopyListwithRandomPointer {
	public static void main(String[] args){
		CopyListwithRandomPointer c=new CopyListwithRandomPointer();
		RandomListNode ra=c.new RandomListNode(0);
		RandomListNode rb=c.new RandomListNode(1);
		RandomListNode rc=c.new RandomListNode(2);
		RandomListNode rd=c.new RandomListNode(3);
		RandomListNode re=c.new RandomListNode(4);
		ra.next=rb;
		rb.next=rc;
		rc.next=rd;
		rd.next=re;
		ra.random=rc;
		rb.random=ra;
		rc.random=re;
		rd.random=re;
		RandomListNode r=c.copyRandomList(ra);
		System.out.println();
	}
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	};
	 
	    public RandomListNode copyRandomList(RandomListNode head) {
			if(head==null)return null;
	    	RandomListNode tmp,q=head,newh;
			while(q!=null){
				tmp=q.next;
				q.next=new RandomListNode(q.label);
				q.next.next=tmp;
				q=tmp;
			}
			q=head;
			while(q!=null){
				if(q.random!=null)q.next.random=q.random.next;
				else q.next.random=null;
				q=q.next.next;
			}
			q=head;
			newh=head.next;
			while(q!=null){
				tmp=q.next;
				q.next=tmp.next;
				if(tmp.next!=null)tmp.next=tmp.next.next;
				q=q.next;
			}
			return newh;
	    }
}
