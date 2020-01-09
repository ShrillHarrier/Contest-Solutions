import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		String[] sa = new String[rounds];
		
		int count = 0;
		
		for(int i = 0; i<rounds; i++) {
			sa[i] = sc.next();
		}
		
		for(int i = 0; i<rounds; i++) {
			
			String ta = sc.next();
			
			if(ta.equals(sa[i])) {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
