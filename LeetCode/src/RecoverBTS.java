
public class RecoverBTS {
	public static void main(String[] args){
		int a[]={2,-2,1};
		TreeNode t=CreteBinTree.levelcreate(a);
		RecoverBTS r=new RecoverBTS();
		r.recoverTree(t);
		CreteBinTree.printBinTree(t);
	}
	public void recoverTree(TreeNode root){
		TreeNode cur=root,rightmost,node1 = null,node2=null,pre1=null,pre2=null,pre=null;
		while(cur!=null){
			if(cur.left!=null){
				rightmost=cur.left;
				while(rightmost.right!=null&&rightmost.right!=cur)
					rightmost=rightmost.right;
				if(rightmost.right==null){
					rightmost.right=cur;
					pre=cur;
					cur=cur.left;
				}else{
					if(cur.val<pre.val){
						if(node1==null){
							pre1=pre;
							node1=cur;
						}else{
							pre2=pre;
							node2=cur;
						}
					}
					pre=cur;
					cur=cur.right;
					rightmost.right=null;
				}
			}else{
				if(pre!=null&&cur.val<pre.val){
					if(node1==null){
						pre1=pre;
						node1=cur;
					}else{
						pre2=pre;
						node2=cur;
					}
				}
				pre=cur;
				cur=cur.right;
				
			}
		}
		if(node2==null){
			int tmp=node1.val;
			node1.val=pre.val;
			pre.val=tmp;
		}else{
			int tmp=node2.val;
			node2.val=node1.val;
			node1.val=tmp;	
		}
	}
}
