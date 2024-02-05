import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SrSem {

    public ArrayList<Student> students = new ArrayList<Student>();
    //public ArrayList<Session> seminars = new ArrayList<Session>(); 
    public Session[][] schedule = new Session[5][5];
    
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
                    if (index <= 18) {
                        //seminars.add(new Session(data));
                    }
                    
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
            System.out.println("There was an error so try to fix it or something");
            e.printStackTrace();
        }

        /*
        for (Student student : students) {
            System.out.println(student);
        }
        */

    }

    public String mostPopular() {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 18; i++) {
            if (sessionsChosen[i] > max) {
                max = sessionsChosen[i];
                maxIndex = i;
            }
        }

        sort("max");

        return "Choice " + (maxIndex + 1) + " has " + max + " points and is the most popular with " + sort("max") + " votes index: " + sort("maxIndex");
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

    public void sortSession() {
        for (Session session : seminars) {

        }
    }
        
}
