import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] coins = new int[5];
		
		int[] value = {5, 10, 25, 100, 200};
		
		for(int count = 0; count < 5; count++)
		{
		    coins[count] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int count = 0; count < 5; count++)
		{
			sum += coins[count] * value[count];
		}
		
		System.out.println(sum);

	}

}
