package state;

public class CompletedState implements PaymentState {
    public void handle() {
        System.out.println("Thanh toán hoàn tất!");
    }
}