
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
	public static void main(String[] args){
		UniqueBinTree u=new UniqueBinTree();
		int r=u.numTrees(3);
		System.out.println(r);
	}
}
