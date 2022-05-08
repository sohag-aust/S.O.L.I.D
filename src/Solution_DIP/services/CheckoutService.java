package Solution_DIP.services;

import Solution_DIP.models.ShoppingCart;

public class CheckoutService {
    private final SmsService smsService;

    public CheckoutService(SmsService smsService) {
        this.smsService = smsService;
    }

    private void sendConfirmationSms(ShoppingCart shoppingCart) {
        final String message = "Thank you, " + shoppingCart.getCustomer().getFullName() + " for shopping at our store." +
                "\nYour order of total BDT " + shoppingCart.getTotalAmount() + " has been confirmed.";

        smsService.sendSms(message, shoppingCart.getCustomer().getPhoneNumber());
    }

    public void checkout(ShoppingCart shoppingCart) {
        // do some other stuff here
        System.out.println("Checking out " + shoppingCart.getCustomer().getFullName());
        // send sms
        sendConfirmationSms(shoppingCart);
    }
}
