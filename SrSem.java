import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SrSem {

    public ArrayList<Student> students = new ArrayList<Student>();

    public void read() {
        try {
		    File info = new File("SrSeminar_RawData.csv");
		    Scanner fileBot = new Scanner(info);
		    while (fileBot.hasNextLine()) {
		    	String data = fileBot.nextLine();
                students.add(new Student(data));
            }
		    fileBot.close();
            students.remove(0);
        }
        catch (FileNotFoundException e) {
            System.out.println("there was an error. try to fix it or something idk.");
            e.printStackTrace();
        }

        /*
        for (Student student : students) {
            System.out.println(student);
        }
        */
    }

    public int sort(int choice, String option) {
        choice -= 1;
        int counter;
        int max = 0;
        int maxIndex = -1;
        
        for (int i = 0; i < 18; i++) {
            counter = 0;
            for (Student person : students) {
                if (person.getChoices(choice) == i + 1) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                maxIndex = i + 1;
                
            }
        }

        if (option.equals("max")) {
            return max;
        }
        else {
            return maxIndex;
        }
}    
        
}
