import java.util.ArrayList;
import java.util.List;



public class Nqueen2 {
    public static void main(String[] args){
    	//System.out.println(new Nqueen2().totalNQueens(8));
    	new Nqueen2().totalNQueens(8);
    }
    int count=0;
    List<String[]> out=new ArrayList<String[]>();
	public  List<String[]> totalNQueens(int n) {
    	int[] p=new int[n];
    	for(int i=0;i<n;i++){
    		p[i]=-1;
    	}
    	place(p, 0, n);
		return out;
    }
    public void place(int[] p,int x,int n){
    	if(x==n){
    		count++;

    		out.add(print(p));
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
    private String[] print(int[] p){
    	String[] x=new String[p.length];
    	String tmp;
    	for(int i=0;i<p.length;i++){
    		tmp="";
    		for(int j=0;j<p.length;j++){
    			if(p[i]!=j)tmp+=".";
    			else tmp+="Q";
    		}
    		x[i]=tmp;
    		//System.out.print(p[i]+" ");
    	}
    	//System.out.println();
		return x;
    }
}
