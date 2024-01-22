import java.util.ArrayList;

public class Student {

    private String email;
    private String name;
    private int[] choices = new int[5];

    public ArrayList<String[]> info = new ArrayList<String[]>();

    public Student(String[] information) {
        info.add(information);
        email = information[1];
        name = information[3];
    }
    public String get(int arrListPos, int arrPos) {
        return info.get(arrListPos)[arrPos];
    }

    public String toString() {
        return name + ", " + email;
    }
}
