public class Snake extends Pet {

    public Snake(String name, String race) {
        super(name, race);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Pelzam !!");
    }

    @Override
    public boolean equals(Object obj) {
        Snake snake = (Snake) obj;
        if(getName().equals(snake.getName()) && getRace().equals(snake.getRace())) {
            return true;
        } else {
            return false;
        }
    }
}
