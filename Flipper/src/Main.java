import java.util.Scanner;

public class Main {
	
	public static int[][] reverse(int[][] array, char axis) {
		
		int[][] temp = new int[2][2];
		
		if(axis == 'V') {
			for(int i = 0; i < 2; i++) {
				for(int j = 1; j > -1; j--) {
					temp[i][j] = array[i][1-j];
				}
			}
		}
		else if(axis == 'H') {
			for(int i = 1; i > -1; i--) {
				for(int j = 0; j < 2; j++) {
					temp[i][j] = array[1-i][j];
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String series = sc.next();
		
		int[][] grid = new int[2][2];
		int count = 1;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				grid[i][j] = count;
				count++;
			}
		}
		
		for(int i = 0; i < series.length(); i++) {
			grid = reverse(grid, series.charAt(i));
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}

	}

}
