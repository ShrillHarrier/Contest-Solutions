import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int roll = 1;
		
		int place = 1;
		
		while(roll != 0 && place < 100) {
			
			roll = sc.nextInt();
			
			if(place + roll <= 100) {
			place += roll;
			}
			
			if(place == 9) {
				place = 34;
			}
			
			if(place == 40) {
				place = 64;
			}
			
			if(place == 67) {
				place = 86;
			}
			
			if(place == 54) {
				place = 19;
			}
			
			if(place == 90) {
				place = 48;
			}
			
			if(place == 99) {
				place = 77;
			}
			
			if(roll != 0) {
			System.out.println("You are now on square " + place);
			}
		}
		
		if(roll == 0) {
			System.out.print("You Quit!");
		}
		else {
			System.out.print("You Win!");
		}

	}

}
