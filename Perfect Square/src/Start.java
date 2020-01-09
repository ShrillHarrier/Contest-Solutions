import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		double sqrt = Math.sqrt(num);
		
		if(sqrt - (int)sqrt == 0)
		{
			System.out.println("The largest square has side length " + (int)sqrt + ".");
		}
		
		if((sqrt - (int)sqrt) != 0)
		{
			while(true)
			{
				num--;
				
				sqrt = Math.sqrt(num);
				
				if(sqrt - (int)sqrt == 0)
				{
					break;
				}
			} 
			
			System.out.println("The largest square has side length " + (int)sqrt + ".");
		}
		
	}

}
