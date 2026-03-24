package strategy;

public class ProcessingOrderStrategy implements OrderStateStrategy {
    @Override
    public void processOrder() {
        System.out.println("Đóng gói và vận chuyển đơn hàng...");
    }
}