import java.util.LinkedList;
import java.util.Queue;



public class RandomListCopy {
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	}
	public RandomListNode copyRandomList(RandomListNode head) {
		RandomListNode r=new RandomListNode(0),p=r,h=head;
		Queue<RandomListNode> q=new LinkedList<RandomListNode>();
		while(h!=null){
			p.next=new RandomListNode(h.label);
			q.offer(h.random);
			p=p.next;
			h=h.next;
		}
		p=r.next;
		while(p!=null){
			p.random=q.poll();
		}
		
		
		return r.next;
	}
}
