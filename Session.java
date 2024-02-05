import java.util.ArrayList;
import java.util.Arrays;

public class Session {
    private String sessionName;
    private int sessionID;
    private String presenter;

    public String[] arrInfo = new String[11];

    public ArrayList<String> info;
    public ArrayList<Student> seminarPeople = new ArrayList<Student>();

    public Session(int ID) {
        
        arrInfo = information.split(",");
        info = new ArrayList<String>(Arrays.asList(arrInfo));

        for (int i = 0; i < 8; i++) {
            info.remove(0);
        }

        sessionName = info.get(0);
        sessionID = Integer.parseInt(info.get(1));
        presenter = info.get(2);
        
        System.out.println(sessionID + ". " + presenter + ", " + sessionName);

        //for (String s : info) {
        //    System.out.println(s);
        //}

    }

    public int getID() {
        return sessionID;
    }
}
