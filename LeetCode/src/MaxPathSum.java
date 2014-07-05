
public class MaxPathSum {
	public static void main(String [] args){
		int a[]={-2,1};
		TreeNode root=CreteBinTree.levelcreate(a);
		MaxPathSum m=new MaxPathSum();
		int max=m.maxPathSum(root);
		System.out.println(max);
	}
	int max;
    public int maxPathSum(TreeNode root) {
    	if(root.left==null&&root.right==null)return root.val; 
    	max=root.val;
    	post(root);
    	return max;
        
    }
    public int post(TreeNode root){
        if(root==null)return 0;
    	if(root.left==null&&root.right==null){
    		max=max>root.val?max:root.val;
    		return root.val>0?root.val:0; 
    	}
        int left=post(root.left);
        int right=post(root.right);
        left=left>0?left:0;
        right=right>0?right:0;
        if(max<left+right+root.val)max=left+right+root.val;
        return left>right?left+root.val:right+root.val;
    }
}
