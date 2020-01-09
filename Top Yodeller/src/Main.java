import java.util.Arrays; 
import java.util.Scanner;

public class Main {
	
	static int ppl;
	static int rounds;
	
	public static void reverse(int[] data) {
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}
	
	public static String index(int[] array, int value) {
		
		String indexes = "";
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				indexes += Integer.toString(i+1) + " ";
			}
		}
		
		//System.out.println(indexes);
		
		return indexes; 
	}
	
	public static int worst(int[][] array, int person) {
		
		int lowest = 0;
		
		int[] temp = new int[ppl];
		
		for(int i = 0; i < rounds; i++) {
			
			for(int j = 0; j < ppl; j++) {
				
				if(i == 0) {
				temp[j] = array[i][j];
				//temp2[j] = array[i][j];
				}
				else {
					temp[j] += array[i][j];
					//temp2[j] += array[i][j];
				}
				
				System.out.print(temp[j] + " ");
				
			}
			
			int[] temp2 = temp;
			
			Arrays.sort(temp2);
			reverse(temp2);
			System.out.print("Sample: ");
			for(int k = 0; k < temp2.length; k++) {
				System.out.print(temp2[k]+" ");
			}
			System.out.println();
			String index = index(temp2, temp[person]);
			System.out.println("index: " + index);
			String[] indexes = index.split(" ");
			//System.out.println(index); 
			
			for(int j = 0; j < indexes.length; j++) {
				System.out.println(indexes[j]); 
			}
			
			int place = Integer.parseInt(indexes[0]);
			
			System.out.println(place);
			
			if(lowest < place) {
				lowest = place;
			}
			
		}
		
		return lowest;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ppl = sc.nextInt();
		rounds = sc.nextInt();
		
		//System.out.println(ppl + " " + rounds);
		
		int scores[][] = new int[rounds][ppl];
		//int lowest[] = new int[ppl]; 
		//int ranks[][] = new int[rounds][ppl];
		int sums[] = new int[ppl];
		int sums2[] = new int[ppl];
		
		for(int i = 0; i < rounds; i++) {
			for(int j = 0; j < ppl; j++) {
				
				scores[i][j] = sc.nextInt();
				
				if(i == 0) {
					sums[j] = scores[i][j];
					sums2[j] = scores[i][j];
					//if(lowest[])
				}
				else {
					sums[j] += scores[i][j];
					sums2[j] += scores[i][j];
				}
				
			}
			
		}
		
		Arrays.sort(sums);
		String num = index(sums2, sums[ppl - 1]);
		String[] nums = num.split(" ");
		
		int best = sums[ppl - 1];
		//int worst =
		
		if(nums.length == 1) {
		int worst = worst(scores, Integer.parseInt(nums[0])-1);
		System.out.println("Yodeller " + num + "is the TopYodeller: score " + best + ", worst rank " + worst);
		}
		else {
			for(int i = 0; i < nums.length; i++) {
				int worst = worst(scores, Integer.parseInt(nums[i])-1);
				/*while(num.charAt(i) != ' ') {
					 worsts[i] += num.charAt(i);
				}*/
				//System.out.println(num);
				System.out.println("Yodeller " + nums[i] + " is the TopYodeller: score " + best + ", worst rank " + worst);
			}
		}
	}
}
