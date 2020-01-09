import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		int num2 = (int)num;
		
		num /= 2;
		
		num += 1;
		
		if(num2 >= 6)
		{
			num -= (num2 - 5);
		}
		
		System.out.println((int)num);

	}

}
