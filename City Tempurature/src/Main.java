import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] cities = new String[10000];
		
		int[] tempuratures = new int[10000];
		
		cities[0] = sc.nextLine();
		
		int count = 0;
		
		while(cities[count].contains("Waterloo") == false) {
			count++;
			cities[count] = sc.nextLine();
			//tempuratures[count] = sc.nextInt();
			
			//System.out.println(cities[count]);
		}
		
		String[] substring = new String[count];
		
		for(int i = 0; i<count; i++) {
			for(int j = 0; j<cities[i].length(); j++) {
				if(cities[i].charAt(j) == ' ') {
					substring[i] = cities[i].substring(0,j);
					tempuratures[i] = Integer.parseInt((cities[i].substring(j+1, cities[i].length())));
					//System.out.println(tempuratures[i]);
				}
			}
		}
		
		int min = tempuratures[0];
		int index=0;
		for(int i=1; i<count; i++){
	           if(tempuratures[i] < min ){
	               min = tempuratures[i];
	               index = i;
	           }
		}
		
		System.out.println(substring[index]);
	}

}
