public class Cat extends Pet {

    public Cat(String name, String race) {
        super(name, race);
        System.out.println("Konstruktor Kota !!");
    }

    public void miaucz() {
        System.out.println("Maiu Miau !!");
    }
}
