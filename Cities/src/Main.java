import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int list[] = new int[5];
		
		int list2[][] = new int[6][5];
		
		//distance to that city
		list[0] = 0;
		
		list[1] = sc.nextInt();
		
		list[2] = sc.nextInt();
		
		list[3] = sc.nextInt();
		
		list[4] = sc.nextInt();
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				int temp = list[i];	
				
             if(i == 0)
             {
          		  for(int k = 0; k < j + 1; k++)
          		  {
          			  temp += (list[k]);
          		  }
          		  
          		  list2[i][j] = temp;
             }
             else if(i > 0)
             {
            	 if(i > j)
            	 {
            		 temp = list2[i - 1][j] + list[i];
            		 list2[i][j] = temp;
            	 }
            	 else if(i <= j)
                  temp = list2[i - 1][j] - list[i];
            	 list2[i][j] = temp;
             }
               
				if(j == 4)
				{
					System.out.println(temp);
				}
				else
				{
				System.out.print(temp + " ");
				}
			}
		}

	}

}
