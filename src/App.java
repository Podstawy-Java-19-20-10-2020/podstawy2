public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Reksio", "Owczarek");
        //Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        dog.go();
        dog.eat();
        dog.szczekaj();

        Cat cat = new Cat("Kicia", "Bengalski");
        //Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        cat.go();
        cat.eat();
        cat.miaucz();

        Snake snake = new Snake("Janusz", "Kobra");
        System.out.println(snake.getName());
        snake.eat();
        snake.go();

        Snake snake2 = new Snake("Janusz", "Kobra");

        System.out.println(snake.equals(snake2));

        Algorithm algorithm = new AlgorithmRunner();

        algorithm.start();
        algorithm.loadData();

        Interface i = new ExampleClass();
        i.connect();

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.connect();
    }
}
