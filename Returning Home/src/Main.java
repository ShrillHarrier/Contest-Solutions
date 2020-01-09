import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] instr = new String[10];
		
		int count = 0;
		
		//boolean[] filled = new boolean[10];
		
		/*for(int i = 0; i < 10; i++) {
			instr[i] = "0";
		}*/
		
		for(int i = 0; i < 10; i++) {
			instr[i] = sc.nextLine();
			count++;
			if(instr[i].equals("R")) {
				instr[i] = "LEFT";
			}
			else if(instr[i].equals("L")) {
				instr[i] = "RIGHT";
			}
			else if(instr[i].equals("SCHOOL")) {
				break;
			}
		}
		
		for(int i = count-2; i > - 1; i-=2) {
			if(i > 0) {
			System.out.println("Turn " + instr[i] + " onto " + instr[i-1] + " street.");
			}
			else {
				System.out.println("Turn " + instr[i] + " into your HOME.");
			}
		}
	}
}
