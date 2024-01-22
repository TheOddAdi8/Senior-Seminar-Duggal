import java.util.ArrayList;

public class Student {

    private String email;
    private String name;
    private int[] choices = new int[5];

    public ArrayList<String[]> info = new ArrayList<String[]>();

    public Student(String information) {
        int index = info.size() - 1;

        info.add(information.split(","));
        email = info.get(index)[1];
        name = info.get(index)[3];
        /*
        for (int i = 0; i < 5; i++) {
            if (info.get(index)[i + 4].equals("Adventure Calls: The Benefits and Challenges of Study Abroad")) {
                choices[i] = 1;
            }
            else if (info.get(index)[i + 4].equals("")) {

            }
        }
        */

        for (int i = 0; i < 5; i++) {
            switch (info.get(index)[i + 4]) {
                case "Adventure Calls: The Benefits and Challenges of Study Abroad":
                    choices[i] = 1;
                    break;
                case "Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond":
                    choices[i] = 2;
                    break;
            }
        }
    }
    public String get(int arrListPos, int arrPos) {
        return info.get(arrListPos)[arrPos];
    }

    public String toString() {
        return name + ", " + email;
    }
}
