package state;

import decorator.Product;

public class ProductContext {
    private Product product;

    public ProductContext(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}