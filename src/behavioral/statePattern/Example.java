package behavioral.statePattern;

public class Example {
    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();
    }
}
