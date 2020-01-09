import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the speed limit: ");
		
		int limit = sc.nextInt();
		
		System.out.print("Enter the recorded speed of the car: ");
		
		int speed = sc.nextInt();
		
		int dif = speed - limit; 
		
		if(dif <= 0)
		{
			System.out.println("Congratulations, you are within the speed limit!");
		}
		
		else if(dif >= 1 && dif <= 20)
		{
			System.out.println("You are speeding and your fine is $100.");
		}
		
		else if(dif >= 21 && dif <= 30)
		{
			System.out.println("You are speeding and your fine is $270.");
		}
		
		else if(dif >= 31)
		{
			System.out.println("You are speeding and your fine is $500.");
		}
		
	}
	
}