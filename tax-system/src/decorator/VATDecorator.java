package decorator;

import strategy.TaxStrategy;

public class VATDecorator extends TaxDecorator {
    private TaxStrategy tax;

    public VATDecorator(Product product, TaxStrategy tax) {
        super(product);
        this.tax = tax;
    }

    public double getPrice() {
        return product.getPrice() + tax.calculate(product.getPrice());
    }
}