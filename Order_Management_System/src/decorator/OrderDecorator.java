package decorator;

public abstract class OrderDecorator implements OrderInterface {
    protected OrderInterface decoratedOrder;

    public OrderDecorator(OrderInterface order) {
        this.decoratedOrder = order;
    }

    public String getDescription() {
        return decoratedOrder.getDescription();
    }

    public double getCost() {
        return decoratedOrder.getCost();
    }
}