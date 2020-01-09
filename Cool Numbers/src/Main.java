import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double low = sc.nextInt();
		
		double high = sc.nextInt();
		
		int count = 0;
		
		for(double i = low; i<=high; i++) {
			if((Math.sqrt(i) - (int)Math.sqrt(i)) == 0 && (Math.cbrt(i) - (int)Math.cbrt(i)) == 0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
