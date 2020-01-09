import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		int[] binary = new int[100];
		
		Scanner sc = new Scanner(System.in);
				
		int time = sc.nextInt();
		
		for(int count = 0; count < 5; count++)
		{
			int dec = sc.nextInt();
			
			String bin = Integer.toBinaryString(dec);
			
			int amount = 0;
			
		    for(int count2 = 0; count2 < bin.length(); count2++)
		    {
		    	if(bin.charAt(count2) == '1')
		    	{
		    		amount++;
		    	}
		    }
		    
		    binary[count] = amount;
		}
		
		for(int count = 0; count < 5; count++)
		{
			System.out.println(binary[0]); 
		}
		
	}

}
