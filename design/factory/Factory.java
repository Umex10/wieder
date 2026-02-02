package design.factory;

import design.Delivery;
import design.factory.deliverObjects.Lkw;
import design.factory.deliverObjects.Schiff;

public class Factory {

    public static Delivery createInstance(String type) {
        if (type == null) return null;

        return switch (type.toUpperCase()) {
            case "ROAD" -> new Lkw();
            case "SEA" -> new Schiff();
            default -> throw new IllegalArgumentException("Unknown");
        };
    };
}