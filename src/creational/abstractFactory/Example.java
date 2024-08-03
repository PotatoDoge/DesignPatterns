package creational.abstractFactory;

public class Example {
    public static void main(String[] args) {
        AbstractFactory modernFactory = new ModernFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn();
        modernSofa.lieOn();

        AbstractFactory victorianFactory = new VictorianFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.sitOn();
        victorianSofa.lieOn();
    }
}
