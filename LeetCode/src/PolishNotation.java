import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class PolishNotation {
	public static void main(String[] args){
		String[] x= {"3","-4","+"};
		int a=new PolishNotation().evalRPN(x);
		System.out.println(a);
	}
	
	/*
	 
    public int evalRPN(String[] tokens) {
    	if(tokens.length==1){
    	//	System.out.println(tokens[0]); 
    		return Integer.parseInt(tokens[0]);
    	}
    	int num1,num2,re = 0;
    	String[] new_tokens = null;
    	for(int i=0;i<tokens.length;i++){
    		if(tokens[i]=="+"||tokens[i]=="-"||tokens[i]=="*"||tokens[i]=="/"){
    			num1=Integer.parseInt(tokens[i-2]);
    			num2=Integer.parseInt(tokens[i-1]);
    			if(tokens[i]=="+"){
    				re=num1+num2;
    			}else if(tokens[i]=="-"){
    				re=num1-num2;
    			}else if(tokens[i]=="*"){
    				re=num1*num2;
    			}else if(tokens[i]=="/"){
    				re=num1/num2;
    			}
    			tokens[i-1]=String.valueOf(re);
    			tokens[i-2]="blank";
    			tokens[i]="blank";
    			
    			new_tokens=new String[tokens.length-2];
    			for(int j=0,k=0;j<tokens.length;j++){
    				if(tokens[j]!="blank"){
    					new_tokens[k]=tokens[j];
    					k++;
    				}
    			}
    			break;
    		}
    	}
		return(evalRPN(new_tokens));
    }
*/
	public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens) {
            if(s.equals("+")) {
                S.add(S.pop()+S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            }
            else if(s.equals("*")) {
                S.add(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            }
            else {
                S.add(Integer.parseInt(s));
            }
        }   
        return S.pop();
    }
}
