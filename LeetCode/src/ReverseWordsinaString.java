import java.util.Scanner;
import java.util.Stack;


public class ReverseWordsinaString {
    public static String reverseWords(String s) {
    	s=s.trim();
    	String sarray[]=s.split("\\s+");
    	for(int i=0;i<sarray.length;i++){
    		System.out.println(sarray[i]);
    	}
    	System.out.println(sarray.length);

    	if(sarray.length==0)return "";
String result="";
for(int i=sarray.length-1;i>=0;i--){
	result=result+sarray[i]+" ";
}

return result.trim();
        
    }
    public static void main(String[] args){
    	System.out.println(reverseWords("  a  b "));
    }
}
