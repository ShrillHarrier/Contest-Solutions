import java.util.Scanner; 
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vilnum = sc.nextInt();
		
		int[] locations = new int[vilnum];
		
		double[] distances = new double[vilnum-2];
		
		for(int i = 0; i<vilnum; i++) {
			locations[i] = sc.nextInt();
		}
		
		Arrays.sort(locations);
		
		for(int i = 1; i<vilnum-1; i++) {
			double sum = (double)(locations[i+1] - locations[i])/(double)2;
			sum += (double)(locations[i] - locations[i-1])/(double)2;
			
			//System.out.println("Sum: " + sum);
			
			distances[i-1] = sum; 
		}
		
		/*for(int i = 0; i<locations.length; i++) {
			System.out.println(locations[i]);
		}*/
		
		Arrays.sort(distances);
		
		System.out.printf("%.1f", distances[0]);
		
	}

}