import java.lang.reflect.Array;
import java.util.Arrays; 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sizes = sc.nextInt();
		
		int[] volumes = new int[sizes];
		
		int[] ws = new int[sizes];
		
		int[] hs = new int[sizes];
		
		int[] ls = new int[sizes];
		
		for(int i = 0; i<volumes.length; i++) {
			
			ws[i] = sc.nextInt();
			
			hs[i] = sc.nextInt();
			
			ls[i] = sc.nextInt();
			
			volumes[i] = ws[i]*hs[i]*ls[i];
			
		}
		
		Arrays.sort(volumes);
		
		int packs = sc.nextInt();
		
		boolean fits;
		
		for(int i = 0; i<packs; i++) {
			
			fits = false;
			
			int w = sc.nextInt();
			
			int h = sc.nextInt();
			
			int l = sc.nextInt();
			
			int packvol = w * h * l;
			
			for(int j = 0; j<volumes.length; j++) {
				
				if(packvol <= volumes[j]) {
					
					
					
					if((w <= ws[index] && h <= hs[index] && l <= ls[index]) || (l <= ws[index] && w <= hs[index] && h <= ls[index]) || (h <= ws[index] && l <= hs[index] && w <= ls[index])) {
						System.out.println(volumes[i]);
						fits = true;
						break;
					}
					
				}
				
			}
			
			if(fits == false) {
			System.out.println("Item does not fit.");
			}
		}

	}

}
