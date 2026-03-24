package observer;

public class Admin implements Observer {
    public void update(String status) {
        System.out.println("Admin nhận thông báo: " + status);
    }
}