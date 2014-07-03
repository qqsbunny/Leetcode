import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class LRUCache {
	public static void main(String[] args){
		LRUCache l=new LRUCache(2);
//		l.set(2, 1);
//		l.set(1, 1);
//			
//		System.out.println(l.get(2));
//		l.set(4, 1);
//		System.out.println(l.get(1));
//		System.out.println(l.get(2));
//		l.set(2, 1);
//		l.set(1,1);
//		l.set(2, 3);
//		l.set(4, 1);
//		
		System.out.println(l.get(2));
		l.set(2, 6);
		
		System.out.println(l.get(1));
		l.set(1, 5);
		l.set(1, 2);
		System.out.println(l.get(1));
		System.out.println(l.get(2));
	}
	class Node{
		Node pre;
		Node next;
		int val,key;
		public Node(int val,int key){
			pre=null;
			next=null;
			this.key=key;
			this.val=val;
		}
	}
	HashMap<Integer, Node> h=new HashMap<Integer, Node>();
	
	int capacity;
	int c;
	Node head,end;
    public LRUCache(int capacity) {
    	this.capacity=capacity;
    	c=0;
    	head=new Node(0,0);
    	end=new Node(0,0);
    	head.next=end;
    	end.pre=head;
    }
    public int get(int key) {
    	Node n=h.get(key);
    	if(n!=null){
    		n.pre.next=n.next;
    		n.next.pre=n.pre;
    		n.next=head.next;
    		head.next=n;
    		n.next.pre=n;
    		n.pre=head;
    		
    		return n.val;
    	}else {
    		return -1;
    	}
    }
    public void set(int key, int value) {
    	if(h.get(key)!=null){
    		Node n=h.get(key);
    		n.val=value;
    		get(key);
    		return;
    	}
    	if(c<capacity){
    		Node n=new Node(value,key);
    		head.next.pre=n;
    		n.next=head.next;
    		n.pre=head;
    		head.next=n;
    		
    		h.put(key, n);
    		c++;
    	}else{
    		Node n=end.pre;
    		n.pre.next=end;
    		end.pre=n.pre;
    		h.remove(n.key);
    		c--;
    		set(key, value);
    	}
    }
	/*
	int capacity;
	HashMap<Integer, Integer> t;
	Queue<Integer> q=new LinkedList<>();
    public LRUCache(int capacity) {
    	this.capacity=capacity;
    	t=new HashMap<Integer,Integer>(); 
    
    }
    
    public int get(int key) {
    	if(t.get(key)==null)return -1;
    	q.remove(key);
    	q.offer(key);
    	return t.get(key);
    }
    
    public void set(int key, int value) {
    	if(t.size()<capacity){
    		t.put(key, value);
    		q.offer(key);
    	}else{
    		t.remove(q.poll());
    		set(key, value);
    		
    		
    	}
    }
    */
}
