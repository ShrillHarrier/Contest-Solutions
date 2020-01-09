package Main; 

public class Start {
	
	static long sum(long num, long times)
	
	{
		
		long total = num;
		
		for(; times > 0; times--)
		{
		    num *= 10;
		    
		    total += num;
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(0, 999999999));
		
		}

}
