


public class SumMaxPath {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public void sumNumbers(TreeNode root) {
        
    	post(root, 0);
    }
    int max1,max2;
	public void post(TreeNode t,int n){
		if(t.left==null&&t.right==null){
			n=n*10+t.val;
			if(n>max1)max1=0;
			return;
		}
		n=n*10+t.val;
		if(t.left!=null)
			post(t.left,n);
		if(t.right!=null)
			post(t.right,n);
		
	}
}
