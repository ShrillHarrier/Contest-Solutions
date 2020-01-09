import java.util.Arrays; 
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		int[] tides = new int[rounds];
		
		for(int i = 0; i<rounds; i++) {
			
			tides[i] = sc.nextInt();
		}
		
		Arrays.sort(tides);
		
		int[] low;
		
		int[] high = new int[rounds/2];
		
		if(rounds % 2 != 0) {
			
		low = new int[rounds/2 + 1];
		
		for(int i = 0; i<rounds/2+1; i++) {
			low[i] = tides[i];
		}
		for(int i = 0; i<rounds/2; i++) {
			high[i] = tides[i + rounds/2 + 1];
		}
		}
		else {
			
	    low = new int[rounds/2];
	    
	    for(int i = 0; i<rounds/2; i++) {
			low[i] = tides[i];
			high[i] = tides[i + rounds/2];
		}  
		}
		
		/*for(int i = 0; i<rounds/2; i++) {
			System.out.print(low[i]+" ");
		}*/
		
		for(int i = 0; i<rounds/2; i++) {
			if(rounds % 2 != 0) {
			System.out.print(low[(rounds/2)-i] + " ");
			}
			else {
			System.out.print(low[(rounds/2-1)-i] + " ");
			}
			System.out.print(high[i] + " ");
		}
		
		if(rounds % 2 != 0) {
			System.out.print(low[0]);
		}
		
	}

}
