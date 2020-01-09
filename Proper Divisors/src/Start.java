import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
	   String[] terms = new String[100];
		
	   Scanner sc = new Scanner(System.in);
	   
	   double rounds = sc.nextDouble();
	   
	   for(double count = 0; count < rounds; count++)
	   {
		   double num = sc.nextDouble();
		   
		   double add = 0;
		   
		   for(double count2 = (num - 1); count2 > 0; count2--)
		   {
			   double div = num/count2;
			   
			   if(div - (int)div == 0)
			   {   
				   add += count2;
			   }
		   }
		   
		   	if(add < num)
		   	{
			   terms[(int) count] = (int)num + " is a deficient number.";
		    }
		   	else if(add == num)
		   	{
		   		terms[(int) count] = (int)num + " is a perfect number.";
		   	}
		   	else if (add > num)
		   	{
		   		terms[(int) count] = (int)num + " is an abundant number.";
		   	}
	   }
	   
	   for(double count = 0; count < rounds; count++)
	   {
		   System.out.println(terms[(int) count]);
	   }

	}

}
