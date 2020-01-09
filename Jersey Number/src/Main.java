import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int stock = sc.nextInt();
		
		int want = sc.nextInt();
		
		String[] stocks = new String[stock];
		
		//String[] wants = new String[want];
		
		int count = 0;
		
		for(int i = 0; i<stock; i++) {
			stocks[i] = sc.nextLine() + " " + Integer.toString(i+1);
		}
		
		for(int i = 0; i<want; i++) {
			//wants[i] = sc.nextLine();
			
			if(Arrays.asList(stocks).contains(sc.nextLine())) {
				count++;
		}

	}
		
		System.out.println(count);

	}
	
}
