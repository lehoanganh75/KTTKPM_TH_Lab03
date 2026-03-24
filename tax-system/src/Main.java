import decorator.*;
import state.*;

public class Main {
    public static void main(String[] args) {
        Product product = new BasicProduct(100);
        ProductContext context = new ProductContext(product);

        ProductState state = new LuxuryState();
        state.apply(context);

        System.out.println("Giá sau thuế: " + context.getProduct().getPrice());
    }
}