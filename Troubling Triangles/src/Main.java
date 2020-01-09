import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		double[][] coords = new double[rounds][6];
		
		/*double[] para = new double[rounds];
		
		double[] area = new double[rounds];*/
		
		for(int i = 0; i<rounds; i++) {
			
			for(int j = 0; j<6; j++) {
				
				coords[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i = 0; i<rounds; i++) {
			
			double a = Math.abs(((coords[i][0] * (coords[i][3] - coords[i][5])) + (coords[i][2] * (coords[i][5] - coords[i][1])) + (coords[i][4] * (coords[i][1] - coords[i][3])))/2);
			
			double p = Math.sqrt(Math.pow((coords[i][2] - coords[i][0]), 2) + Math.pow((coords[i][3] - coords[i][1]), 2)) + Math.sqrt(Math.pow(coords[i][4] - coords[i][0], 2) + Math.pow(coords[i][5]-coords[i][1], 2)) +  Math.sqrt(Math.pow(coords[i][4] - coords[i][2], 2) + Math.pow(coords[i][5]-coords[i][3], 2));
			
			System.out.println(String.format( "%.2f", a) + " " + String.format( "%.2f", p));
		}
	}
}
