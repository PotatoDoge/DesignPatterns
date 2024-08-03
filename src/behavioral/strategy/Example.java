package behavioral.strategy;

public class Example {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9876"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PaypalStrategy("example@example.com"));
        cart.checkout(200);
    }
}
