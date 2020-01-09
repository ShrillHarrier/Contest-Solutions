import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numer = sc.nextInt();
				
		double denom = sc.nextInt();
		
		String fraction = ""; 
		
		if((int)(numer/denom) != 0) {
		fraction = Integer.toString(((int)(numer/denom))) + " ";
		}
		else if(numer == 0) {
			fraction = "0";
		}
		
		double remain = numer % denom;
		
		//System.out.println(remain);
		
		if(remain != 0 && numer != 0) {
	
			for(double i = remain; i>0; i--) {		
				
				//System.out.println(numer/i - (int)numer/i);
				//System.out.println(remain/i - (int)remain/i);
				
				if(remain/i % 1 == 0 && denom/i % 1 == 0) {
					numer = remain/i;
					denom = denom/i;
					break;
				}
			}
			fraction += (int)(numer) + "/" + (int)(denom);
		}
		
		System.out.println(fraction);

	}

}
