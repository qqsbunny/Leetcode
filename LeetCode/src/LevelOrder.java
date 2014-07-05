import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class LevelOrder {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		TreeNode t=CreteBinTree.levelcreate(a);
		CreteBinTree.print_morris_inorder(t);
		LevelOrder l=new LevelOrder();
		List<List<Integer>> ll=l.levelOrder(t);
		List<List<Integer>> ll2=l.levelOrderBottom(t);
		System.out.println(ll);
		System.out.println(ll2);

	}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll=new  ArrayList<List<Integer>>();
        if(root==null)return ll;

    	Queue<TreeNode> q1=new LinkedList<TreeNode>();
    	Queue<TreeNode> q2=new LinkedList<TreeNode>();
        q1.offer(root);
        while(!q1.isEmpty()){
        	while(!q1.isEmpty())q2.offer(q1.poll());
        	List<Integer> l=new ArrayList<Integer>();
        	TreeNode tmp;
        	while(!q2.isEmpty()){
        		tmp=q2.poll();
        		if(tmp.left!=null)q1.offer(tmp.left);
        		if(tmp.right!=null)q1.offer(tmp.right);
        		l.add(tmp.val);
        	}
        	ll.add(l);
        }
      //   Collections.reverse(ll);
    	return ll;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll=new  ArrayList<List<Integer>>();
        if(root==null)return ll;

    	Queue<TreeNode> q1=new LinkedList<TreeNode>();
    	Queue<TreeNode> q2=new LinkedList<TreeNode>();
        q1.offer(root);
        while(!q1.isEmpty()){
        	while(!q1.isEmpty())q2.offer(q1.poll());
        	List<Integer> l=new ArrayList<Integer>();
        	TreeNode tmp;
        	while(!q2.isEmpty()){
        		tmp=q2.poll();
        		if(tmp.left!=null)q1.offer(tmp.left);
        		if(tmp.right!=null)q1.offer(tmp.right);
        		l.add(tmp.val);
        	}
        	ll.add(l);
        }
        Collections.reverse(ll);
    	return ll;
    }
    public List<List<Integer>>  zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll=new  ArrayList<List<Integer>>();
        if(root==null)return ll;

    	Queue<TreeNode> q1=new LinkedList<TreeNode>();
    	Queue<TreeNode> q2=new LinkedList<TreeNode>();
        q1.offer(root);
        while(!q1.isEmpty()){
        	while(!q1.isEmpty())q2.offer(q1.poll());
        	List<Integer> l=new ArrayList<Integer>();
        	TreeNode tmp;
        	while(!q2.isEmpty()){
        		tmp=q2.poll();
        		if(tmp.left!=null)q1.offer(tmp.left);
        		if(tmp.right!=null)q1.offer(tmp.right);
        		l.add(tmp.val);
        	}
        	ll.add(l);
        }
        boolean t=false;
        for(List<Integer> l:ll){
        	if(t)Collections.reverse(l);
        	t=!t;
        }
    	return ll;
    }
    public class TreeLinkNode {
    	int val;
    	TreeLinkNode left, right, next;
    	TreeLinkNode(int x) { val = x; }
    }
    
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q1=new LinkedList<TreeLinkNode>();
        Queue<TreeLinkNode> q2=new LinkedList<TreeLinkNode>();
        if(root==null)return;
        q1.offer(root);
        root.next=null;
        while(!q1.isEmpty()){
        	while(!q1.isEmpty())q2.offer(q1.poll());
        	TreeLinkNode tmp=null;
        	while(!q2.isEmpty()){
        		if(tmp!=null){
        			tmp.next=q2.peek();
        		}
        		tmp=q2.poll();
        		if(tmp.left!=null)q1.offer(tmp.left);
        		if(tmp.right!=null)q1.offer(tmp.right);
        		
        	}
        
        

        }
    }
    
    
}
