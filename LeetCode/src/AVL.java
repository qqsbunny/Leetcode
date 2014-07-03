public class AVL {
	public static void main(String[] args){
		//int[] a={50,17,72,12,23,54,76,9,14,19,-1,-1};
		AVL avl=new AVL();
		
		//TreeNode t=CreteBinTree.precreate(a);
		//CreteBinTree.printBinTree(t);
		ListNode a=new ListNode(3);
		ListNode b=new ListNode(5);
		ListNode c=new ListNode(8);
		a.next=b;
		b.next=c;
		
		TreeNode p=avl.sortedListToBST(a);
		CreteBinTree.printBinTree(p);
	}
	public TreeNode sortedListToBST(ListNode head) {
	    if(head==null)return null;
		TreeNode t=new TreeNode(head.val);
	    ListNode p=head.next;
		while(p!=null){
	    	 t=insertAVL(t, p.val);
	    	 p=p.next;
	     }
		return t;
	}
	public TreeNode insertAVL(TreeNode root,int val){
		TreeNode p=root;
		while(true){
			if(val<p.val){
				if(p.left!=null){
					p=p.left;
				}
				else {
					p.left=new TreeNode(val);
					break;
				}
			}else if(val>=p.val){
				if(p.right!=null){
					p=p.right;
				}
				else{
					p.right=new TreeNode(val);
					break;
				}
			}
		}
		root=ajust(root);
		return root;
	}
	public TreeNode ajust(TreeNode t){
		if(t==null)return null;
		t.left=ajust(t.left);
		t.right=ajust(t.right);
		int bf=getBalanceFactor(t);
		int nbf;
		if(bf==2){
			nbf=getBalanceFactor(t.left);
			if(nbf==1){
				//LL
				t=rightRotation(t);
			}else{
				//LR
				t.left=leftRotation(t.left);
				t=rightRotation(t);
			}
			
		}else if(bf==-2){
			nbf=getBalanceFactor(t.right);
			if(nbf==1){
				//RL
				t.right=rightRotation(t.right);
				t=leftRotation(t);
			}else{
				//RR
				t=leftRotation(t);
				
			}
		}

		return t;
	}
	
	public TreeNode rightRotation(TreeNode t){
		TreeNode n=t.left;
		t.left=n.right;
		n.right=t;
		return n;
	}
	public TreeNode leftRotation(TreeNode t){
		TreeNode n=t.right;
		t.right=n.left;
		n.left=t;
		return n;
	}
	
	
	public int getBalanceFactor(TreeNode t){
		return getDepth(t.left)-getDepth(t.right);
	}
	
	
	
	public int getDepth(TreeNode t){
		if(t==null)return 0;
		int l=getDepth(t.left);
		int r=getDepth(t.right);
		return l>r?l+1:r+1;
	}
}
