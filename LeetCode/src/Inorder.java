import java.util.ArrayList;
import java.util.List;


public class Inorder {
	
	public static void main(String[] args){
		int a[]={1,-1,2,3};
		TreeNode lx=CreteBinTree.levelcreate(a);
		Inorder i=new Inorder();
		List<Integer> ll=i.inorderTraversal(lx);
		System.out.println(ll);
		CreteBinTree.printBinTree(lx);
	}
    public List<Integer> inorderTraversal(TreeNode root) {
    	l=new ArrayList<>();
    	inorder(root);
        return l;
    }
    List<Integer> l;
    public void inorder(TreeNode root){
    	if(root==null)return ;
    	inorder(root.left);
    	l.add(root.val);
    	inorder(root.right);
    }
}
