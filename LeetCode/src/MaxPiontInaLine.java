
public class MaxPiontInaLine {
	static class Point {
		int x;
		int y;
		Point() { x = 0; y = 0; }
		Point(int a, int b) { x = a; y = b; }
	  }


	public static void main(String[] args){

		Point p1=new Point(84,250);

		Point p2=new Point(0,0);
		
		Point p3=new Point(1,0);
		Point p4=new Point(0,-70);
		Point p5=new Point(0,-70);
		Point p6=new Point(1,-1);
		Point p7=new Point(21,10);
		Point p8=new Point(42,90);
		Point p9=new Point(-42,-230);
		Point[] x={p1,p2,p3,p4,p5,p6,p7,p8,p9};
		new MaxPiontInaLine().maxPoints(x);
	}

	 public int maxPoints(Point[] points) {
	    	if(points.length<=2)return points.length;

	    	int max=2;
	    	int tmp=2;
	    	for(int i=0;i<points.length;i++){
	    		for(int j=0;j<points.length;j++){
	    			if(points[i].x==points[j].x&&points[i].y==points[j].y)continue;
	    			if(i!=j){
	    				tmp=2;
	    				for(int k=0;k<points.length;k++){
	    					if(k!=i&&k!=j){
	    						if(online(points[i], points[j], points[k]))tmp++;
	    					}
	    				}
	    				System.out.println("total:"+tmp);
	    				if(max<tmp)max=tmp;
	    			}
	    		}
	    	}
	    	System.out.println(max);
	    	return max;
	    }
	    
	    
	    public boolean online(Point p1,Point p2,Point p){
	    	if(p.x==p1.x&&p.y==p1.y){
	    		System.out.println("("+p1.x+","+p1.y+"),("+p2.x+","+p2.y+"),("+p.x+","+p.y+") in a line");
	    		
	    		return true;
	    	}
	    	if(p.x==p2.x&&p.y==p2.y){
	    		System.out.println("("+p1.x+","+p1.y+"),("+p2.x+","+p2.y+"),("+p.x+","+p.y+") in a line");

	    		return true;
	    	}
	    	if((p.y-p1.y)*(p.x-p2.x)==(p.y-p2.y)*(p.x-p1.x)){
	    		System.out.println("("+p1.x+","+p1.y+"),("+p2.x+","+p2.y+"),("+p.x+","+p.y+") in a line");

	    		return true;
	    	}	    		
	    	System.out.println("("+p1.x+","+p1.y+"),("+p2.x+","+p2.y+"),("+p.x+","+p.y+") not in a line");

			return false;
	    	
	    }
    
}
