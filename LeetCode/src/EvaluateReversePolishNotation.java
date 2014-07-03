
public class EvaluateReversePolishNotation {
    public static int evalRPN(String tokens[]) {
        int result=0;
        
        System.out.println(Integer.parseInt(tokens[0]));
        
    	return 0;
    }
    public int iterater (String tokens[]){
    	if(tokens.length==1)return Integer.parseInt(tokens[0]);
    	else{
    		iterater(tokens);
    	}
		return 0;
    	
    }
    	
}
