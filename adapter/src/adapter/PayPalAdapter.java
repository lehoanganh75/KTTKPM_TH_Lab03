package adapter;

import target.Payment;
import adaptee.PayPalAPI;

public class PayPalAdapter implements Payment {
    private PayPalAPI api = new PayPalAPI();

    public void pay(int amount) {
        api.sendPayment(amount);
    }
}