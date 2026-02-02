package design.factory.deliverObjects;
import design.Delivery;

public class Lkw implements Delivery {

    @Override
    public void deliver() {
        System.out.println("Deliver with Lkw.");
    }
}