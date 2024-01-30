public class Student {

    private String email;
    private String name;
    private int[] choices = new int[5];

    public String[] info = new String[9];

    public Student(String information) {

        info = information.split(",");
        name = info[1];
        email = info[0];

        for (int i = 0; i < 5; i++) {
            choices[i] = Integer.parseInt(info[i + 3]);
        }
    }
    public String getInfo(int arrPos) {
        return info[arrPos];
    }

    public int getChoices(int arrPos) {
        return choices[arrPos];
    }

    public int[] getAllChoices() {
        return choices;
    }

    public String toString() {
        return name + ", " + email + ", " + choices[0] + ", " + choices[1] + ", " + choices[2] + ", " + choices[3] + ", " + choices[4];
    }
}
