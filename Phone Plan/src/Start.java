import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double day = sc.nextInt();
		
		double night = sc.nextInt();
		
		double weekend = sc.nextInt();
		
		double A = 0, B = 0;
		
		if(day >= 100)
		{
			A = day - 100;
			
			A *= 25;
		}
		
		A += night * 15;
		
		A += weekend * 20;
		
		if(day >= 250)
		{
			B = day - 250;
            
			B += 45;
		}
		
		B += night * 35;
				
		B += weekend * 25;
		
		System.out.println("Plan A costs " + A/100);
		
		System.out.println("Plan B costs " + B/100);
		
		if(A < B)
		{
			System.out.println("Plan A is cheapest.");
		}
		else if(A > B)
		{
			System.out.println("Plan B is cheapest.");
		}
		else if(A == B)
		{
			System.out.println("Plan A and B are the same price.");
		}
		
	}
	
}
