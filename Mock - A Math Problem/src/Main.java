import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double k = sc.nextInt();
		
		double p = sc.nextInt();
		
		double x = sc.nextInt();
		
		double m = 1;
		
		double y;
		
		double lowest = 0;
		
		for(;m < 100000000; m++) {
			
			y = m*x + (k*p)/m;
			
			if(lowest == 0) {
				lowest = y;
			}
			
			if(y < lowest) {
				lowest = y;
			}
		}
		
		System.out.printf("%.3f", lowest);
		System.out.println();

	}

}
