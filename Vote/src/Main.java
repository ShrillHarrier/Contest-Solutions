import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String votes = sc.next();
		
		int A = 0, B = 0;
		
		for(int count = 0; count < num; count++)
		{
			if (votes.charAt(count) == 'A')
			{
				A++;
			}
			
			else if (votes.charAt(count) == 'B')
			{
				B++;
			}
		}
		
		if(A > B)
		{
			System.out.println("A");
		}
		
		else if(A < B)
		{
			System.out.println("B");
		}
		
		else if(A == B)
		{
			System.out.println("tie");
		}

	}

}
