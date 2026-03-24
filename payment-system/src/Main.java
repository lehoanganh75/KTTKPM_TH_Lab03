import decorator.*;
import state.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {

        Payment payment = new BasePayment(100);
        payment = new FeeDecorator(payment);
        payment = new DiscountDecorator(payment);

        PaymentStrategy strategy = new CreditCardPayment();
        strategy.pay(payment.getAmount());

        PaymentState state = new CompletedState();
        state.handle();
    }
}