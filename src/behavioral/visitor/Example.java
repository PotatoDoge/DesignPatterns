package behavioral.visitor;

public class Example {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}
