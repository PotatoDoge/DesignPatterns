package creational.prototype;

// Prototype Interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype Class
class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{field='" + field + "'}";
    }
}