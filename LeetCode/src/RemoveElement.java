import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class RemoveElement {
	public static void main(String[] args){
		int[] xxx={4,5};
		new RemoveElement().removeElement(xxx, 4);
	}
    public int removeElement(int[] A, int elem) {
    	ArrayList<Integer> x=new ArrayList<>();
    	for(int i=0;i<A.length;i++){
    		x.add(A[i]);
    		
    	}
        Iterator<Integer> it=x.iterator();
        while(it.hasNext()){
        	if(it.next()==elem)it.remove();
        }
    	A=new int[x.size()];
    	for(int i=0;i<x.size();i++)
    	{
    	  A[i]=((Integer)x.get(i)).intValue();
    	} 
    	for(int i=0;i<A.length;i++){
    	System.out.println(A[i]);
    	}
    	System.out.print(x.size());
    	
    	return x.size();
        
    }
}
