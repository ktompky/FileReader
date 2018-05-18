package formatter;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReader {

	public static void main(String[] args) 
						throws FileNotFoundException
						{
		File file = new File("C:\\Users\\Missmeer\\eclipse-workspace\\MLSformatter\\src\\formatter\\rmls.xml");
		Scanner sc = new Scanner(file);
		
		
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();
	}

}
