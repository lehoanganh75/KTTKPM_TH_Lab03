import composite.Category;
import leaf.Product;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(100);
        Product p2 = new Product(200);

        Category category = new Category();
        category.add(p1);
        category.add(p2);

        System.out.println("Tổng giá: " + category.getPrice());
    }
}