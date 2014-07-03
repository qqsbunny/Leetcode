import java.util.List;
public class SunPath {
	
	public static void main(String[] args){
		SunPath s=new SunPath();
		int a[]={6,4,2,3,-1,-1,-1,-1,5,1,-1,-1,7,-1,-1};
		TreeNode t=s.precreate(a);
		s.sumNumbers(t);
		System.out.println(s.total);
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
    public void sumNumbers(TreeNode root) {
        
    	post(root, 0);
    }
    int total;
	public void post(TreeNode t,int n){
		if(t.left==null&&t.right==null){
			n=n*10+t.val;
			total+=n;
			return;
		}
		n=n*10+t.val;
		if(t.left!=null)
			post(t.left,n);
		if(t.right!=null)
			post(t.right,n);
		
	}
}
