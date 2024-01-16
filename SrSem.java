import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SrSem {
    try {
		File info = new File("SrSeminar_RawData.csv");
		Scanner fileBot = new Scanner(info);
		while (fileBot.hasNextLine()) {
			String data = fileBot.nextLine();
		}
		fileBot.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("there was an error. try to fix it or something idk.");
        e.printStackTrace();
    }
        
}
