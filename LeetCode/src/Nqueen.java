

public class Nqueen {
    public static void main(String[] args){
    	System.out.println(new Nqueen().totalNQueens(8));
    	
    }
    int count=0;
	public int totalNQueens(int n) {
    	int[] p=new int[n];
    	for(int i=0;i<n;i++){
    		p[i]=-1;
    	}
    	place(p, 0, n);
		return count;
    }
    public void place(int[] p,int x,int n){
    	if(x==n){
    		count++;
    		return;
    	}
    	for(int i=0;i<n;i++){
    		p[x]=i;
    		if(coexist(p, x)){
    			place(p,x+1,n);
    		}
    	}
    }
    static boolean coexist(int[] p,int x){
    	for(int i=0;i<x;i++){
    		if(p[i]==-1)continue;
    		if(p[i]==p[x])return false;
    		if((p[i]-i)==(p[x]-x))return false;
    		if((p[i]+i)==(p[x]+x))return false;
    	}
    	return true;
    }
}
