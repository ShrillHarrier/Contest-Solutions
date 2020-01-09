import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		
		int s = sc.nextInt();
		
		int nik, byr;
		
		if (nik > byr)
		{
			System.out.println("Nikky");
		}
		
		if (byr > nik)
		{
			System.out.println("Byron");
		}
		
		if (nik == byr)
		{
			System.out.println("Tied");
		}

	}

}
