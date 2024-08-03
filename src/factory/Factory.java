package factory;

// Product Interface
interface Product {
    void use();
}

// Concrete Product 1
class ConcreteProduct1 implements Product {
    @Override
    public void use() {
        System.out.println("Using Product 1");
    }
}

// Concrete Product 2
class ConcreteProduct2 implements Product {
    @Override
    public void use() {
        System.out.println("Using Product 2");
    }
}

// Creator Abstract Class
abstract class Creator {
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.use();
    }
}

// Concrete Creator 1
class ConcreteCreator1 extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}

// Concrete Creator 2
class ConcreteCreator2 extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
