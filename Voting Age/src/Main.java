import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		int[] years = new int[rounds];
		int[] months = new int[rounds];
		int[] days = new int[rounds];
		
		for(int i = 0; i<rounds; i++) {
			years[i] = sc.nextInt();
			months[i] = sc.nextInt();
			days[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<rounds; i++) {
			if(years[i] < 1989) {
				System.out.println("Yes");
			}
			else if(years[i] == 1989 && months[i]<2) {
				System.out.println("Yes");
			}
			else if(years[i] == 1989 && months[i]==2 && days[i] <= 27) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
