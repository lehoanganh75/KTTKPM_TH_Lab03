package state;

public class ShippedOrder implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("[STATE] Da giao: Cap nhat trang thai thanh cong. Ket thuc.");
    }
}