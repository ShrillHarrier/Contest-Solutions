import java.util.Scanner; 

public class Main {
	
	public static boolean isprime(int num) {
        for (int i = 2; i <= Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		int[] nums = new int[rounds];
		
		int[][] data = new int[rounds][2];
		
		for(int k = 0; k < rounds; k++) {
			nums[k] = sc.nextInt();
			
			int total = nums[k]*2;
			//System.out.println(total);
			boolean found = false;
			
			for(int i = 2; i < total-1; i++) {
				if(isprime(i) && isprime(total-i)) {
					/*for(int j = total-2; j > 2; j--) {
						//System.out.println(i + " " + j);
						if(isprime(j) && i+j == total) {*/
							data[k][0] = i;
							data[k][1] = total-i;
							//found = true;
							break;
						}
					}
					/*if(found == true) {
						break;
					}*/
				}
			//}
		//}
		
		for(int i = 0; i < rounds; i++) {
			System.out.println(data[i][0] + " " + data[i][1]);
		}
	}
}
