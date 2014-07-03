
public class Stock {
	public static void main(String[] args){
		int[] a={2,5,-3,2};
		Stock s=new Stock();
		System.out.println(s.maxProfit(a));
	}
	public int maxProfit(int[] prices) {
    	if(prices.length==0)return 0;
		int max=0;
    	int lowest=prices[0];
    	for(int i=0;i<prices.length;i++){
    		if(lowest>prices[i])lowest=prices[i];
    		if(prices[i]-lowest>max)max=prices[i]-lowest;
    	}
    	
    	return max;
    }
}
