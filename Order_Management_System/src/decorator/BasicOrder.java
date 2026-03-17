package decorator;

public class BasicOrder implements OrderInterface {
    @Override
    public String getDescription() {
        return "Don hang co ban";
    }

    @Override
    public double getCost() {
        return 100.0; 
    }
}