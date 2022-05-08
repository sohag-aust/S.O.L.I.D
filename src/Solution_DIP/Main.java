package Solution_DIP;

import Solution_DIP.interfaces.SmsProvider;
import Solution_DIP.models.Customer;
import Solution_DIP.models.ShoppingCart;
import Solution_DIP.services.CheckoutService;
import Solution_DIP.services.GpSmsService;
import Solution_DIP.services.RobiSmsService;
import Solution_DIP.services.SmsService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ashraful Islam", "01855667188");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

        SmsProvider smsProvider = new RobiSmsService();
//        SmsProvider smsProvider = new GpSmsService();
        SmsService smsService = new SmsService(smsProvider);

        CheckoutService checkoutService = new CheckoutService(smsService);
        checkoutService.checkout(shoppingCart);
    }
}
