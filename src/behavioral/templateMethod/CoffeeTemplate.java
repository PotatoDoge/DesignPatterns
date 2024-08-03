package behavioral.templateMethod;

// Abstract class defining the template method
abstract class CoffeeTemplate {
    // Template method
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    // Common steps
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brewCoffeeGrinds();
    protected abstract void addCondiments();
}

// Concrete class implementing the abstract methods
class Coffee extends CoffeeTemplate {
    @Override
    protected void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

// Concrete class implementing the abstract methods
class Tea extends CoffeeTemplate {
    @Override
    protected void brewCoffeeGrinds() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}