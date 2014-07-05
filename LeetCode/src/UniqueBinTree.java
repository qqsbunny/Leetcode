import java.util.ArrayList;
import java.util.List;
public class UniqueBinTree {
	public int numTrees(int n){
		int[] cache=new int[n+1];
		if(n==0)return 1;
		if(n==1)return 1;
		cache[0]=1;
		cache[1]=1;
		for(int i=2;i<=n;i++){
			int re=0;
			for(int j=0;j<i;j++){
				re+=cache[j]*cache[i-1-j];
			}
			cache[i]=re;
		}
		return cache[n];
		
	}
    public List<TreeNode> generateTrees(int n) {
    	List<TreeNode> t=generate(1, n);
        return t;
    }
    
    public List<TreeNode> generate(int start,int end){
    	List<TreeNode> l=new ArrayList<TreeNode>();
    	if(end<start){
    		l.add(null);
    		return l;
    	}
    	if(start==end){
    		TreeNode x=new TreeNode(end);
    		l.add(x);
    		return l;
    	}
    	for(int i=start;i<=end;i++){
    		List<TreeNode> left=generate(start, i-1);
    		List<TreeNode> right=generate(i+1, end);
    		for(TreeNode n_left:left){
    			for(TreeNode n_right:right){
    				TreeNode newNode=new TreeNode(i);
    				newNode.left=n_left;
    				newNode.right=n_right;
    				l.add(newNode);
    			}
    		}
    	}
    	
    	
    	
    	return l;
    }
    
    
    public static void print(List<TreeNode> l){
    	for(TreeNode t:l){
    		
    		CreteBinTree.printBinTree(t);
    	}
    }
    
	public static void main(String[] args){
		UniqueBinTree u=new UniqueBinTree();
		//int r=u.numTrees(3);
		//System.out.println(r);
		List<TreeNode> l=u.generateTrees(3);
    	print(l);

	}
}
