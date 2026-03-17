import decorator.*;

public class Main {
    public static void main(String[] args) {
        // Order myOrder = new Order();
    
        // myOrder.proceed(); 
        // myOrder.proceed(); 
        // myOrder.proceed();


        // System.out.println("--- TESTING STATE PATTERN ---");
        // Order stateOrder = new Order();
        // stateOrder.proceed();

        System.out.println("\n--- TESTING DECORATOR PATTERN ---");

        OrderInterface myOrder = new BasicOrder();
        
        myOrder = new GiftWrapDecorator(myOrder);
        
        myOrder = new InsuranceDecorator(myOrder);
        
        System.out.println("Noi dung: " + myOrder.getDescription());
        System.out.println("Tong chi phi: " + myOrder.getCost());
    }
}