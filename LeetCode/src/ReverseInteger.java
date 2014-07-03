import java.util.Stack;


public class ReverseInteger {
    public static int reverse(int x) {
    	if(x==0)return 0;
    	int m=0;
    	int num=1000000000;
    	while(x/num==0){
    		num/=10;
    	}
    	Stack<Integer> s=new Stack<Integer>();
    	while(num>=1){
    		s.push(x/num);
    		x-=(x/num)*num;
    		num/=10;

    	}
//    	System.out.println(s);
    	while(!s.isEmpty()){
    		m=m*10+s.pop();
    	}
//    	System.out.println(m);
    	return m;
      
    }
    public static void main(String[] args){
    	reverse(1234567);
    }
}
