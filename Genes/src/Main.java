import java.util.Scanner; 
public class Main {
	
	public static boolean isUp(char x){
		int num = (int)x;
		if(num >= 65 && num <=90) {
		//System.out.println(num);
		return true;
		}
		else {
			//System.out.println(num);
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String male = sc.nextLine();
		String female = sc.nextLine();
		
		String[] genes = new String[5];
		
		for(int i = 0; i < 10; i+=2) {
			if((isUp(male.charAt(i)) == true && isUp(male.charAt(i+1)) == true) || (isUp(female.charAt(i)) == true && isUp(female.charAt(i+1)) == true)) {
				genes[i/2] = "d";
			}
			else if((isUp(male.charAt(i)) == true && isUp(female.charAt(i)) == false) || (isUp(male.charAt(i)) == false && isUp(female.charAt(i)) == true)) {
				genes[i/2] = "e";
			}
			else if(isUp(male.charAt(i)) == false && isUp(female.charAt(i)) == false) {
				genes[i/2] = "r";
			}
			//System.out.println(genes[i/2]);
		}
		
		int tries = sc.nextInt();
		String[] result = new String[tries];
		
		for(int i = 0; i<tries; i++) {
			String test = sc.next();
			//System.out.println(test);
			for(int j = 0; j<5; j++) {
				if((genes[j] == "d" && isUp(test.charAt(j)) == false) || (genes[j] == "r" && isUp(test.charAt(j)) == true)){
					result[i] = "Not their baby!";
					break;
				}
				else {
					result[i] = "Possible baby.";
				}
			}
		}
		
		for(int i = 0; i<tries; i++) {
			System.out.println(result[i]);
		}

	}

}
