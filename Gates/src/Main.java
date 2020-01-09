import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gates = sc.nextInt();
		int planes = sc.nextInt();
		
		int[] gatelist = new int[gates];
		int[] wantedgate = new int[planes];
		
		boolean[] filled = new boolean[gates];
		boolean closed = false;
		
		int count = 0;
		
		for(int i = 0; i < gates; i++) {
			gatelist[i] = i+1;
		}
		
		for(int i = 0; i < planes; i++) {
			wantedgate[i] = sc.nextInt();
		}
		
		for(int i = 0; i < planes; i++) {
			
			if(closed == true) {
				break;
			}
			
			for(int j = wantedgate[i]; j > 0; j--) {
				
				//System.out.println("wanted gate: " + wantedgate[i]);
				
				if(filled[wantedgate[i]-1] == false)
				{
					count ++;
					//System.out.println("count: " + count);
					filled[wantedgate[i]-1] = true;
					break;
				}
				else {
					wantedgate[i]--;
				}
				
				if(j == 1) {
					closed = true;
				}
				
				//System.out.println(closed);
				//System.out.println("j: " + j);
				
				//System.out.println(wantedgate[i]);
		
			}

		}
		
		System.out.println(count);

}
	
}
