public class Student {

    private String email;
    private String name;
    private int[] choices = new int[5];

    public String[] info = new String[15];

    public Student(String information) {

        info = information.split(",");
        name = info[3];
        email = info[1];


        for (int i = 0; i < 5; i++) {
            switch (info[i + 4]) {
                case "Adventure Calls: The Benefits and Challenges of Study Abroad":
                    choices[i] = 1;
                    break;
                case "Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond":
                    choices[i] = 2;
                    break;
                case "Business Clubs: Campus Involvement and Professional Development":
                    choices[i] = 3;
                    break;
                case "College Decisions: Choosing a Historically Black College over a Predominately White Institution":
                    choices[i] = 4;
                    break;
                case "Community Organizing and College: Participating in Your College?s Democracy":
                    choices[i] = 5;
                    break;
                case "Community Service and Volunteering: Making an Impact as a College Student":
                    choices[i] = 6;
                    break;
                case "Conquering the Concrete Jungle":
                    choices[i] = 7;
                    break;
                case "Co-Ops and Engineering Internships: Gaining Professional Experience":
                    choices[i] = 8;
                    break;
                case "Emergency Medical Technician: Working in the Back of an Ambulance":
                    choices[i] = 9;
                    break;
                case "Greek Life: From Animal House to Developing Tomorrow's Leaders":
                    choices[i] = 10;
                    break;
                case "Making an Impact: Being a Leader in Student Government":
                    choices[i] = 11;
                    break;
                case "On-Campus Recruiting and the Coveted Junior Year Internship in Finance":
                    choices[i] = 12;
                    break;
                case "So You Want to Play with Swords: Performance Martial Arts and Club Leadership":
                    choices[i] = 13;
                    break;
                case "The Ins and Outs of Engineering Internships":
                    choices[i] = 14;
                    break;
                case "The Road Less Traveled: Finding the Right Path for You":
                    choices[i] = 15;
                    break;
                case "Thriving in a Highly Competitive College Environment":
                    choices[i] = 16;
                    break;
                case "To Read or Not To Read? Interning in Publishing":
                    choices[i] = 17;
                    break;
                case "What Is Research When It's Not a Resume Builder?":
                    choices[i] = 18;
                    break;
                default:
                    choices[i] = 0;
            }
        }
    }
    public String get(int arrPos) {
        return info[arrPos];
    }

    public String toString() {
        return name + ", " + email + ", " + choices[0];
    }
}
