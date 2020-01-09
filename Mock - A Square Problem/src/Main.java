import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	/*static char[] toCharArray(String input) {
		
		char[] array = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			array[i] = input.charAt(i);
		}
		
		return array;
	}*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[][] matrix = new char[n][n];
		
		boolean latin = true;
		
		boolean reduced = true;
		
		for(int i = 0; i < n; i++) {
			
			String temp = sc.next();
			
			if(temp.chars().distinct().count() != n) {
				
				latin = false;
				
				break;
			}
			
			if(i == 0) {
				//System.out.println(temp);
				char[] tempgrid = temp.toCharArray();
				char[] tempgrid2 = temp.toCharArray();
				Arrays.sort(tempgrid);
				
				//System.out.println(tempgrid);
				//System.out.println(tempgrid2);
				
				if(Arrays.equals(tempgrid, tempgrid2) == false) {
					reduced = false; 
				}
			}
			
			for(int j = 0; j < n; j++) {
				
				matrix[i][j] = temp.charAt(j);
				
			}
		}
		
		if(latin == true) {
			
		for(int i = 0; i < n; i++) {
			
			String column = "";
			
			for(int j = 0; j < n; j++) {
				column += matrix[j][i];
			}
			
			if(column.chars().distinct().count() != n) {
				
				latin = false;
				
				break;
			}
			
			if(i == 0) {
				//System.out.println(column);
				char[] tempgrid = column.toCharArray();
				char[] tempgrid2 = column.toCharArray();
				Arrays.sort(tempgrid);
				
				//System.out.println(tempgrid);
				//System.out.println(tempgrid2);
				
				if(Arrays.equals(tempgrid, tempgrid2) == false) {
					reduced = false; 
				}
			}
			
		}

	}
		
		if(latin == true && reduced == true) {
			System.out.println("Reduced");
		}
		else if(latin == true && reduced == false) {
			System.out.println("Latin");
		}
		else {
			System.out.println("No");
		}
		
	}

}
