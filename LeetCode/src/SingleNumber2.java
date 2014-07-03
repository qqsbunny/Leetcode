
public class SingleNumber2 {
	public static void main(String[] args){
		int[] x={1,1,1,2,3,3,3};
		new SingleNumber2().singleNumber(x);
	}
    public int singleNumber(int[] A) {
    	int[] count=new int[32];
    	for(int n=0;n<32;n++){
    		for(int i=0;i<A.length;i++){
    			count[n]+=(A[i]&1<<n)>>n;
    		}
    	}
    	int t=0;
    	for(int n=0;n<32;n++){
    		t+=(count[n]%3)<<n;
    		
    		
    	}
    	System.out.print(t);
    	return t;
    }
    
}
