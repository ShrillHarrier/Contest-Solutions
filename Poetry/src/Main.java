import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int poems = sc.nextInt();
		
		String[][] lines = new String[poems][4];
		
		String vowels = "aeiou";
		
		for(int i = 0; i < poems; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				if(i == 0 && j == 0) {
					sc.nextLine();
				}
				
				lines[i][j] = sc.nextLine();
				
				//System.out.println(lines[i][j]);
				
			}
		}
		
		//System.out.println(lines[0][1]);
		
		for(int i = 0; i < poems; i++) {
			
			String[] endings = {"","","",""};
			
			for(int j = 0; j < 4; j++) {
				
				boolean firstv = false;
				boolean lastv = false;
				
				for(int k = lines[i][j].length()-1; k > -1; k--) {
					
					if(vowels.contains(lines[i][j].charAt(k)+"")) {
						firstv = true;
					}
					
					if((vowels.contains(lines[i][j].charAt(k)+"") == false  || lines[i][j].charAt(k) == ' ') && firstv == true) {
						lastv = true;
					}
					
					if(firstv == true && lastv == true) {
						break;
					}
					
					endings[j] += lines[i][j].charAt(k);
					
					//System.out.println(endings[j-1]);
					//System.out.println(firstv);
					//System.out.println(lastv);
					
				}
				
			}
			
			if(endings[0].equals(endings[1]) && endings[1].equals(endings[2]) && endings[2].equals(endings[3])) {
				System.out.println("perfect");
			}
			else if(endings[0].equals(endings[1]) && endings[2].equals(endings[3])) {
				System.out.println("even");
			}
			else if(endings[0].equals(endings[2]) && endings[1].equals(endings[3])) {
				System.out.println("cross");
			}
			else if(endings[0].equals(endings[3]) && endings[1].equals(endings[2])) {
				System.out.println("shell");
			}
			else {
				System.out.println("free");
			}
			
		}

	}

}