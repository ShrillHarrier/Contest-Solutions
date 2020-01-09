import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int guests = sc.nextInt();
		
		int removals = sc.nextInt();
		
		int[][] list = new int[guests][guests];
		
		for(int i = 0; i < guests; i++)
		{
		     list[0][i] = i + 1;
		     
		}
		
		/*for(int i = 0; i < guests; i++)
		{
			System.out.println("Ele: " + list[0][i]);
		}*/
		
		for(int i = 0; i < removals; i++)
		{
			int skip = sc.nextInt();
			
			int count = 0;
			
			for(int j = 0; j < guests; j++)
			{
				if((j + 1) % skip != 0) 
				{
				list[i + 1][count] = list[i][j];
				
				count++;
				}
						
				//guests--;
				
			}
			
			/*for(int k = 0; k < guests; k++)
			{
				System.out.println("Ele: " + list[i + 1][k]);
			}*/
				
		}
		
		for(int i = 0; i < guests; i++)
		{
			if(list[removals][i] != 0)
			{
			System.out.println(list[removals][i]);
			}
		}

	}

}
