import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
	    String[] list;
	    
	    list = new String[100];
		
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		
		for(int count = 0; count < (lines + 1); count++)
		{
			String game = sc.nextLine();
			
			if(game.contains("XXX") == true && game.contains("OOO") == true)
			{
				list[count] = "no";
			}
			else
			{
				list[count] = "yes";
			}
		}
		
		int lines2 = (lines - 1);
		
		for( ; lines2 > 0; (lines2)--)
		{
			System.out.println(list[lines2]);
		}

	}

}
