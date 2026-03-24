package state;

public interface ProductState {
    void apply(ProductContext context);
}