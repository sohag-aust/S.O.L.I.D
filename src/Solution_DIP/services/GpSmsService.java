package Solution_DIP.services;

import Solution_DIP.interfaces.SmsProvider;

public class GpSmsService implements SmsProvider {
    @Override
    public void sendSms(String text, String phone) {
        System.out.println("Sending SMS via GP:");
        System.out.println("----> Receiver: " + phone);
        System.out.println("----> Text:\n" + text);
    }
}
