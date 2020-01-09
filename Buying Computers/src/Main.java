import java.util.Arrays; 
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		int rounds = sc.nextInt();
		
		int[] scores = new int [rounds];
		
		for(int i = 0; i<rounds; i++) {
			
			String name = sc.next();
			
			int r = sc.nextInt();
			
			int s = sc.nextInt();
			
			int d = sc.nextInt();
			
			scores[i] = 2*r + 3*s + d;
			
			if(map.containsKey(scores[i]) == false) {
			map.put(scores[i], name);
			}
			else {
				map.put(scores[i], map.get(scores[i]) + " " + name);
			}
		}
		
		Arrays.sort(scores);
		
		if(rounds != 0) {
		if(map.get(scores[scores.length-1]).contains(" ")) {
			String tops[] = {map.get(scores[scores.length-1]).substring(0, map.get(scores[scores.length-1]).indexOf(" ")), map.get(scores[scores.length-1]).substring(map.get(scores[scores.length-1]).indexOf(" ") + 1, map.get(scores[scores.length-1]).length())};
			
			if(tops[0].contains(tops[1])) {
				System.out.println(tops[1]);
				
				System.out.println(tops[0]);
			}
			else if(tops[1].contains(tops[0])) {
                System.out.println(tops[0]);
				
				System.out.println(tops[1]);
			}
			else {
			Arrays.sort(tops);
			
			System.out.println(tops[0]);
				
			System.out.println(tops[1]);
			}
		}
		else {
		if(scores.length >= 1) {
		System.out.println(map.get(scores[scores.length-1]));
		}
		
		if(scores.length >= 2) {
		if(map.get(scores[scores.length-2]).contains(" ")) {
		System.out.println(map.get(scores[scores.length-2]).substring(0, map.get(scores[scores.length-2]).indexOf(" ")));
		}
		else {
			System.out.println(map.get(scores[scores.length-2]));
		}
		}
		}
		}
	}
}
