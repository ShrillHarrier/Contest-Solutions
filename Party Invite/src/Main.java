import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int friends = sc.nextInt();
		int rounds = sc.nextInt();
		
		int[][] list = new int[11][friends];
		//int[] newlist = new int[friends];
		
		for(int i = 0; i<friends; i++) {
			list[0][i] = (i+1);
			//System.out.println(i+1);
		}
		
		//int count = 0;
		
		for(int i = 0; i < rounds; i++) {
			int remove = sc.nextInt();
			//System.out.println("List");
			int count = 0;
			for(int j = 0; j<friends; j++) {
				if(((j+1) % remove) != 0) {
			    list[i+1][count] = list[i][j];
			    //System.out.println(list[i+1][j]);
			    count++;
				}
			}
		}
		
		//System.out.println("Count " + count);
		
		for(int i = 0; i<friends; i++) {
			if(list[rounds][i] != 0) {
			System.out.println(list[rounds][i]);
			}
		}
	}
}
