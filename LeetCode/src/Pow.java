
public class Pow {
	public static void main(String[] args){
		System.out.println(new Pow().pow(8.9537, -1));
	}
    public double pow(double x, int n) {
        if(n==0)return 1;
        if(n==1)return x;
        int exp = n<0?-n:n;
        double re =exp%2==0?pow(x*x,exp/2):pow(x*x,exp/2)*x;
        return n<0?1/re:re;
    }
}
