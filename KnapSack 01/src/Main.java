import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            if(n1 > 0 && n2 > 0){
                sum += n1; 
            }
        }
        
        System.out.println(sum);
        
    }
}