public class Pet {
    private String name;
    private String race;

    /*public Pet() {
        System.out.println("Konstruktor zwierzecia !!");
    }*/

    public Pet(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public void go() {
        System.out.println("Ide !!");
    }

    public void eat() {
        System.out.println("Jem !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
