package decorator;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    public double getAmount() {
        return payment.getAmount() - 10;
    }
}