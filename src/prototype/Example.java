package prototype;

public class Example {
    public static void main(String[] args) {
        // Creating a prototype instance
        ConcretePrototype prototype = new ConcretePrototype("Initial value");

        // Cloning the prototype
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

        // Displaying the cloned object
        System.out.println(clonedPrototype);
    }
}
