package behavioral.templateMethod;

public class Example {
    public static void main(String[] args) {
        CoffeeTemplate coffee = new Coffee();
        coffee.makeCoffee();
        System.out.println("--------");
        CoffeeTemplate tea = new Tea();
        tea.makeCoffee();
    }
}
