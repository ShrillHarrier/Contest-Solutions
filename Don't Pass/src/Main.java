import java.util.Scanner;

public class Main {
	
	static long fac(int n){    
		  if (n == 0) {    
		    return 1;
		  }
		  else {
		    for(int i = (n-1); i>0; i--) {
		    	n *= i;
		    }
		    return n;
		  }
		 }    

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int oneless = num-1;
		
		/*System.out.println(oneless);
		
		System.out.println(fac(oneless));*/
		
		int result = ((oneless)*(oneless-1)*(oneless-2))/6;
		
		System.out.println(result);

	}

}
