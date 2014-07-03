import java.util.List;


public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        return null;
    }
    public boolean isPalidrome(String s){
    	for(int i=0;i<s.length()/2;i++){
    		if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
    	}
    	return true;
    }
}
