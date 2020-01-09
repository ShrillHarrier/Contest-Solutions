import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ann = sc.nextInt();
				
		int eye = sc.nextInt();
		
		if (ann >= 3 && eye <= 4)
		{
			System.out.println("TroyMartian");
		}
		
		if (ann <= 6 && eye >= 2)
		{
			System.out.println("VladSaturnian");
		}
		
		if (ann <= 2 && eye <= 3)
		{
			System.out.println("GraemeMercurian");
		}

	}

}
