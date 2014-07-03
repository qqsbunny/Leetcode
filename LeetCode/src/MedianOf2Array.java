
public class MedianOf2Array {
	public static void main(String[] args){
		MedianOf2Array m=new MedianOf2Array();
		int[] a={1,1},b={1,2};
		System.out.println(m.findMedianSortedArrays(a, b));
	}
    public double findMedianSortedArrays(int A[], int B[]) {
        int m=A.length-1;
        int n=B.length-1;
        if(m==0&&n==0)return (A[0]+B[0])/2;
        int a=0,b=0;
        while(a-m<0&&b-n<0){
        	
        	if(A[a]<B[b])a++;
        	else b++;
        	if(a-m>0){
        		n--;
        		break;
        	}
        	if(b-n>0){
        		m--;
        		break;
        	}
        	if(A[m]>B[n])m--;
        	else n--;
        }
        if(a-m==1)return B[(b+n)/2];
        if(b-n==1)return A[(a+m)/2];
        return -1;
    }
}
