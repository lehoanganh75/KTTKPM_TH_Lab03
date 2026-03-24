package decorator;

public class BasePayment implements Payment {
    private double amount;

    public BasePayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}