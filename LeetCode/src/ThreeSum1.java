
public class ThreeSum1 {
	public static void main(String[] args){
		int[] aa={0,1,2};
		new ThreeSum1().threeSumClosest(aa, 3);
	}
	    public int threeSumClosest(int[] num, int target) {

	        int f=num[0]   ,s=num[1],t=num[2],tmp;
	        
	        if(Math.abs(target-f)<Math.abs(target-s)){
	        	tmp=f;
	        	f=s;
	        	s=tmp;
	        }
	        if(Math.abs(target-f)<Math.abs(target-t)){
	        	tmp=f;
	        	f=t;
	        	t=tmp;
	        }
	        if(Math.abs(target-s)<Math.abs(target-t)){
	        	tmp=s;
	        	s=t;
	        	t=tmp;
	        }
	    	for(int i=0;i<num.length;i++){
	        	if(Math.abs(t-target)>Math.abs(num[i]-target)){
	        		t=num[i];
	        		if(Math.abs(t-target)<Math.abs(f-target)){
	        			tmp=t;
	        			t=f;
	        			f=tmp;
	        		}else if(Math.abs(t-target)<Math.abs(s-target)){
	        			tmp=t;
	        			t=s;
	        			s=tmp;
	        			
	        		}
	        	}
	        	
	        }
	    //	System.out.println(f+" "+s+" "+t);
	    	System.out.println(f+s+t);
	    	return 0;
	    }
}
