import adapter.PayPalAdapter;
import target.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new PayPalAdapter();
        payment.pay(100);
    }
}