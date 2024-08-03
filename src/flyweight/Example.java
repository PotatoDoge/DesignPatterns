package flyweight;

public class Example {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("State1");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("State2");

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("State3");

        System.out.println("Flyweight1 and Flyweight3 are the same instance: " + (flyweight1 == flyweight3));
    }
}
