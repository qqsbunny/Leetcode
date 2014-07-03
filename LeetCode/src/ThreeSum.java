import java.util.Random;


public class ThreeSum {
	static int[] array;
	public static void main(String[] args){
		new ThreeSum().threeSumClosest(null, 1);
	}
	    public int threeSumClosest(int[] num, int target) {
	    	array=num;
			int[] xxx={2,3,4,1,2,2,2,2,};
	    	array=xxx;
	    	quicksort(0, array.length-1);
	    	for(int i=0;i<array.length;i++){
	    		System.out.print(array[i]);
	    	}
	    	int min;
	    	for(int i=0;i<array.length;i++){
	    		//Math.abs(array[i]-target);
	    		
	    		
	    	}
	    	return 0;
	        
	    }
	    public static void quicksort(int start ,int end){
	    	if(start>=end)return;
	    	int p=choosePivot(start,end);
	    	int x=array[p];
	    	partition(start,end,p);
	    	
	    	quicksort( start, x-1);
	    	quicksort(x+1, end);
	    	
	    }
		private static void partition(int start, int end, int p) {
			// TODO Auto-generated method stub
			int tmp=array[p];
			array[p]=array[start];
			array[start]=tmp;
			int n=start;
			int m=start+1;
			int t;
			while(m<=end){
				if(tmp>array[m]){
					t=array[m];
					array[m]=array[n+1];
					array[n+1]=t;
					n++;
				}
				m++;
			}
			array[start]=array[n];
			array[n]=tmp;
			
			
			
		}
		private static int choosePivot(int start, int end) {
			// TODO Auto-generated method stub
			if(end-start<=2)return start;
			return new Random().nextInt(end-start-2)+start+1;
		}

}
