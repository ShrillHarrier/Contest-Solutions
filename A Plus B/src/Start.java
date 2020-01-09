import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt(); 
		
		int[] list = new int[rounds];
		
		for(int i = 0; i<rounds; i++) {
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
			//list[i] = (a+b);
		}
		
		/*for(int i = 0; i<rounds; i++) {
		
		System.out.println(list[i]);
		
	}*/

    }
	
}
