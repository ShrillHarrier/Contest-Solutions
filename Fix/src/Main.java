import java.util.Scanner;

public class Main {
	
	static String isFix(String w1, String w2, String w3) {
		
	    String result = "Yes";
	    
	    if(w1.length() >= w2.length()) {
	    	if((w1.substring(0, w2.length()).equals(w2)) || (w1.substring(w1.length() - w2.length()).equals(w2))) {
	    		result = "No";
	    	}
	    }
	    if(w1.length() >= w3.length()) {
	    	if((w1.substring(0, w3.length()).equals(w3)) || (w1.substring(w1.length() - w3.length()).equals(w3))) {
	    		result = "No";
	    	}
	    }
	    if(w2.length() >= w1.length()) {
	    	if((w2.substring(0, w1.length()).equals(w1)) || (w2.substring(w2.length() - w1.length()).equals(w1))) {
	    		result = "No";
	    	}
	    }
	    if(w2.length() >= w3.length()) {
	    	if((w2.substring(0, w3.length()).equals(w3)) || (w2.substring(w2.length() - w3.length()).equals(w3))) {
	    		result = "No";
	    	}
	    }
	    if(w3.length() >= w1.length()) {
	    	if((w3.substring(0, w1.length()).equals(w1)) || (w3.substring(w3.length() - w1.length()).equals(w1))) {
	    		result = "No";
	    	}
	    }
	    if(w3.length() >= w2.length()) {
	    	if((w3.substring(0, w2.length()).equals(w2)) || (w3.substring(w3.length() - w2.length()).equals(w2))) {
	    		result = "No";
	    	}
	    }
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		for(int i = 0; i < rounds; i++) {
			
			String w1 = sc.next();
			
			String w2 = sc.next();
			
			String w3 = sc.next();
			
			System.out.println(w1.substring(w1.length() - w3.length()).equals(w3));
			
			System.out.println(isFix(w1, w2, w3));
		}

	}

}
