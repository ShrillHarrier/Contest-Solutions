import java.util.Scanner; 

public class Main {
	
	static String words = "";
	
	static int oft = 0;

	static int ofs = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int runs = sc.nextInt();
	    
	    for(int count = -1; count < runs; count++)
	    {
	    	String line = sc.nextLine();
	    	
	    	  for(int count2 = 0; count2 < line.length(); count2++)
	  	    {
	  	    	char letter = line.charAt(count2);
	  	    	
	  	    	if(letter == 't' || letter == 'T')
	  	    	{
	  	    		oft++;
	  	    	}
	  	    	
	  	    	if(letter == 's' || letter == 'S')
	  	    	{
	  	    		ofs++;
	  	    	}	
	  	    }
	    }
	    
	   if(oft > ofs)
	   {
		   System.out.println("English");
	   }
	   
	   else if(ofs > oft || ofs == oft)
	   {
		   System.out.println("French");
	   }
	    
    }

}
