import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		String[] words = new String[rounds];
		
		for(int i = 0; i < rounds; i++) {
			
			words[i] = sc.nextLine();
			
			System.out.println(words[i].length());
			
			words[i] += "    ";
			
			System.out.println(words[i].length());
			
			for(int j = 0; j<words[i].length(); j++) {
				if(words[i].charAt(j) == ' ' && words[i].charAt(j+4) == ' ') {
					 {
						words[i] = words[i].substring(0, j) + "****" + words[i].substring(j+4, words[i].length()-1);
					}
				}
			}
			
			System.out.println(words[i]);
		}

	}

}
