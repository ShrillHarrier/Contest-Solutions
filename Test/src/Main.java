import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
		
public class Main {

	
		
		

			public static void main(String[] args) throws FileNotFoundException {
				
				File fl = new File("C:/Users/shril/Desktop/Java Test/Save Data.txt");
				
				PrintWriter pw = new PrintWriter(fl.getAbsolutePath());
				
				Scanner sc = new Scanner(System.in);
				
				String text = sc.next();
				
				pw.println(text);
				
				pw.close();
			
		

	}

}
