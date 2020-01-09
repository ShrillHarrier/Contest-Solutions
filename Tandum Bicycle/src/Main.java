import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int question = sc.nextInt();
		
		int rounds = sc.nextInt();
		
		int[] d = new int[rounds];
		
		int[] p = new int[rounds];
		
	    for(int i = 0; i<rounds; i++) {
	    	d[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i<rounds; i++) {
	    	p[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(d);
	    Arrays.sort(p);
	    
	    int sum = 0;
	    
	    if(question == 1) {
	    	
	    	for(int i = 0; i<rounds; i++) {
	    		sum += Math.max(d[i], p[i]);
	    	}
	    	
	    	System.out.println(sum);
	    }
	    else if(question == 2) {
	    	
	    	//Collections.reverse(Arrays.asList(p));
	    	
	    	for(int i = 0; i<rounds; i++) {
	    		sum += Math.max(d[i],p[(rounds-1)-i]);
	    	}
	    	
	    	System.out.println(sum);
	    }

	}

}
