package creational.abstractFactory;

// Abstract Factory
interface AbstractFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factory 1
class ModernFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Concrete Factory 2
class VictorianFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Abstract Products
interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}

// Concrete Products for Modern Style
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa");
    }
}

// Concrete Products for Victorian Style
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}
