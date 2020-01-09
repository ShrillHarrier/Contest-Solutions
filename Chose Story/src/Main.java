import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		
		for(int i = 0; i < first + 1; i++)
		{
			String the = sc.nextLine();
		}
		
		Random r = new Random(), r2 = new Random();
		
	    if(r.nextInt(2) < 1)
	    {
	    	System.out.println("Y");
	    }
	    else
	    {
	    	System.out.println("N");
	    }
	    
	    System.out.println(r2.nextInt(10));

	}

}
