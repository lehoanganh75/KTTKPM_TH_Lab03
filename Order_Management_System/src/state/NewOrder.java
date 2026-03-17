package state;

public class NewOrder implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("[STATE] Khoi tao: Dang kiem tra thong tin... Chuyen sang xu ly.");
        order.setState(new ProcessingOrder());
    }
}