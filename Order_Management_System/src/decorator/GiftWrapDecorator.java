package decorator;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(OrderInterface order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + " + Goi qua nghe thuat";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 10.0;
    }
}