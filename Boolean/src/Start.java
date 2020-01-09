import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		String word;
		
		Scanner sc = new Scanner(System.in);
		
		word = sc.next();
		
		int bool = word.length();
		
	    double bool2 = (bool - 5);
	    
	    int end = word.indexOf(bool - 1, bool);

	}

}
