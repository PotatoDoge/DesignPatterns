package creational.factory;

public class Example {
    public static void main(String[] args) {
        Creator creator1 = new ConcreteCreator1();
        creator1.someOperation();

        Creator creator2 = new ConcreteCreator2();
        creator2.someOperation();
    }
}
