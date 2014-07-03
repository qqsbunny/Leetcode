import java.util.ArrayList;


public class SortedtoAVL {
    public static void main(String[] args){
    	SortedtoAVL s=new SortedtoAVL();
    	ListNode a1=new ListNode(1);
    	ListNode a2=new ListNode(2);
    	ListNode a3=new ListNode(3);
    	ListNode a4=new ListNode(4);
    	ListNode a5=new ListNode(5);
    	ListNode a6=new ListNode(6);
    	ListNode a7=new ListNode(7);
    	ListNode a8=new ListNode(8);
    	a1.next=a2;
    	a2.next=a3;
    	a3.next=a4;
    	a4.next=a5;
    	a5.next=a6;
    	a6.next=a7;
    	a7.next=a8;
    	//TreeNode t=s.sortedListToBST(a1);
    	s.head=a1;
    	TreeNode t=s.sortList( 0, 7);
    	CreteBinTree.printBinTree(t);
    }
    ListNode head;
    public TreeNode sortList(int start,int end){
    	if(start>end)return null;
    	TreeNode left=sortList(start, (start+end)/2-1);
    	TreeNode p=new TreeNode(head.val);
    	p.left=left;
    	head=head.next;
    	p.right=sortList((start+end)/2+1, end);
    	return p;
    }
    
    
    ArrayList<Integer> a;
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null)return null;
		a=new ArrayList<Integer>();
		ListNode p=head;
		while(p!=null){
			a.add(p.val);
			p=p.next;
		}
		TreeNode t=null;
		t=re2(t,0,a.size()-1);
		return t;
	}
	
	public TreeNode sortedArrayToBST(int[] num) {
    	if(num.length==0)return null;
    	TreeNode t = null;
    	this.num=num;
    	t=re(t,0,num.length-1);
        return t;
        
    }
	int[]  num;
	public TreeNode re(TreeNode t,int start,int end){
		if(start>end)return null;

		int mid=start+(end-start)/2;
		t =new TreeNode(num[mid]);
		t.left=re(t.left,start,mid-1);
		t.right=re(t.right,mid+1,end);
		return t;
	}
	public TreeNode re2(TreeNode t,int start,int end){
		if(start>end)return null;

		int mid=start+(end-start)/2;
		t =new TreeNode(a.get(mid));
		t.left=re2(t.left,start,mid-1);
		t.right=re2(t.right,mid+1,end);
		return t;
	}
}
