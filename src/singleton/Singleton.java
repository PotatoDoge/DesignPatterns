package singleton;

public class Singleton {

    // Private static instance of the same class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() { }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
