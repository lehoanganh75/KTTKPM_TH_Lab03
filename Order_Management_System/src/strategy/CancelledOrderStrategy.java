package strategy;

public class CancelledOrderStrategy implements OrderStateStrategy {
    @Override
    public void processOrder() {
        System.out.println("Hủy đơn và hoàn tiền cho khách.");
    }
}