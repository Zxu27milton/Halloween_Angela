public class Student {

    String name;
    boolean Miltonstudent;
    int age;
    String costume;

    public Student(String paramname, boolean parammilton, int paramage, String paramcostume) {
        name = paramname;
        Miltonstudent = parammilton;
        age = paramage;
        costume = paramcostume;


    }

    public void printInfo() {
        System.out.println("\n" + name + ":");
        if (Miltonstudent == true) { //one equal sign is for assignment and two is for evaluation
            System.out.println("This " + age + " year-old student is from Milton Academy and is dressing up as " +
                    costume + " this halloween");
        } else {
            System.out.println("This " + age + " year-old student is from Milton Academy and is dressing up as " +
                    costume + " this halloween");
        }
    }
}