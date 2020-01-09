import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		String[] names = {"Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax"};
		int[] difs = {300, 200, 100, 0, -100};
		
		System.out.println(time + " in Ottawa");
		
		for(int i = 0; i < 5; i++) {
			int alt = time - difs[i];
			
			if(alt > 2400) {
				alt-=2400;
			}
			else if(alt < 0) {
				alt+=2400;
			}
			
			System.out.println(alt + " in " + names[i]);
		}
		
		int hrdif = time + 130;
		int mindif = Integer.parseInt(Integer.toString(hrdif).substring(Integer.toString(hrdif).length()-2,Integer.toString(hrdif).length()));
		
		//System.out.println(hrdif);
		
		//System.out.println(mindif);
		
		if(mindif >= 60) {
			int hrs = mindif/60;
			int mins = mindif%60;
			//System.out.println(hrs);
			hrdif += hrs * 100;
			//System.out.println(hrdif);
			hrdif += mins;
			hrdif -= mindif;
		}
		
		//System.out.println(hrdif);
		
		if(hrdif > 2400) {
			hrdif-=2400;
		}
		else if(hrdif < 0) {
			hrdif+=2400;
		}
		
		System.out.println((hrdif) + " in St. John's");

	}

}
