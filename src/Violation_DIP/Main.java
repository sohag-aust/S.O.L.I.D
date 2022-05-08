package Violation_DIP;

import Violation_DIP.models.Customer;
import Violation_DIP.models.ShoppingCart;
import Violation_DIP.services.CheckoutService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ashraful Islam", "01755667188");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(shoppingCart);
    }
}
