
public class Interleaving {
	public static void main(String[] args){
		String a="a",b="",c="aa";
		Interleaving i=new Interleaving();
		boolean x=i.isInterleave(a, b, c);
		System.out.println(x);
	}
    public boolean isInterleave(String s1, String s2, String s3) {
        int i=0,j=0,k=0;
        if(s1.length()+s2.length()!=s3.length())return false;
        while(k<s3.length()){
        	if(i<s1.length()&&s3.charAt(k)==s1.charAt(i))i++;
        	
        	else if(j<s2.length()&&s3.charAt(k)==s2.charAt(j))j++;
        	else return false;
        	k++;
        	
        }
        return true;
    }
}
