package state;

public class ProcessingOrder implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("[STATE] Dang xu ly: Dang dong goi va van chuyen... Chuyen sang da giao.");
        order.setState(new ShippedOrder());
    }
}