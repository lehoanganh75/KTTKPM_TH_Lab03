package observer;

public class Customer implements Observer {
    public void update(String status) {
        System.out.println("Khách hàng nhận thông báo: " + status);
    }
}