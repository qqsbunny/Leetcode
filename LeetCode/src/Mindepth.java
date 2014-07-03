

public class Mindepth {
	public static void main(String[] args){
		Mindepth s=new Mindepth();
		
		int a[]={1,2,-1};
		TreeNode t=s.precreate(a);
		int x=s.minDepth(t);
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
	
	
    int min=65535;
	public int minDepth(TreeNode root) {
	    if(root==null)return 0;
	    if(root.left==null&&root.right==null)return 1;
		recursive(root, 0);	
		return min;
	}
	public void recursive(TreeNode root,int count){
		count++;
			if(root.left==null&&root.right==null){
				if(count<min)min=count;
				return;
			}
			if(root.left!=null){
				recursive(root.left,count);

			}
			if(root.right!=null){
				recursive(root.right,count);

			}

	}
}
