package composite;

public class Example {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        Component leaf3 = new Leaf();
        Composite composite2 = new Composite();
        composite2.add(leaf3);

        Composite root = new Composite();
        root.add(composite);
        root.add(composite2);

        root.operation();
    }
}
