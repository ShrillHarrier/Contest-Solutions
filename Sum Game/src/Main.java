import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		int[] runs1 = new int[days];
		
		int[] runs2 = new int[days];
		
		int sum1 = 0;
		
		int sum2 = 0;
		
		int index = 0;
		
		for(int i = 0; i<days; i++) {
			runs1[i] = sc.nextInt();
		}
		
		for(int i = 0; i<days; i++) {
			runs2[i] = sc.nextInt();
		}
		
		for(int i = 0; i<days; i++) {
			sum1 += runs1[i];
			
			sum2 += runs2[i];
			
			if(sum1 == sum2) {
				index = i + 1;
			}
		}
		
		System.out.println(index);

	}

}
