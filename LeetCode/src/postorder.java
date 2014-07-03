import java.util.ArrayList;
import java.util.List;


public class postorder {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
		}
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> l=new ArrayList<>();
		post(root, l);
		return l;
	}
	public void post(TreeNode t,List<Integer> l){
		if(t==null)return;
		post(t.left,l);
		post(t.right,l);
		l.add(t.val);
	}
	
}
