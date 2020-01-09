import java.util.Scanner; 

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double current = sc.nextInt();
		
		double ideal = sc.nextInt();
		
		double examweight = sc.nextInt();
		
		double courseweight = (1 -(examweight/100));
		
		double before = (current * courseweight);
		
		double exammark = (((ideal - 0.5) - before)/(examweight/100));
		
		if(exammark < 0)
		{
			System.out.println("0");
		}
		
		else if(exammark < 100.5)
		{
			//System.out.println("*" + exammark);
			System.out.println(Math.round(exammark));
		}
		
		else
		{
			//System.out.println("*" + exammark);
			System.out.println("DROP THE COURSE");
		}

	}

}
