import observer.*;
import subject.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addObserver(new Customer());
        order.addObserver(new Admin());

        order.setStatus("Đang xử lý");
        order.setStatus("Đã giao");
    }
}