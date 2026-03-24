package leaf;

import component.ProductComponent;

public class Product implements ProductComponent {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}