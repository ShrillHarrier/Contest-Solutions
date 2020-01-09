import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int boundx = sc.nextInt();
		
		int boundy = sc.nextInt();
		
		int x = 0;
		
		int y = 0;
		
		int movex = sc.nextInt();
		
		int movey = sc.nextInt();
		
		while(movex != 0 || movey != 0) {
			
			x = movex + x;
			y = movey + y;
			
			if(boundx >= 0) {
			if(x > boundx) {
				x = boundx;
			}
			else if(x < 0) {
				x = 0;
			}
			}
			else if(boundy < 0){
				if(x < boundx) {
					x = boundx;
				}
				else if(x > 0) {
					x = 0;
				}	
			}
			
			if(boundx >= 0) {
			if(y > boundy) {
				y = boundy;
			}
			else if(y < 0){
				y = 0;
			}
			}
			else if(boundy < 0) {
				if(y < boundy) {
					y = boundy;
				}
				else if(y > 0){
					y = 0;
				}
			}
			
			System.out.println(x + " " + y);
			
			movex = sc.nextInt();
			movey = sc.nextInt();
		}

	}

}
