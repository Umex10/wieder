package design.factory.deliverObjects;
import design.Delivery;

public class Schiff implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Deliver with Schiff.");
    }
}