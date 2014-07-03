import java.util.ArrayList;
import java.util.List;





public class PathSum2 {
	public static void main(String[] args){
		PathSum2 s=new PathSum2();
		
		int a[]={6,4,2,3,-1,-1,-1,-1,5,1,-1,-1,7,-1,-1};
		TreeNode t=s.precreate(a);
		List<List<Integer>> x=s.pathSum(t, 18);
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ll=new ArrayList<List<Integer>>();
        if(root==null)return ll;
        preorder(root, sum, 0, new ArrayList<Integer>());
        return ll;
    }
    List<List<Integer>> ll;
    public void preorder(TreeNode root,int sum,int count,List<Integer> l){
    	if(root.left==null&&root.right==null){
    		l.add(root.val);
    		count+=root.val;

    		if(sum==count){
    			List<Integer> x=new ArrayList<Integer>(l);
    			ll.add(x);
    			l.remove(l.size()-1);
    			return;
    		}else{
    			l.remove(l.size()-1);
    			return;
    		}
    	}else{
    		count+=root.val;
    		l.add(root.val);
    		if(root.left!=null){
    			preorder(root.left,sum, count,l);

    		}
    		if(root.right!=null){
    			preorder(root.right,sum, count,l);
    		}
			l.remove(l.size()-1);

    	}
    }
}
