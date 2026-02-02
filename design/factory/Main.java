package design.factory;

import design.Delivery;

public class Main {

    public static void main(String[] args) {

        Delivery d1 = Factory.createInstance("ROAD");
        d1.deliver();

        Delivery d2 = Factory.createInstance("SEA");
        d2.deliver();

}
}
