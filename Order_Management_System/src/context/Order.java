package context;

import strategy.OrderStateStrategy;

public class Order {
    private OrderStateStrategy state;

    public void setState(OrderStateStrategy state) {
        this.state = state;
    }

    public void process() {
        if (state == null) {
            System.out.println("Chưa thiết lập trạng thái!");
        } else {
            state.processOrder();
        }
    }
}