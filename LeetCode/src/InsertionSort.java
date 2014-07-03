
public class InsertionSort {
	public static void main(String[] args){
		int x[]={9,7,5,3,1,8,6,4,2,0};
		InsertionSort is=new InsertionSort();
		ListNode head=is.new ListNode(x[0]),tmp=head;
		for(int i=1;i<x.length;i++){
			tmp.next=is.new ListNode(x[i]);
			tmp=tmp.next;
		}
		Print(head);
		head=is.insertionSortList(head);
		Print(head);
	}
	public  class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		val = x;
		next = null;
		}
	}


	public ListNode insertionSortList(ListNode head) {
		if(head==null)return null;
		ListNode sorted=new ListNode(0),p,tmp;
		while(head!=null){
			p=sorted;
			while(p.next!=null&&p.next.val<head.val){
				p=p.next;
			}
			tmp=head.next;
			head.next=p.next;
			p.next=head;
			
			head=tmp;
			Print(sorted);
		}
		return sorted.next;
		
    }
	public static void Print(ListNode q){
		ListNode p=q;
		while(p!=null){
			System.out.print(p.val+" ");
			p=p.next;
		}
		System.out.println();
	}

	
}
