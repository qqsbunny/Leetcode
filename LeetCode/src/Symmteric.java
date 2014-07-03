import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Symmteric {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	boolean symmetric=true;
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        Pre(root.left, root.right);
    	return symmetric;
    }
    public void Pre(TreeNode l,TreeNode r){
    	if(!symmetric)return;
    	if(r==null&&l==null)return;
    	if(r==null||l==null){
    		symmetric=false;
    		return;
    	}
    	if(r.val!=l.val){
    		symmetric=false;
    		return;
    	}
    	Pre(l.left,r.right);
    	Pre(l.right, r.left);
    }
}
