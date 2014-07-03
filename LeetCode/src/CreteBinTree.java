import java.util.LinkedList;
import java.util.Queue;



public class CreteBinTree {
	public static TreeNode levelcreate(int a[]){
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		TreeNode head=new TreeNode(a[0]),left = null,right = null;
		q.add(head);
		for(int i=1;i<a.length;){
			left=null;
			right=null;
			if(a[i]!=-1){
				left=new TreeNode(a[i]);
				q.peek().left=left;
			}
			i++;
			if(i==a.length)break;
			if(a[i]!=-1){
				right=new TreeNode(a[i]);
				q.peek().right=right;
			}
			i++;

			q.poll();
			if(left!=null)q.add(left);
			if(right!=null)q.add(right);

		}
		
		return head;
	}
	public static void printBinTree(TreeNode t){
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(t);
		TreeNode tmp;
		TreeNode nullNode=new TreeNode(-1);
		while(!q.isEmpty()){
			tmp=q.poll();
			if(tmp.val!=-1)
				System.out.print(" "+tmp.val);
			else {
				System.out.print(" #");
				continue;
			}
				
			if(tmp.left!=null)
				q.offer(tmp.left);
			else
				q.offer(nullNode);
			
			if(tmp.right!=null)
				q.offer(tmp.right);
			else 
				q.offer(nullNode);
		}
		System.out.println();
	}
}
