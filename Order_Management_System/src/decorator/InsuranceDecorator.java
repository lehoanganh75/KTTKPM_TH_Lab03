package decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderInterface order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + " + Bao hiem hang hoa";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 20.0; 
    }
}