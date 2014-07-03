import java.util.Hashtable;


public class TwoSum {
	public static void main(String[] args){
int x[]={3,2,4};	
int m[]=new TwoSum().twoSum(x, 6);
System.out.println(m[0]+"  "+m[1]);
	}
    public int[] twoSum(int[] numbers, int target) {
    	
    	
    	Hashtable<Integer, Integer> t=new Hashtable<>(numbers.length);
    	for(int i=0;i<numbers.length;i++){
    		t.put(numbers[i], i);
    		
    	}
    	for(int i=0;i<numbers.length;i++){
    		
    		if(t.get(target-numbers[i])!=null&&t.get(target-numbers[i])!=i){
    			int[] x={i+1,t.get(target-numbers[i])+1};
    			return x;
    		}
    	}
    	
    	
        return null;
    }
}
