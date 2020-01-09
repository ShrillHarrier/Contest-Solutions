import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int datanum = sc.nextInt();
		
		for(int i = 0; i<datanum; i++) {
			int subnum = sc.nextInt();
			
			int verbnum = sc.nextInt();
			
			int objnum = sc.nextInt();
			
			String[] subjects = new String[subnum];
			
			String[] verbs = new String[verbnum];
			
			String[] objects = new String[objnum];
			
			String[] phrases = new String[subnum*verbnum*objnum];
			
			for(int j = 0; j<subnum; j++) {
				String temp = sc.nextLine() + " ";
				//System.out.print("S: ");
				subjects[i] = sc.nextLine() + " ";
				//System.out.println(subjects[j]);
			}
			
			for(int j = 0; j<verbnum; j++) {
				//System.out.print("V: ");
				verbs[j] = sc.nextLine() + " ";
				//System.out.println(verbs[j]);
			}
			
			for(int j = 0; j<objnum; j++) {
				//System.out.print("O: ");
				objects[j] = sc.nextLine() + ".";
				//System.out.println(objects[j]);
			}
			
			int count = 0;
			
			for(int j = 0; j<subnum; j++) {
				for(int k = 0; k<verbnum; k++) {
					for(int l = 0; l<objnum; l++) {
						phrases[count] = subjects[j] + verbs[k] + objects[l];
						count++;
					}
				}
			}
			
			Arrays.sort(phrases, String.CASE_INSENSITIVE_ORDER);
			
			for(int j = 0; j<count; j++) {
				System.out.println(phrases[j]); 
			}
			
			System.out.println();
		}

	}

}
