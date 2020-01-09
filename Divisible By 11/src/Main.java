import java.util.Scanner;

public class Main {
	
	public static String alg(String num) {
		if(num.length() >= 4) {
			
			String newnum = num.substring(0, num.length()-4);
			
			int last = Integer.parseInt(num.substring(num.length()-4, num.length()-1));
			
			int sub = Integer.parseInt(num.substring(num.length()-1, num.length()));
			
			String end = Integer.toString(last - sub);    
			
			if(end.length() == 1) {
				end = "00" + end;
			}
			
			return newnum + end;
			
		}
		
		return "Not";

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		for(int i = 0; i<rounds; i++) {
			String num = sc.next();
			
			String tempnum = num;
			
			while(tempnum.equals("11") == false && alg(tempnum).equals("Not") == false) {
				System.out.println(tempnum);
				
				tempnum = alg(tempnum);
			}
			
			if(tempnum.equals("11")) {
				System.out.println("The number " + num + " is divisible by 11.");
			}
			else {
				System.out.println("The number " + num + " is not divisible by 11.");
			}
		}

	}

}
