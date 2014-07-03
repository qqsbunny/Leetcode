import java.util.ArrayList;
import java.util.List;



public class Pascal1 {
	public static void main(String[] args){
		Pascal1 p=new Pascal1();
		List<List<Integer>> l=p.generate(5);
		System.out.println(l);
		
		
		
	}
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> l=new ArrayList<List<Integer>>();
    	if(numRows==0)return l;
    	if(numRows>=1){
    		List<Integer> l1=new ArrayList<Integer>();
    		l1.add(1);
    		l.add(l1);
    	}
    	if(numRows>=2){
    		List<Integer> l2=new ArrayList<Integer>();
    		l2.add(1);
    		l2.add(1);
    		l.add(l2);
    	}
    	if(numRows>2){
    		for(int i=2;i<numRows;i++){
        		List<Integer> ln=new ArrayList<Integer>();
        		ln.add(1);
        		for(int j=0;j<l.get(i-1).size()-1;j++){
        			ln.add(l.get(i-1).get(j)+l.get(i-1).get(j+1));
        		}
        		ln.add(1);
        		l.add(ln);
    		}
    		
    	}
    	return l;
    }
}
