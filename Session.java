import java.util.ArrayList;
import java.util.Arrays;

public class Session {
    private String sessionName;
    public int sessionID;

    public String[] arrInfo = new String[11];

    public ArrayList<String> info;
    public ArrayList<Student> seminarPeople = new ArrayList<Student>();

    public Session(String information) {
        
        arrInfo = information.split(",");
        info = new ArrayList<String>(Arrays.asList(arrInfo));

        for (int i = 0; i < 8; i++) {
            info.remove(0);
        }
        

        for (String s : info) {
            //System.out.println(s);
        }

    }
}
