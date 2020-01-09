import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 0;
		
		//int[] grid = new int[n*n];
		
		boolean endrow = false;
		
		/*for(int i = 0; i < n*n; i++) {
			grid[i] = sc.nextInt();
		}*/
		
		for(int i = 1; i <= n*n; i++) {
			
			int data = sc.nextInt();
			
			if(data == i && endrow == true) {	
				break;
			}
				
			if(data != i) {
				row++;
				endrow = true;	
				
				if(i % n == 0) {
					break;
				}
			}
			
		}
		
		System.out.println(row); 

	}

}
