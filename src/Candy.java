public class Candy {

    boolean isSour;
    int calories;
    String type;

    public Candy(boolean paramsour, int paramcalories, String paramtype) {
        isSour = paramsour;
        calories = paramcalories;
        type = paramtype;


    }

    public void printInfo() {
        System.out.println("\n" + type + ":");
        if (isSour == true) { //one equal sign is for assignment and two is for evaluation
            System.out.println("This candy is " + calories + " calories and is sour");
        } else {
            System.out.println("This candy is" + calories + " calories and is not sour");
        }
    }
}