
public class ClimbStairs {
	    public static int climbStairs(int n) {
	        if(n==0)return 0;
	        if(n==1)return 1;
	        if(n==2)return 2;

	    	int[] x=new int[n+1];
	        x[0]=0;
	        x[1]=1;
	        x[2]=2;
	        for(int i=3;i<n+1;i++){
	            x[i]=x[i-1]+x[i-2];
//		        System.out.println(x[i]);
	            
	        }
	        
			return x[n];
	        
	    }
	public static void main(String[] args){
		System.out.println(climbStairs(4));
	}

}
