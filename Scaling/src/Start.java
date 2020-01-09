import java.util.Scanner; 

public class Start {
	
	static void top(int rows)
	{
		int save = rows;
		
		for( ; rows > 0; rows--)
		{
		System.out.print("*");
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
			System.out.print("x");
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
		System.out.print("*");
		}
		
		System.out.println();
	}
	
	static void middle(int rows)
	{
		int save = rows;
		
		for( ; rows > 0; rows--)
		{
		System.out.print(" ");
		}
		
		rows = save;
		
		for(int x = rows * 2 ; x > 0; x--)
		{
			System.out.print("x");
		}
		
		System.out.println();
	}
	
	static void bottom(int rows)
	{
		int save = rows;
		
		for( ; rows > 0; rows--)
		{
		System.out.print("*");
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
			System.out.print(" ");
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
		System.out.print("*");
		}
		
		System.out.println();
	}
	
	static void icon(int rows)
	{
		int save = rows;
		
		for( ; rows > 0; rows--)
		{
			top(save);
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
			middle(save);
		}
		
		rows = save;
		
		for( ; rows > 0; rows--)
		{
			bottom(save);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		icon(rows);
	}

}
