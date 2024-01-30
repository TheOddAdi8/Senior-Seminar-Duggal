import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SrSem {

    public ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<Seminar> seminars = new ArrayList<Seminar>(); 
    
    public int[] sessionsChosen = new int[18];
    public int[] tempChoices = new int[5];

    public void read() {
        int index = 0;
        try {
		    File info = new File("SrSeminar_RawData.csv");
		    Scanner fileBot = new Scanner(info);
		    while (fileBot.hasNextLine()) {
                String data = fileBot.nextLine();
                if (index != 0) {
                    students.add(new Student(data));
                    tempChoices = students.get(index - 1).getAllChoices();
                    for (int i = 0; i < 5; i++) {
                        if (tempChoices[i] > 0) {
                            sessionsChosen[tempChoices[i] - 1] += 5 - i;
                        }
                    }
                }
                index++;
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

    public int sort(String option) {
        int counter = 0;
        int max = 0;
        int maxIndex = -1;
        
        for (int i = 0; i < 18; i++) {
            counter = 0;
            for (int j = 0; j < 5; j++) {
                for (Student person : students) {
                    if (person.getChoices(j) == i + 1) {
                        counter++;
                    }
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
