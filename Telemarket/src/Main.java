import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     int num1 = sc.nextInt();
     
     int num2 = sc.nextInt();
     
     int num3 = sc.nextInt();
     
     int num4 = sc.nextInt();
     
     if(num2 == num3 && ((num1 == 8 || num1 == 9) && (num4 == 8 || num4 == 9)))
     {
    	 System.out.println("ignore");
     }
     else
     {
    	 System.out.println("answer");
     }

	}

}
