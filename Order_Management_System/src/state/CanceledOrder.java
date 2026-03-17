package state;

public class CanceledOrder implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("[STATE] Huy: Da huy don hang");
    }
}