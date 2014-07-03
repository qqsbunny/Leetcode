import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class LevelOrder {
	public static void main(String[] args){
		int[] a={1,2};
		TreeNode t=CreteBinTree.levelcreate(a);
		LevelOrder l=new LevelOrder();
		List<List<Integer>> ll=l.levelOrderBottom(t);
		System.out.println(ll);
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
}
