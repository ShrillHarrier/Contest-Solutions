import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		String s2 = sc.nextLine();
		
		int[] letters1 = new int[26];
		
		int[] letters2 = new int[26];
		
		int count = 0;
		
		for(int i = 0; i<26; i++) {
			letters1[i] = 0;
			letters2[i] = 0;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			
			letters1[(int)s1.charAt(i) - 97] += 1;
			
			if(s2.charAt(i) != '*') {
				letters2[(int)s2.charAt(i) - 97] += 1;
			}
			else {
				count++;
			}
			
		}
		
		//System.out.println(count);
		
		int total = 0;
		
		for(int i = 0; i<26; i++) {
			letters1[i] -= letters2[i];
			
			//System.out.println(letters1[i]);
			
			if(letters1[i] != 0) {
				total += Math.abs(letters1[i]);
				//System.out.println(total);
			}
		}
		
		//System.out.println(total);
		
		if(count == total) {
			System.out.println("A");
		}
		else {
			System.out.println("N");
		}

	}

}
