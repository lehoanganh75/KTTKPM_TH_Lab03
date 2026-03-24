package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class Order {       // hoặc extends Subject nếu bạn dùng abstract Subject
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}