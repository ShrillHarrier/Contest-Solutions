import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mass = sc.nextInt();
		
		int rounds = sc.nextInt();
				
		int[] onbridge = {0,0,0,0};
				
		int total;
		
		int count = 0;
		
		boolean under = true;
		
		for(int i = 0; i<rounds; i++) {
			if(Arrays.asList(onbridge).contains(0) == true) {
				onbridge[i] = sc.nextInt();
			}
			else {
				int temp = sc.nextInt();
				for(int j = 0; j < 3; j++) {
					onbridge[j] = onbridge[j + 1];
			}
				onbridge[3] = temp;
			}
			
			total = IntStream.of(onbridge).sum();
			
			//System.out.println(total);
			
			if(total > mass) {
				under = false;
			}
			
			if(under == true) {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
