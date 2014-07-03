


public class PathSum {
	
	
	
	public static void main(String[] args){
		PathSum s=new PathSum();
		
		int a[]={6,4,2,3,-1,-1,-1,-1,5,1,-1,-1,7,-1,-1};
		TreeNode t=s.precreate(a);
		boolean x=s.hasPathSum(t, 13);
		System.out.println(x);
	}
	int i=0;

	public TreeNode precreate(int a[]){
		if(a.length==i)return null;
		TreeNode t=null;
		if(a[i]!=-1){
			t=new TreeNode(a[i]);
			i++;
			t.left=precreate(a);
			t.right=precreate(a);
		}
		else i++;

		return t;
	}
	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;

    	preorder(root,sum,0);
    	return exist;
    }
    boolean exist=false;
    public void preorder(TreeNode root,int sum,int count){
    	if(exist)return;
    	if(root.left==null&&root.right==null){
    		count+=root.val;

    		if(sum==count){
    			exist=true;
    			return;
    		}else{
    			return;
    		}
    	}else{
    		count+=root.val;
    		if(root.left!=null)
    			preorder(root.left,sum, count);
    		if(root.right!=null)
    			preorder(root.right,sum, count);

    	}
    }
}
