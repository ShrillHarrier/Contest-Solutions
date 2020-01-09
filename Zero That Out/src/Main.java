import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		int[] numbers = new int[rounds];
		
		for(int i = 0; i<rounds; i++) {
			
			int num = sc.nextInt();
			
			if(num != 0) {
				numbers[i] = num;
			}
			else if(num == 0) {
				numbers[i] = 0;
				for(int j = i-1; j>-1; j--) {
					if(numbers[j] != 0) {
						numbers[j] = 0;
						break;
					}
				}
			}
			
		}
		
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		
		System.out.println(sum);

	}

}
