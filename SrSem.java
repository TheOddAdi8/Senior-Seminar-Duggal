import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SrSem {

    public ArrayList<String[]> list = new ArrayList<String[]>();

    public void read() {
        try {
		    File info = new File("SrSeminar_RawData.csv");
		    Scanner fileBot = new Scanner(info);
		    while (fileBot.hasNextLine()) {
		    	String data = fileBot.nextLine();
                list.add(data.split(","));
            }
		    fileBot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("there was an error. try to fix it or something idk.");
            e.printStackTrace();
        }

        System.out.println(list.get(0)[0]);
    }

    
        
}
