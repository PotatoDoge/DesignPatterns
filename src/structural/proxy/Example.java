package structural.proxy;

public class Example {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded only when display() is called
        image1.display();
        image1.display(); // Image is already loaded, so display() is fast

        // Image will be loaded only when display() is called
        image2.display();
    }
}
