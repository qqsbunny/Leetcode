import java.util.ArrayList;

public class FlattenBTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public void flatten(TreeNode root) {
        ArrayList<TreeNode> a=new ArrayList<TreeNode>();
        preorder(root, a);
        for(int i=0;i<a.size()-1;i++){
        	a.get(i).left=null;
        	a.get(i).right=a.get(i+1);
        }
    }
	public void preorder(TreeNode t,ArrayList<TreeNode> a){
		if(t==null)return;
		a.add(t);
		preorder(t.left, a);
		preorder(t.right, a);
	}
}
