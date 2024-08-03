package observer;

public class Example {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setMessage("Hello, Observers!");

        subject.removeObserver(observer1);

        subject.setMessage("Observer 1 is removed!");
    }
}
