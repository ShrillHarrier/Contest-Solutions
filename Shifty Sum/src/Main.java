import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rounds = sc.nextInt();
		
		int sum = 0;
		
		sum += num;
		
		for(int i = 0; i < rounds; i++)
		{
			num *= 10;
			
			sum += num;
		}
		
		System.out.println(sum);

	}

}
