package state;

import decorator.*;

public class LuxuryState implements ProductState {
    public void apply(ProductContext context) {
        Product p = context.getProduct();
        p = new VATDecorator(p, new strategy.VATTax());
        p = new decorator.LuxuryDecorator(p, new strategy.LuxuryTax());
        context.setProduct(p);
    }
}