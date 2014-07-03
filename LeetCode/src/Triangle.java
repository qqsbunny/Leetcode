import java.util.ArrayList;
import java.util.List;


public class Triangle {
	public static void main(String[] args){
		List<Integer> l0=new ArrayList<Integer>();
		l0.add(1);
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		triangle.add(l0);
		triangle.add(l1);
		Triangle t=new Triangle();
		int x=t.minimumTotal(triangle);
		System.out.println(x);
	}
    public int minimumTotal(List<List<Integer>> triangle) {
       	if(triangle.size()==0)return 0;
	    for(int i=triangle.size()-2;i>=0;i--){
	    	for(int j=0;j<triangle.get(i).size();j++){
	    		if(triangle.get(i+1).get(j)>triangle.get(i+1).get(j+1)){
	    			triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i+1).get(j+1) );
	    		}else{
	    			triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i+1).get(j) );
	    		}
	    	}
	    }
		
	    return triangle.get(0).get(0); 
}

}
