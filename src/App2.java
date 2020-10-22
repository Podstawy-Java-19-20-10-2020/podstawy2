public class App2 {
    public static void main(String[] args) {
        final int a = 5;

        final Dog dog = new Dog("Reksio", "Sznaucer");
        Dog dog1 = new Dog("asdf", "asdf");
        Dog dog2 = new Dog("asfgd", "asdffg");

        System.out.println(dog.getName());

        dog.setName("Max");

        System.out.println(dog.getName());

        int b = 10;

        int result = Maths.power(b);
        System.out.println(result);

        System.out.println(Maths.constant);

        System.out.println(dog.cos);
        System.out.println(dog1.cos);
        System.out.println(dog2.cos);

        dog.cos = "ABC";

        System.out.println(dog.cos);
        System.out.println(dog1.cos);
        System.out.println(dog2.cos);
    }
}
