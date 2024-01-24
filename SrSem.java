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

    public void sort(int choice) {
        int counter;
        int max;
        int maxIndex;
        
        for (int i = 1; i <= 18; i++) {
            counter = 0;
            for (Student student : students) {
                if (student.getChoices(choice) == i) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                
            }
        }
}    
        
}
