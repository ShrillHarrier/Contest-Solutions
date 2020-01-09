import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int spaces = sc.nextInt();
		
		String yeste = sc.next();
		
		String today = sc.next();
		
		for(int i = 0; i < spaces; i ++)
		{
			if (yeste.charAt(i) == 'C' && today.charAt(i) == 'C')
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
