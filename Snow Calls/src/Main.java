import java.util.Scanner; 

public class Main {
	
	public static String toNum(char letter) {
		if(letter == 'A' || letter == 'B' || letter == 'C') {
			return "2"; }
		else if(letter == 'D' || letter == 'E' || letter == 'F') {
			return "3"; }
		else if(letter == 'G' || letter == 'H' || letter == 'I') {
			return "4"; }
		else if(letter == 'J' || letter == 'K' || letter == 'L') {
			return "5"; }
		else if(letter == 'M' || letter == 'N' || letter == 'O') {
			return "6"; }
		else if(letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
			return "7"; }
		else if(letter == 'T' || letter == 'U' || letter == 'V') {
			return "8"; }
		else {
			return "9"; }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		String[] numbers = new String[rounds+1];
		
		for(int i = 0; i<rounds; i++) {
			String number = sc.next();
			String newnumber = "";
			for(int j = 0; j<number.length(); j++) {
				if(number.charAt(j) != '-') {
				if((int)number.charAt(j) >= 65 && (int)number.charAt(j) <= 90) {
					newnumber += toNum(number.charAt(j));
				}
				else {
					newnumber += number.charAt(j);
				}
			}
			}	
			String realnum = "";
			//System.out.println("Length: "+newnumber.length());
			for(int j = 0; j<10; j++) {
				if(j == 2 || j == 5) {
				realnum += (newnumber.charAt(j)+"-");
				}
				else {
					realnum += (newnumber.charAt(j));
				}
			}
			numbers[i]=realnum;
			//System.out.println(realnum);
		}
		
		for(int i = 0; i<rounds; i++) {
			System.out.println(numbers[i]);
		}

	}

}
