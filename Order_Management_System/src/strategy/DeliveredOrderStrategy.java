package strategy;

public class DeliveredOrderStrategy implements OrderStateStrategy {
    @Override
    public void processOrder() {
        System.out.println("Cập nhật trạng thái: Đã giao hàng.");
    }
}