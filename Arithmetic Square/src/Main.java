import java.util.Scanner;

public class Main {
	
	static String[][] grid = new String[3][3];
	
	public static void dfs(boolean[][] visited, int count, int i, int j) {
		System.out.println(i + " " + j);
		if(i >= 0 && i <=2 && j >= 0 && j <= 2) {	
			if(grid[i][j].equals("X") == false && visited[i][j] == false) {
				int count2 = Integer.parseInt(grid[i][j]) - count;
				
				dfs(visited, count2, i+1, j);
				dfs(visited, count2, i-1, j);
				dfs(visited, count2, i, j-1);
				dfs(visited, count2, i, j+1);
			}
			else if(visited[i][j] == false){
				grid[i][j] = Integer.toString(count);
			}
			
			visited[i][j] = true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] = sc.next();
			}
		}
		
		boolean visited[][] = new boolean[3][3];
		
		dfs(visited, 0, 0, 0);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(grid[i][j] + " ");
			}
			System.out.print("");
		}

	}

}
