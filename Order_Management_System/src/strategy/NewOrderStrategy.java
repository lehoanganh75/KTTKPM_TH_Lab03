package strategy;

public class NewOrderStrategy implements OrderStateStrategy {
    @Override
    public void processOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng...");
    }
}