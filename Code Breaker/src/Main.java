import java.util.Scanner; 

public class Main {
	
	public static boolean inArray(String array, char letter) {
		boolean in = false;
		
		for(int i = 0; i<array.length(); i++) {
			if(array.charAt(i) == letter) {
				in = true;
			}
		}
		
		return in;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String plaintext = sc.nextLine();
		
		String ciphertext = sc.nextLine();
		
		String encode = sc.nextLine();
		
		String decode = "";
		
		for(int i = 0; i<encode.length(); i++) {
			
			if(inArray(ciphertext, encode.charAt(i)) == false) {
				decode += '.';
			}
			else {
				decode += plaintext.charAt(ciphertext.indexOf(encode.charAt(i)));
			}
		}
		
		System.out.println(decode);

	}

}
