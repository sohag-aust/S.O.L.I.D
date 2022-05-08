package Solution_DIP.services;

import Solution_DIP.interfaces.SmsProvider;

public class SmsService {

    private final SmsProvider smsProvider;

    public SmsService(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public void sendSms(String text, String phone) {
        this.smsProvider.sendSms(text, phone);
    }
}
