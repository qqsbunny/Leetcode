import java.util.Stack;


public class Order2Tree {
	public static void main(String[] args){
		int pre[]={7,4,1,6,5,9,8,11};
		int in[]={1,4,5,6,7,8,9,11};
		int post[]={1,5,6,4,8,11,9,7};
		Order2Tree o=new Order2Tree();
		
		TreeNode t=o.buildTree1(pre, in);
		TreeNode t2=o.buildTree2(in, post);
		CreteBinTree.printBinTree(t);
		CreteBinTree.printBinTree(t2);

	}
	
//preorder and inorder to btree	
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
    	int length=preorder.length;
    	if(length==0)return null;
    	int root=preorder[0];
    	int index=getIndex(inorder, root);
    	TreeNode t=new TreeNode(root);
    	int[] pre_left=new int[index],pre_right=new int[length-index-1],in_left=new int[index],in_tmp=new int[index+1],in_right=new int[length-index-1];
    	System.arraycopy(preorder, 1, pre_left, 0, index);
    	System.arraycopy(preorder, index+1, pre_right, 0, length-index-1);
    	System.arraycopy(inorder, 0, in_left, 0, index);
    	System.arraycopy(inorder, index+1, in_right, 0, length-index-1);
    	t.left=buildTree1(pre_left, in_left);
    	t.right=buildTree1(pre_right, in_right);
    	return t;
      }

//inorder and postorder to btree    
    public TreeNode buildTree2(int[] inorder, int[] postorder) {
    	int length=postorder.length;
    	if(length==0)return null;
    	int root=postorder[length-1];
    	int index=getIndex(inorder, root);
    	TreeNode t=new TreeNode(root);
    	int[] post_left=new int[index],post_right=new int[length-index-1],in_left=new int[index],in_tmp=new int[index+1],in_right=new int[length-index-1];
    	System.arraycopy(postorder, 0, post_left, 0, index);
    	System.arraycopy(postorder, index, post_right, 0, length-index-1);
    	System.arraycopy(inorder, 0, in_left, 0, index);
    	System.arraycopy(inorder, index+1, in_right, 0, length-index-1);
    	t.left=buildTree2( in_left,post_left);
    	t.right=buildTree2( in_right,post_right);
    	return t;    
    	}
  
	public int getIndex(int[] x,int m){
    	int i=0;
    	while(x[i]!=m){
    		i++;
    	}
    	return i;
    	
    }

}
