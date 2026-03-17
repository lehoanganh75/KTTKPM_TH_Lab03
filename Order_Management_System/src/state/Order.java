package state;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrder();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void proceed() {
        state.handle(this);
    }

    public void cancel() {
        this.state = new CanceledOrder();
        this.state.handle(this);
    }
}