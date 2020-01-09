import java.util.Scanner; 

public class Main {
	
	static boolean visited[][] = new boolean[10][9];
	static String notvisited[][] = new String[10][9];
	
	public static void dfs(int row, int col) {
		
		String val = notvisited[row][col];
		
		//System.out.println("val: " + val);
		
		visited[row][col] = true;
		
		boolean a = false;
		
		int sum = 0;
		
		if((((int)val.charAt(0) >= 65 && (int)val.charAt(0) <= 90)) && val != "*") {
			
			String[] values;
			
			if(val.length() > 2) {
				values = val.split("\\+");
			}
			else{
				values = new String[1];
				values[0] = val;
			}
			
			//System.out.println(values[0]);
			
			/*for(int i = 0; i < values.length; i++) {
				System.out.println("value: " + values[i]);
				}*/
			
			for(int i = 0; i < values.length; i++) {
				
				int x = (int)values[i].charAt(0) - (int)'A';
				int y = (int)values[i].charAt(1) - (int)'0' - 1;
				
				//System.out.println("x: " + x);
				//System.out.println("y: " + y);
				
				if(visited[x][y] && notvisited[x][y].charAt(0) >= 'A' && notvisited[x][y].charAt(0) <= 'J'){
                    a = true;
                }
                else {
                    dfs(x, y);
                }
                if (notvisited[x][y].equals("*")){
                    a = true;
                }
                if (a == true){
                    notvisited[row][col] = "*";
                    break;
                }
                
                sum += Integer.parseInt(notvisited[x][y]);
                
                if (a == false){
                    notvisited[row][col] = "" + sum;
                }
				
				//System.out.println("grid: " + notvisited[x][y]);
				
			}
			
			if(a == false) {
				notvisited[row][col] = Integer.toString(sum);
				}
			else {
				notvisited[row][col] = "*";
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 9; j++) {
				
				notvisited[i][j] = sc.next();
				
				//System.out.println(notvisited[i][j]);
				
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 9; j++) {
				
				if(visited[i][j] == false) {
					
					visited[i][j] = true;
					dfs(i, j);
					
				}
				
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 9; j++) {
				
				System.out.print(notvisited[i][j] + " ");
				
			}
			
			System.out.println();

	}
		
	}

}
