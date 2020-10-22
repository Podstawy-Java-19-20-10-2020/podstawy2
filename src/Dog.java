public class Dog extends Pet {

    static public String cos;

    public Dog(String name, String race) {
        super(name, race);
        System.out.println("Konstruktor Psa !!");
    }

    public void szczekaj() {
        System.out.println("Szczekam !!");
    }
}
