import java.util.Scanner;

public class Main {
	
	/*public boolean xin(String array[]) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals("X")){
				return true;
			}
			return false;
		}
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] grid = new String[3][3]; 
		int count = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] = sc.next();
				if(grid[i][j].equals("X")) {
					count++;
				}
			}
		}
		
		int found = 0;
		
		if(count == 1) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(grid[i][j].equals("X")) {
						if(j == 0) {
							int newnum = Integer.parseInt(grid[i][j+1]) - ((Integer.parseInt(grid[i][j+2]) - Integer.parseInt(grid[i][j+1])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 1) {
							int newnum = (Integer.parseInt(grid[i][j-1]) + (Integer.parseInt(grid[i][j+1])))/2;
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 2) {
							int newnum = Integer.parseInt(grid[i][j-1]) + ((Integer.parseInt(grid[i][j-1]) - Integer.parseInt(grid[i][j-2])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
						}
				}
			}
				if(found == 1) {
					break;
				}
		}
		}
		else if(count == 2) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(grid[i][j].equals("X")) {
						if(j == 0) {
							int newnum = Integer.parseInt(grid[i][j+1]) - ((Integer.parseInt(grid[i][j+2]) - Integer.parseInt(grid[i][j+1])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 1) {
							int newnum = (Integer.parseInt(grid[i][j-1]) + (Integer.parseInt(grid[i][j+1])))/2;
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 2) {
							int newnum = Integer.parseInt(grid[i][j-1]) + ((Integer.parseInt(grid[i][j-1]) - Integer.parseInt(grid[i][j-2])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
						}
				}
			}
				if(found == 2) {
					break;
				}
		}
		}
		else if(count == 3) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(grid[i][j].equals("X")) {
						if(j == 0) {
							int newnum = Integer.parseInt(grid[i][j+1]) - ((Integer.parseInt(grid[i][j+2]) - Integer.parseInt(grid[i][j+1])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 1) {
							int newnum = (Integer.parseInt(grid[i][j-1]) + (Integer.parseInt(grid[i][j+1])))/2;
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
					}
						else if(j == 2) {
							int newnum = Integer.parseInt(grid[i][j-1]) + ((Integer.parseInt(grid[i][j-1]) - Integer.parseInt(grid[i][j-2])));
							found++;
							grid[i][j] = Integer.toString(newnum);
							break;
						}
				}
			}
				if(found == 3) {
					break;
				}
		}
		}
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.println("");
			}
		
		/*String[][] rows;
		String[][] cols;
		
		if(count != 0) {
			rows = new String[count][3];
			cols = new String[count][3];
		
		for(int i = 0; i < 3; i++) {
			String[] temp = new String[3];
			boolean hasx = false;
			
			for(int j = 0; j < 3; j++) {
				temp[j] = grid[i][j];
				if(grid[i][j].equals("X")) {
					hasx = !hasx; 
				}
			}
			
			if(hasx == true) {
				for(int j = 0; j < 3; j++) {
					rows[i][j] = grid[i][j]; 
				}
			}
		}*/
		}
	}