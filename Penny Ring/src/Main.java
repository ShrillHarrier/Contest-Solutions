import java.util.Scanner;

public class Main {
	
	public static int getNum(int rad) {
		
		int points = 4;
		
	   for(int i = -1*rad+1; i<rad; i++) {
		   for(int j = -1*rad+1; j<rad; j++) {
			   if(i*i + j*j <= rad*rad) {
				   points++;
			   }
		   }
	   }
        
		return points;
          
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rad = sc.nextInt();
		
		while(rad != 0) {
			System.out.println(getNum(rad));
			
			rad = sc.nextInt();
		}

	}

}