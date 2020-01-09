import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int shift = sc.nextInt();
		
		String mes = sc.next();
		
		char ascii[] = new char[mes.length()];
		
		for(int i = 0; i < mes.length(); i++)
		{ 
			
	    int temp = (int)mes.charAt(i);
	    
	    int move = 3 * (i + 1) + shift;
	    
	    //int decode = 26 - move;
	    
	    if((temp - move) < 65)
	    {
	    	temp = 91 - (move - (temp - 65));
	    }
	    else
	    {
	    	temp -= move;
	    }
	    
	    ascii[i] = (char)temp;
	    
	    }
		
		for(int i = 0; i < mes.length(); i++)
		{
			System.out.print(ascii[i]);
		}
	}

}
