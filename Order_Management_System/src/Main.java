import java.util.Locale.Category;

import context.Order;
import subject.*;
import observer.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Order myOrder = new Order();
    
        // myOrder.proceed(); 
        // myOrder.proceed(); 
        // myOrder.proceed();


        // System.out.println("--- TESTING STATE PATTERN ---");
        // Order stateOrder = new Order();
        // stateOrder.proceed();

        // System.out.println("\n--- TESTING DECORATOR PATTERN ---");

        // OrderInterface myOrder = new BasicOrder();
        
        // myOrder = new GiftWrapDecorator(myOrder);
        
        // myOrder = new InsuranceDecorator(myOrder);
        
        // System.out.println("Noi dung: " + myOrder.getDescription());
        // System.out.println("Tong chi phi: " + myOrder.getCost());

        // Order order = new Order();

        // order.setState(new NewOrderStrategy());
        // order.process();

        // order.setState(new ProcessingOrderStrategy());
        // order.process();

        // order.setState(new DeliveredOrderStrategy());
        // order.process();

        // order.setState(new CancelledOrderStrategy());
        // order.process();

        Order order = new Order();

        order.addObserver(new Customer());
        order.addObserver(new Admin());

        order.setStatus("Đang xử lý");
        order.setStatus("Đã giao");
    }
}