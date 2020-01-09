import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		
		int y2 = sc.nextInt();
		
		int energy = sc.nextInt();
		
		int dif = (x1 + y1) - (x1 + y1);
		
		if(dif > 0)
		{
			dif *= 1;
		}
		
		if(dif > energy)
		{
			System.out.println("N");
		}
		else if((dif % 2 == 0 && energy % 2 == 0) || (dif % 2 != 0 && energy % 2 != 0))
		{
			System.out.println("Y");
		}
		else if((dif % 2 == 0 && energy % 2 != 0) || (dif % 2 != 0 && energy % 2 == 0))
		{
			System.out.println("N");
		}
		else
		{
			System.out.println("Y");
		}
		
	}

}
