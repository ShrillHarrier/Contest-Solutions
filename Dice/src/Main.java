import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		int An = 100, Dave = 100;
		
		for(int count = 0; count < times; count++)
		{
			int left = sc.nextInt();
			
			int right = sc.nextInt();
			
			if(left > right)
			{
				Dave -= left;
			}
			
			else if(left < right)
			{
				An -= right;
			}
		}
		
		System.out.println(An);
		System.out.println(Dave);

	}

}
