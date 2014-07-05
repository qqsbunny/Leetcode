
public class zigzagConversion {
    public String convert(String s, int nRows) {
    	if(nRows==1)return s;
       String re="";
    	for(int i=0;i<nRows;i++){
    	   int m=i;
    	   while(m<s.length()){
    		   re+=s.charAt(m);
    		   if(i!=0&&i!=nRows-1&&m+2*(nRows-1-i)<s.length()){
    			   re+=s.charAt(m+2*(nRows-1-i));
    		   }
    		   m+=2*nRows-2;
    	   }
       }
    	return re;
    }
    public static void main(String [] args){
    	zigzagConversion z=new zigzagConversion();
    	String s=z.convert("A", 1);
    	System.out.println(s);
    }
}
