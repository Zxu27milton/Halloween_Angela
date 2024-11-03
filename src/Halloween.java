public class Halloween {

    int year;
    int temperature;
    String name;

    public Halloween (){
        Candy Candy1;
        Candy1 = new Candy(true, 200, "Kitkat");
        Candy1.printInfo ();

        Student Student1;
        Student1 = new Student ("Yoyo", true, 160, "the Toilet Paper" );
        Student1.printInfo ();
    }

    public static void main(String[] args) {
        Halloween myHalloween;
        myHalloween= new Halloween ();
        myHalloween.name = "This year's Halloween";
        myHalloween.year = 2024;
        myHalloween.temperature = 20;
        System.out.println("\n" + myHalloween.name + ": \nYear: " + myHalloween.year + "\nTemperature: " + myHalloween.temperature);
    }
}
