import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cards = sc.nextLine();
		int[] indexes = new int[4];
		indexes[0] = 0;
		
		for(int i = 0; i<cards.length(); i++) {
			if(cards.charAt(i)=='D') {
				indexes[1] = i;
			}
			if(cards.charAt(i)=='H') {
				indexes[2] = i;
			}
			if(cards.charAt(i)=='S') {
				indexes[3] = i;
			}
		}
		
		char[][] suits = new char[4][14];
		
		for(int i = 0; i < 4; i++) {
			if(i < 3) {
			for(int j = 0; j < indexes[i + 1] - indexes[i]; j++) {
				suits[i][j] = cards.charAt(j + indexes[i]);
			}
			}
			else {
				for(int j = 0; j < (17 - indexes[3]); j++) {
					suits[3][j] = cards.charAt(j + indexes[3]);
			}
			}
		}
		
		int[] points = new int[]{0,0,0,0};
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<14; j++) {
				if(j == 0 && i < 3) {
					if((indexes[i + 1]-indexes[i]) == 1){
						points[i] += 3;
					}
					else if((indexes[i + 1]-indexes[i]) == 2){
						points[i] += 2;
					}
					else if((indexes[i + 1]-indexes[i]) == 3){
						points[i] += 1;
					}
				}
				else if(j==0 && i ==3) {
					if(17-indexes[3] == 1){
						points[i] += 3;
					}
					else if(17-indexes[3] == 2){
						points[i] += 2;
					}
					else if(17-indexes[3] == 3){
						points[i] += 1;
					}
				}
				
				if(suits[i][j] == 'J') {
					points[i] += 1;
				}
				else if(suits[i][j] == 'Q') {
					points[i] += 2;
				}
				else if(suits[i][j] == 'K') {
					points[i] += 3;
				}
				else if(suits[i][j] == 'A') {
					points[i] += 4;
				}
				
				}
			}
		
		int sum = points[0] + points[1] + points[2] + points[3];
		
		System.out.println("Cards Dealt            Points");
		
		System.out.print("Clubs ");
		for(int i = 1; i<(indexes[1]-indexes[0]);i++) {
			System.out.print(suits[0][i] + " ");
		}
		System.out.println(points[0]);
		
		System.out.print("Diamonds ");
		for(int i = 1; i<(indexes[2]-indexes[1]);i++) {
			System.out.print(suits[1][i] + " ");
		}
		System.out.println(points[1]);
		
		System.out.print("Hearts ");
		for(int i = 1; i<(indexes[3]-indexes[2]);i++) {
			System.out.print(suits[2][i] + " ");
		}
		System.out.println(points[2]);
		
		System.out.print("Spades ");
		for(int i = 1; i<(17-indexes[3]);i++) {
			System.out.print(suits[3][i] + " ");
		}
		System.out.println(points[3]);
		
		System.out.println("                       Total " + sum);
		
	}
}
	
