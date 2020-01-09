import java.util.Scanner; 

public class Main {
	
	public static int getIndex(String[] arr, String word) {
		
		//System.out.println(arr);
		//System.out.println(word);
		
		for(int i = 0; i<arr.length; i++) {
			//System.out.println(arr[i]);
		    //System.out.println(arr[i].equals(word));
			if(arr[i].equals(word)) {
				return i;
			}
		}
		return 0; 	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int amount = sc.nextInt();
		
		String[] parta = new String[amount];
		
		String[] partb = new String[amount];
		
		for(int i = 0; i<amount; i++) {
			parta[i] = sc.next();
		}
		
		for(int i = 0; i<amount; i++) {
			partb[i] = sc.next();
		}
		
		String result = "good";
		
		/*if(parts[0].length % 2 != 0) {
			for(int i = 0; i<parts.length/2 + 1; i++) {
				if(parts[0][i] != parts[1][getIndex(parts[0], parts[1][i])]) {
					result = "bad";
				}
			}
		}*/
		//else {
			for(int i = 0; i<parta.length; i++) {
				//System.out.println(getIndex(parta, partb[i]));
				if((parta[i].equals(partb[getIndex(parta, partb[i])]) == false) || parta[i].equals(partb[i])) {
					result = "bad";
				}
		//}

	}
			System.out.println(result);
	}
	
}
