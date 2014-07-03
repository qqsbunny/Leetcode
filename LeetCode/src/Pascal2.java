import java.util.LinkedList;
import java.util.List;


public class Pascal2 {
	public static void main(String[] args){
		Pascal2 p=new Pascal2();
		List<Integer> l=new Pascal2().getRow(0);
		System.out.println(l);
	}
    public List<Integer> getRow(int rowIndex) {
    	rowIndex++;
    	List<Integer> l=new LinkedList<>();
    	if(rowIndex==0)return l;
    	if(rowIndex>0)l.add(1);
    	if(rowIndex>1)l.add(1);
    	if(rowIndex>2){
	    	while(rowIndex-->2){
	    		int size=l.size();
	    		for(int i=0;i<size/2;i++){
	    			l.set(size-i-1, l.get(i)+l.get(i+1));
	    		}
	    		l.add(1);
	    		size++;
	    		for(int i=0;i<size/2;i++){
	    			l.set(i, l.get(size-1-i));
	    		}
	    	}
    	}
    	return l;
        
    }
}
