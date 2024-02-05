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

		while (GrandMaster.fileBot.hasNextLine()) {
            String data = GrandMaster.fileBot.nextLine();
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
        students.remove(0);

        /*
        for (Student student : students) {
            System.out.println(student);
        }
        */

    }

    public int mostPopular(String option) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 18; i++) {
            if (sessionsChosen[i] > max) {
                max = sessionsChosen[i];
                maxIndex = i;
            }
        }

        sort("max");

        if (option.equals("max")) {
            return max;
        }
        else {
            return maxIndex;
        }

        //return "Choice " + (maxIndex + 1) + " has " + max + " points and is the most popular with " + sort("max") + " votes index: " + sort("maxIndex");
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
        int index;
        int peopleCounter = 0;
        int counter2 = 0;
        int time = 0;
        boolean emptySession = false;
        int room = -1;

        index = mostPopular("maxIndex");
        

        /*for (int i = 0; i < 5; i++) { //each choice
            outerLoop: //label
            for (Student person : students) { //for each person in students ArrayList
                if (person.getChoices(i) == index + 1) { //If the person chose the most popular semnar
                    */for (int r = 0; r < 5; r++) { //row r
                        emptySession = false;
                        room = -1;
                        for (int c = 0; c < 5; c++) { //column c
                            if (schedule[r][c].getID() != index + 1) { //if the same session is NOT occurring at the same time
                                counter2 += 1; //counts when the sessions aren't the same
                                break;
                            }
                            if (schedule[r][c].getID() == 0) { //if there isn't a session in that specific time slot
                                emptySession = true;
                                if (room == -1) {
                                    room = c;
                                }
                            }
                        }
                        if (counter2 == 5) { //if the same session is NOT ocurring at the same time
                            if (emptySession == true) { //if there is an empty session
                                time = r;
                                //room
                                schedule[time][room] = new Session(index);
                                OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                            }
                        }
                    }
                /*}
                else {
                    continue outerLoop;
                }
            }
        }*/
    }
        
}
