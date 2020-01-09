import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String[] cards = new String[52];
	
	int a = 0;
    
	int b = 0;
  
    for(int i = 0; i<52; i++)
    {
    	cards[i] = sc.next();
    }
	
	for(int i = 0; i<52; i++) {
		if(cards[i].equals("ace") && i < 48 ) {
			boolean high = false;
			for(int j = i+1; j<i+5; j++) {
				if(cards[j].equals("ace") || cards[j].equals("king") || cards[j].equals("queen") || cards[j].equals("jack")) {
						high = true;
					}
				}
			if(high == false) {
				if(i % 2 == 0) {
					a += 4;
					System.out.println("Player A scores 4 point(s).");
				}
				else {
					b += 4;
					System.out.println("Player B scores 4 point(s).");
				}
			}
		}
		else if(cards[i].equals("king") && i < 49) {
			boolean high = false;
			for(int j = i+1; j<i+4; j++) {
				if(cards[j].equals("ace") || cards[j].equals("king") || cards[j].equals("queen") || cards[j].equals("jack")) {
						high = true;
					}
				}
			if(high == false) {
				if(i % 2 == 0) {
					a += 3;
					System.out.println("Player A scores 3 point(s).");
				}
				else {
					b += 3;
					System.out.println("Player B scores 3 point(s).");
				}
			}
		}
		else if(cards[i].equals("queen") && i < 50) {
			boolean high = false;
			for(int j = i+1; j<i+3; j++) {
				if(cards[j].equals("ace") || cards[j].equals("king") || cards[j].equals("queen") || cards[j].equals("jack")) {
						high = true;
					}
				}
			if(high == false) {
				if(i % 2 == 0) {
					a += 2;
					System.out.println("Player A scores 2 point(s).");
				}
				else {
					b += 2;
					System.out.println("Player B scores 2 point(s).");
				}
			}
		}
		else if(cards[i].equals("jack") && i < 51) {
			boolean high = false;
			for(int j = i+1; j<i+2; j++) {
				if(cards[j].equals("ace") || cards[j].equals("king") || cards[j].equals("queen") || cards[j].equals("jack")) {
						high = true;
					}
				}
			if(high == false) {
				if(i % 2 == 0) {
					a += 1;
					System.out.println("Player A scores 1 point(s).");
				}
				else {
					b += 1;
					System.out.println("Player B scores 1 point(s).");
				}
			}
		}
	}
	
	System.out.println("Player A: " + a + " point(s).");
	
	System.out.println("Player B: " + b + " point(s).");

	}
}
