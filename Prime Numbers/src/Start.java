import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(true)
		{
			int count = (num - 1);
		
		for(; count > 1; count --)
		{
		    double div = num/count;
		    
		    if(div - (int)div == 0)
		    {
		    	break;
		    }
		}
		
		if(count == 2)
		{
			break;
		}
		
		num++;
		
		}

	}

}
