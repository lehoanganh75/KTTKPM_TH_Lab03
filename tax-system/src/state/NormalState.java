package state;

import decorator.*;

public class NormalState implements ProductState {
    public void apply(ProductContext context) {
        context.setProduct(
            new VATDecorator(context.getProduct(), new strategy.VATTax())
        );
    }
}