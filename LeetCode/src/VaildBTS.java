import java.util.LinkedList;
import java.util.Queue;

import javax.xml.bind.ValidationEvent;
public class VaildBTS {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode precreate(int a[]){
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
	public static void main(String[] args){
		VaildBTS v=new VaildBTS();
		int a[]={3,1,5,0,2,4,6,-1,-1,-1,3};
		TreeNode t=v.precreate(a);
		boolean b=v.isValidBST(t);
		System.out.println(b);
	}
	
	boolean valid=true;
    public boolean isValidBST(TreeNode root) {
        if(!valid)return false;
        if(root==null)return valid;
        valid&=isValidBST(root.left);
        valid&=isValidBST(root.right);
        
        if(root.left!=null&&root.left.val>=root.val){
        		valid=false;
        		return valid;
        }
        if(root.right!=null&&root.right.val<=root.val){
        		valid=false;
        		return valid;
        }
        if(root.left!=null&&root.left.right!=null){
        	TreeNode r=root.left.right;
        	while(r.right!=null){
        		r=r.right;
        	}
        	if(r.val>=root.val){
        		valid=false;
        		return valid;
        	}
        }
        if(root.right!=null&&root.right.left!=null){
        	TreeNode l=root.right.left;
        	while(l.left!=null){
        		l=l.left;
        	}
        	if(l.val<=root.val){
        		valid=false;
        		return valid;
        	}
        }
        
    	return valid;
    }
    
    
}
