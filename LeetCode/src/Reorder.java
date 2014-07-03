import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import org.w3c.dom.NodeList;


public class Reorder {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	 }
	public static void main(String[] args){
		Reorder r=new Reorder();
		ListNode x=r.new ListNode(1);
		x.next=r.new ListNode(2);
		x.next.next=r.new ListNode(3);
		x.next.next.next=r.new ListNode(4);

		r.reorderList(x);
		System.out.println(x.val);
	}
    public void reorderList(ListNode head) {
    	if(head==null)return ;
    	ListNode a=head,b=head;
    	while(b.next!=null&&b.next.next!=null){
    		a=a.next;
    		b=b.next.next;
    	}
    	b=a.next;
    	a.next=null;
    	a=head;
    	Stack<ListNode> s=new Stack<ListNode>();
    	while(b!=null){
    		s.push(b);
    		b=b.next;
    	}
    	ListNode tmp;
    	while(a!=null){
    		tmp=a.next;
    		if(s.empty())break;
    		a.next=s.pop();
    		a=a.next;
    		a.next=tmp;
    		a=a.next;
    		
    		
    	}
    }
	/*
    public void reorderList(ListNode head) {
    	if(head==null)return ;
    	Vector<ListNode> v=new Vector<>();
    	while(head!=null){
    		v.addElement(head);
    		head=head.next;
    	}
    	ListNode start,end,p=new ListNode(0);
    	while(true){
    		if(v.size()==0)break;
    		start=v.firstElement();
    		p.next=start;
    		p=p.next;
    		v.remove(start);
    		if(v.size()==0)break;
    		end=v.lastElement();
   			p.next=end;
   			p=p.next;
   			v.remove(end);
    	}
    	head=p.next;
    	
    	
   
    }
    */
}
