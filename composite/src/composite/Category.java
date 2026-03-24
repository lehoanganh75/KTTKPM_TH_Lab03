package composite;

import component.ProductComponent;
import java.util.*;

public class Category implements ProductComponent {
    private List<ProductComponent> items = new ArrayList<>();

    public void add(ProductComponent item) {
        items.add(item);
    }

    public double getPrice() {
        double total = 0;
        for (ProductComponent item : items) {
            total += item.getPrice();
        }
        return total;
    }
}