import java.util.HashMap; 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i<rounds; i++) {
			String letter = sc.next();
			
			String code = sc.next();
			
			map.put(code, letter);
		}
		
		String binset = sc.next();
		
		String toword = "";
		
		String temp = "";
		
		for(int i = 0; i < binset.length(); i++) {
			
			temp += binset.charAt(i);
			
			if(map.containsKey(temp)) {
				toword += map.get(temp);
				
				temp = "";
			}

		}
		
		System.out.println(toword);
		
	}

}
