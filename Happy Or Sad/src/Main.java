import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int happy = 0, sad = 0;
		
		String text = sc.nextLine();
		
		for(int i = 0; i < text.length() - 2; i++)
		{
			
			if(text.substring(i, i + 3).equals(":-)"))
			{
				happy++;
			}
			
			if(text.substring(i, i + 3).equals(":-("))
			{
				sad++;
			}
			
			//System.out.println(text.substring(i, i + 3));
					
		}
		
		if(happy > sad)
		{
			System.out.println("happy");
		}
		else if(happy < sad)
		{
			System.out.println("sad");
		}
		else if(happy == sad && (happy != 0 || sad != 0))
		{
			System.out.println("unsure");
		}
		else
		{
			System.out.println("none");
		}
		
		//System.out.println(text.substring(12, 15));
		
	}

}
