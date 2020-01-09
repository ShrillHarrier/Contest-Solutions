import java.util.Scanner; 

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] tickets = {0, 0, 0, 0};
		
		int[] prices = new int[4];
		
		for(int i = 0; i<4; i++) {
			prices[i] = sc.nextInt();
		}
		
		int amount = sc.nextInt();
		
		int total = 0;
		
		int minimum = 0;
		
		for(int i = 0; i<amount+1; i++) {
			
			for(int j = 0; j<amount+1; j++) {
				
				for(int k = 0; k<amount+1; k++) {
					
					for(int l = 0; l<amount+1; l++) {
						
						int sum = 0;
						int num = 0;
						
						for(int m = 0; m<4; m++) {
							sum += tickets[m] * prices[m];
							num += tickets[m];
						}
						
						if(sum == amount) {
							System.out.println("# of PINK is " + tickets[0] + " # of GREEN is " + tickets[1] + " # of RED is " + tickets[2] + " # of ORANGE is " + tickets[3]);
							total++;
							if(minimum == 0 || minimum > num) {
								minimum = num;
							}
						}
						
						tickets[0] = i;
						tickets[1] = j;
						tickets[2] = k;
						tickets[3] = l; 
						
					}
				}
				
			}
			
		}
		
		System.out.println("Total combinations is " + total + ".");
		System.out.println("Minimum number of tickets to print is " + minimum + ".");
		
	}

}
