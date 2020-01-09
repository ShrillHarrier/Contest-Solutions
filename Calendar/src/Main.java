import java.util.Scanner;

public class Main {
	
	static void firstday(int day, int days)
	{
		System.out.print("  ");
		
		day--;
		
		int day2 = day;
		
		for (; day >= 1; day--)
		{
			System.out.print("    ");
		}
		
		for(int count = (day2 + 1); (count - day2) <= days; count++)
		{
			System.out.print(count - day2);
			
			if(count % 7 == 0)
			{
				System.out.println();
				
				if ((count - day2) < 9)
				{
				System.out.print("  ");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			else
			{
				if((count - day2) < 9)
				{
				System.out.print("   ");
				}
				
				else
				{
					System.out.print("  ");
				}
			}	
		}
	}	

	public static void main(String[] args) {
		
		int day, days;
		
		Scanner sc = new Scanner(System.in);
		
		day = sc.nextInt();
		
		days = sc.nextInt();
		
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		
		firstday(day, days);
		
		System.out.println();
		
		}
	
}
